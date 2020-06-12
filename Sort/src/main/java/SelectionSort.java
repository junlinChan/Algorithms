public class SelectionSort {

    /*
    * SelectionSort：选择排序
    * */

    public void sort(int[] arr) {
        SwapUtil swapUtil = new SwapUtil();
        for (int i = 0; i < arr.length; i ++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            if (min != i)
                swapUtil.swap(arr, min, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 6, 5};
        SelectionSort selectionSort = new SelectionSort();
        DisplayUtil ds = new DisplayUtil();
        selectionSort.sort(arr);
        ds.display(arr);
    }
}
