public class SwapUtil {

    /*
    * swap：交换数组中元素
    * */

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
