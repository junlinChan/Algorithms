public class MergeSort {

    /*
    * MergeSort：归并排序
    * */

    public void sort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = l + r >> 1;
        int[] tmp = new int [arr.length];
        sort(arr, l, mid);
        sort(arr, mid + 1, r);

        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r)
            if (arr[i] < arr[j]) tmp[k ++ ] = arr[i ++ ];
            else tmp[k ++ ] = arr[j ++ ];

        while (i <= mid) tmp[k ++ ] = arr[i ++ ];
        while (j <= r) tmp[k ++ ] = arr[j ++ ];

        for (i = l, j = 0; i <= r; i ++, j ++ ) arr[i] = tmp[j];
    }

    public static void main(String[] args) {
        SortsUtils sortsUtils = new SortsUtils();
        int[] arr = {2, 4, 1, 3, 6, 5};
        sortsUtils.displayOrigin(arr);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        System.out.print("归并排序后数组元素为：");
        sortsUtils.display(arr);
    }

}
