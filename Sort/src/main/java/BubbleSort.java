public class BubbleSort{

    /*
    * BubbleSort：冒泡排序
    * */

    public void sort(int[] arr) {
        SortsUtils sortsUtils = new SortsUtils();
        for (int i = 0; i < arr.length; i ++) {
            boolean swaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sortsUtils.swap(arr, j, j + 1);
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
        //return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 6, 5};
        BubbleSort bubbleSort = new BubbleSort();
        SortsUtils sortsUtils = new SortsUtils();
        bubbleSort.sort(arr);
        sortsUtils.display(arr);

    }
}
