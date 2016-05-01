package strategyPattern.strategy;

import java.util.List;

/**
 * Implementation of heap sort
 * 
 * http://www.sanfoundry.com/java-program-implement-heap-sort/
 *
 */

public class HeapSort implements SortAlgorithm {

    private static int N;

    @Override
    public void sort(List<Integer> unsorted) {
        heapify(unsorted);

        for (int i = N; i > 0; i--)

        {

            swap(unsorted, 0, i);

            N = N - 1;

            maxheap(unsorted, 0);

        }
    }

    /* Function to build a heap */

    public static void heapify(List<Integer> unsorted)

    {

        N = unsorted.size() - 1;

        for (int i = N / 2; i >= 0; i--)

            maxheap(unsorted, i);

    }

    /* Function to swap largest element in heap */

    public static void maxheap(List<Integer> unsorted, int i)

    {

        int left = 2 * i;

        int right = 2 * i + 1;

        int max = i;

        if (left <= N && unsorted.get(left) > unsorted.get(i))

            max = left;

        if (right <= N && unsorted.get(right) > unsorted.get(max))

            max = right;

        if (max != i)

        {

            swap(unsorted, i, max);

            maxheap(unsorted, max);

        }

    }

    /* Function to swap two numbers in an array */

    public static void swap(List<Integer> unsorted, int i, int j)

    {

        int tmp = unsorted.get(i);
        unsorted.set(i, unsorted.get(j));
        unsorted.set(j, tmp);

    }

}
