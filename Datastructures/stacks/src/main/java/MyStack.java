public class MyStack {

    /*
    * 用数组实现栈
    * */
    private static final int DEFAULT_CAPACITY = 10;

    private int maxSize;

    private int[] stackArray;

    private int top;

    /*
    * 无参构造默认栈的容量为10
    * */
    public MyStack() {
        this.maxSize = DEFAULT_CAPACITY;
        stackArray = new int[maxSize];
        top = -1;
    }

    /*
    * 有参构造栈的容量为传入的值
    * */
    public MyStack(int size) {
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    /*
    * 判断栈是否已经满了
    * */
    public boolean isFull() {
        return (top + 1 == maxSize);
    }

    /*
    * 判断栈是否为空
    * */
    public boolean isEmpty() {
        return (top == -1);
    }

    /*
    * 扩容
    * */
    public void reSize(int newSize) {
        //1. 创建一个大小为newSize的新数组
        int[] transferArr = new int[newSize];

        //2. 将原本底层数组的元素复制到新创建的transfer数组中
        for (int i = 0; i < stackArray.length; i ++)
            transferArr[i] = stackArray[i];

        //3. 将底层数组变成新创建的transfer数组
        stackArray = transferArr;

        //4. 将maxSize更新为新的数组大小
        maxSize = newSize;
    }

    /*
    * 将栈置空
    * */
    public void makeEmpty() {
        top = -1;
    }

    /*
    * 往栈内压入元素
    * */
    public void push(int val) {
        //1. 判断栈是否已经满了，没满的话将top指针向前移动一个单位，然后用val赋值
        if (!isFull()) {
            top ++;
            stackArray[top] = val;
        }
        //2. 如果栈已经满了，先执行扩容操作，将底层数组大小扩展为原来的2倍，再将val压入栈中
        else {
            reSize(maxSize * 2);
            push(val);
        }
    }

    /*
    * 将元素弹出栈
    * */
    public int pop() {
        //1. 先判断栈是否为空，不为空则直接弹出
        if (!isEmpty()) {
            return stackArray[top --];
        }

        //2. 如果栈为空，打印提示并返回-1
        else {
            System.out.println("栈已经为空!");
            return -1;
        }
    }

    /*
    * 返回栈顶元素
    * */
    public int peek() {
        //1. 判断栈是否为空，不为空直接返回数组中top下标的元素
        if (!isEmpty()) {
            return stackArray[top];
        }

        //2. 如果栈为空，打印提示并返回-1
        else {
            System.out.println("栈已经为空!");
            return -1;
        }
    }

    /*
    * 返回栈中元素的个数
    * */
    public int size() {
        if (!isEmpty())
            return top + 1;
        else
            return 0;
    }

    /*
    * 返回栈的容量
    * */
    public int capacity() {
        return maxSize;
    }
}
