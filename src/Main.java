import sortingalgorithms.BubbleSort;
import sortingalgorithms.InsertionSort;
import sortingalgorithms.MergeSort;
import sortingalgorithms.QuickSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>(List.of(3, 6, 48, 2, 6, 3, 7, 9, 3, 2, 47, 7, 3, 2, 54));

        // BubbleSort Algorithm: O(n²)
        System.out.println(new BubbleSort(list).sort().toString());
        System.out.println(new BubbleSort(list, true).sort().toString());

        // QuickSort Algorithm: O(log(n))
        System.out.println(new QuickSort(list).sort().toString());// not working
        System.out.println(new QuickSort(list,true).sort().toString());

        // MergeSort Algorithm: O(n * log(n))
        System.out.println(new MergeSort(list).sort().toString()); // not working
        System.out.println(new MergeSort(list,true).sort().toString()); // not working

        // InsertionSort: O(n)
        System.out.println(new InsertionSort(list).sort().toString());
        System.out.println(new InsertionSort(list,true).sort().toString());





//        Selection Sort.
//        Heap Sort.
    }
}
