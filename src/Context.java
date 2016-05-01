import java.util.List;

import strategyPattern.strategy.SortAlgorithm;



public class Context {
    
    private SortAlgorithm sortAlgorithm;

    /**
     * @param sortAlgorithm
     */
    public Context(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }
    
    public void executeSort(List<Integer> unsorted){
        sortAlgorithm.sort(unsorted);
    }

}
