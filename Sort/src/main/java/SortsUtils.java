public class SortsUtils {

    /*
    * swap：交换数组中元素
    * */

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    /*
    * display：展示数组中的元素
    * */
    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
