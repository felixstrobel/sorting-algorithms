package sortingalgorithms;

import base.SortingAlgorithm;

import java.util.ArrayList;

public class BubbleSort extends SortingAlgorithm {
    public BubbleSort(ArrayList<Integer> list) {
        super(list);
    }

    public BubbleSort(ArrayList<Integer> list, boolean reversed) {
        super(list, reversed);
    }

    public ArrayList<Integer> sort() {
        for (int i = super.list.size(); i > 0; i--) {
            for (int j = 0; j < super.list.size() - 1; j++) {
                if (super.reversed
                        ? (super.list.get(j) < super.list.get(j + 1))
                        : (super.list.get(j) > super.list.get(j + 1))
                ) super.swap(j, j + 1);
            }
        }

        return super.list;
    }
}
