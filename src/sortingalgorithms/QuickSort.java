package sortingalgorithms;

import base.SortingAlgorithm;

import java.util.ArrayList;

public class QuickSort extends SortingAlgorithm {
    public QuickSort(ArrayList<Integer> list) {
        super(list);
    }

    public QuickSort(ArrayList<Integer> list, boolean reversed) {
        super(list, reversed);
    }

    private void quicksort(int l, int r) {
        if (l >= r) return;

        int p = this.partition(l, r);

        this.quicksort(l, p - 1);
        this.quicksort(p + 1, r);
    }

    private int partition(int l, int r) {
        int p = super.list.get(r);

        int i = l;
        int j = r - 1;

        while (i < j) {
            while (super.list.get(i) < p) i++;

            while (j > l && super.list.get(i) >= p) j--;

            if (i < j) {
                super.swap(i, j);
                i++;
                j--;
            }
        }

        if (i == j && super.list.get(i) < p) i++;

        if (super.list.get(i) != p) super.swap(i, r);

        return i;
    }

    public ArrayList<Integer> sort() {
        this.quicksort(super.list.get(0), super.list.get(super.list.size() - 1));

        return super.list;
    }
}
