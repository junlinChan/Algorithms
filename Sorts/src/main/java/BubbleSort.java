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
        SortsUtils sortsUtils = new SortsUtils();
        int[] arr = {2, 4, 1, 3, 6, 5};
        sortsUtils.displayOrigin(arr);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.print("冒泡排序后数组元素为：");
        sortsUtils.display(arr);

    }
}
