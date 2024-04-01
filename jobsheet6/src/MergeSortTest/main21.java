package MergeSortTest;

public class main21 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting21 mSort = new MergeSorting21();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
