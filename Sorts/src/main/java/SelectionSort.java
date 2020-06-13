public class SelectionSort {

    /*
    * SelectionSort：选择排序
    * */

    public void sort(int[] arr) {
        SortsUtils sortsUtils = new SortsUtils();
        for (int i = 0; i < arr.length; i ++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            if (min != i)
                sortsUtils.swap(arr, min, i);
        }
    }

    public static void main(String[] args) {
        SortsUtils sortsUtils = new SortsUtils();
        int[] arr = {2, 4, 1, 3, 6, 5};
        sortsUtils.displayOrigin(arr);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.print("选择排序后数组元素为：");
        sortsUtils.display(arr);
    }
}
