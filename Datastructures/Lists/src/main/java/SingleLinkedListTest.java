public class SingleLinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList  = new SingleLinkedList();

        for (int i = 1; i < 6; i ++)
            //尾插法
            singleLinkedList.insert(i);
        System.out.print("尾插法：");
        singleLinkedList.display();

        //清空链表
        singleLinkedList.clear();

        if (singleLinkedList.isEmpty())
            System.out.println("链表已被清空!");

        for (int j = 1; j < 6; j ++)
            //头插法
            singleLinkedList.insertHead(j);
        System.out.print("头插法：");
        singleLinkedList.display();

        //删除头节点
        singleLinkedList.deleteHead();
        System.out.print("删除头节点：");
        singleLinkedList.display();

        //删除尾节点
        singleLinkedList.delete();
        System.out.print("删除尾节点：");
        singleLinkedList.display();

        //删除pos为1的节点
        singleLinkedList.deleteTh(1);
        System.out.print("删除pos为1的节点：");
        singleLinkedList.display();

        //在pos为1的位置插入值为3的节点
        singleLinkedList.insertTh(3, 1);
        System.out.print("在pos为1的位置插入值为3的节点：");
        singleLinkedList.display();

        System.out.println("链表的长度为：" + singleLinkedList.size());
    }
}
