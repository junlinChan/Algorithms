public class InsertionSort {

    /*
    * InsertionSort：插入排序
    * */
    public void sort(int[] arr) {
        int j, tmp;
        for (int i = 1; i < arr.length; i ++) {
            if (arr[i] < arr[i - 1]) {
                tmp = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > tmp; j --) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        SortsUtils sortsUtils = new SortsUtils();
        int[] arr = {2, 4, 1, 3, 6, 5};
        sortsUtils.displayOrigin(arr);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.print("插入排序后数组元素为：");
        sortsUtils.display(arr);
    }

}
