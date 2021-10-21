package sortingalgorithms;

import base.SortingAlgorithm;

import java.util.ArrayList;

public class InsertionSort extends SortingAlgorithm {
    public InsertionSort(ArrayList<Integer> list) {
        super(list);
    }

    public InsertionSort(ArrayList<Integer> list, boolean reversed) {
        super(list, reversed);
    }

    public ArrayList<Integer> sort() {
        for (int i = 0; i < super.list.size(); i++) {
            int w = super.list.get(i);
            int j = i;

            while ((j > 0) && (reversed
                    ? super.list.get(j - 1) < w
                    : super.list.get(j - 1) > w)
            ) {
                super.list.set(j, super.list.get(j - 1));
                j--;
            }

            super.list.set(j, w);
        }

        return super.list;
    }
}
