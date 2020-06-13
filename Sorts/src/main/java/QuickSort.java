public class QuickSort{

    /*
    * QuickSort：快速排序
    * */

    public void sort(int[] arr, int l, int r) {
        SortsUtils swapUtils = new SortsUtils();
        int i = l - 1, j = r + 1, x = arr[l + r >> 1];
        if (l >= r)
            return;
        while (i < j) {
            do i ++; while (arr[i] < x);
            do j --; while (arr[j] > x);
            if (i < j)
                swapUtils.swap(arr, i, j);
        }
        sort(arr, l, j);
        sort(arr, j + 1, r);
    }


    public static void main(String[] args) {
        SortsUtils sortsUtils = new SortsUtils();
        int[] arr = {2, 4, 1, 3, 6, 5};
        sortsUtils.displayOrigin(arr);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.print("快速排序后数组元素为：");
        sortsUtils.display(arr);
    }

}
