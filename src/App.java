import java.util.ArrayList;
import java.util.List;

import strategyPattern.strategy.BubbleSort;
import strategyPattern.strategy.HeapSort;



public class App {

    public static void main(String[] args) {
        System.out.println("-- Creation of list for bubble sort --");
        List<Integer> listBubble = new ArrayList<Integer>();
        listBubble.add(5);
        listBubble.add(4);
        listBubble.add(2);
        listBubble.add(3);
        listBubble.add(1);
        listBubble.add(3);
        
        System.out.println("-- Bubble sort list --");
        Context contextBubble = new Context(new BubbleSort());
        contextBubble.executeSort(listBubble);
        for(Integer number : listBubble){
            System.out.println(number);
        }
        
        System.out.println("-- Creation of list for heap sort --");
        List<Integer> listHeap = new ArrayList<Integer>();
        listHeap.add(5);
        listHeap.add(4);
        listHeap.add(2);
        listHeap.add(2);
        listHeap.add(1);
        listHeap.add(3);
        
        System.out.println("-- Heap sort list --");
        Context contextHeap = new Context(new HeapSort());
        contextHeap.executeSort(listHeap);
        for(Integer number : listHeap){
            System.out.println(number);
        }
        
        

    }

}
