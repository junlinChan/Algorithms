public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for (int i = 1; i < 6; i ++)
            myStack.push(i);
        System.out.println("栈的元素个数为：" + myStack.size());
        System.out.println("栈的容量为：" + myStack.capacity());
        System.out.println("栈顶元素为：" + myStack.peek());
        System.out.print("弹出栈的元素：");
        while (myStack.size() != 0)
            System.out.print(myStack.pop() + " ");
        System.out.println();

        //构造指定容量的栈
        MyStack myStack1 = new MyStack(5);
        System.out.println("指定容量的栈的容量为：" + myStack1.capacity());
        //压入个数超过指定容量大小的元素
        for (int j = 1; j <= 6; j ++)
            myStack1.push(j);
        System.out.println("扩容后栈的容量为：" + myStack1.capacity());
        System.out.println("栈的元素个数：" + myStack1.size());
    }
}
