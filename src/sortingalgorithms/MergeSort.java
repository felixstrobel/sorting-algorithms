package sortingalgorithms;

import base.SortingAlgorithm;

import java.util.ArrayList;

public class MergeSort extends SortingAlgorithm {
    public MergeSort(ArrayList<Integer> list) {
        super(list);
    }

    public MergeSort(ArrayList<Integer> list, boolean reversed) {
        super(list, reversed);
    }

    private void mergesort(){
        if (super.list.size() <= 1) return;

        int h = super.list.size() / 2;

    }

    public ArrayList<Integer> sort(){
        return new ArrayList<Integer>();
    }
}
