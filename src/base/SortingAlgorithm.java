package base;

import java.util.ArrayList;

public class SortingAlgorithm {
    protected boolean reversed = false;
    protected final ArrayList<Integer> list;

    protected SortingAlgorithm(ArrayList<Integer> list) {
        this.list = list;
    }

    protected SortingAlgorithm(ArrayList<Integer> list, boolean reversed) {
        this.reversed = reversed;
        this.list = list;
    }

    protected void swap(int i, int j) {
        int a = this.list.get(i);
        int b = this.list.get(j);

        this.list.set(i, b);
        this.list.set(j, a);
    }
}
