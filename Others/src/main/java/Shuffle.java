import java.util.Random;

/*
* Shuffle洗牌算法（高纳德置乱算法）
* 原理：将最后一个数和前面n-1个数中的一个数进行交换，倒数第二个和前面n-2个数中的一个数进行交换，以此类推。
* */

public class Shuffle {

    public static void flush(int[] arr) {
        int length = arr.length;
        int index = length - 1;
        SortsUtils sortsUtils = new SortsUtils();
        for (int i = 0; i < length && index > 0; i ++) {
            int num = new Random().nextInt(index);
            sortsUtils.swap(arr, num, index);
            index --;
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i ++) {
            ints[i] = i + 1;
        }
        flush(ints);
        for (int t : ints) {
            System.out.print(t);
            System.out.print(" ");
        }
    }


}
