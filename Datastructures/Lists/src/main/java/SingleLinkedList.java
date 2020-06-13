public class SingleLinkedList {

    //链表节点
    private Node head;

    //链表长度
    private int size;

    public SingleLinkedList() {
        head = new Node(0);
        size = 0;
    }

    public SingleLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    /*
    * 在指定位置插入元素
    * */
    public void insertTh(int val, int pos) {
        //1. 检测pos的合法性
        checkPos(pos, 0, size);
        //2. 用一个cur指针指向头节点
        Node cur = head;
        //3. 一直移动到pos前面的位置
        for (int i = 0; i < pos; i ++)
            cur = cur.next;
        //4. 创建一个值为val的新节点
        Node node = new Node(val);
        //5. 将该节点的next指针指向cur的next
        node.next = cur.next;
        //6. 将cur的next指向新建的节点
        cur.next = node;
        //7. 最后要将长度加1
        size ++;
    }

    /*
    * 检查pos的合法性
    * */
    private void checkPos(int pos, int low, int high) {
        if (pos > high || pos < low)
            throw new IndexOutOfBoundsException(pos + "");
    }

    /*
    * 头插法
    * */
    public void insertHead(int val) {
        // 将节点插入到pos为0的位置
        insertTh(val, 0);
    }

    /*
    * 尾插法
    * */
    public void insert(int val) {
        //将节点插入到链表末尾
        insertTh(val, size);
    }

    /*
    * 删除指定位置的节点
    * */
    public void deleteTh(int pos) {
        //1. 判断pos的合法性
        checkPos(pos, 0, size - 1);
        //2. 找到pos位置的前一个节点
        Node cur = head;
        for (int i = 0; i < pos; i ++)
            cur = cur.next;
        //3. 将需删除的前一个节点的next指向删除节点的下一个节点即可
        cur.next = cur.next.next;
        //4. 删除完之后size--；
        size --;
    }


    /*
    * 删除头节点
    * */
    public void deleteHead() {
        deleteTh(0);
    }

    /*
    * 删除尾节点
    * */
    public void delete() {
        deleteTh(size - 1);
    }

    /*
    * 判断链表是否为空
    * */
    public boolean isEmpty() {
        return size == 0;
    }

    /*
    * 链表长度
    * */
    public int size() {
        return size;
    }

    /*
    * 清空链表
    * */
    public void clear() {
        if (size == 0)
            return;
        Node pre = head.next;
        Node cur = pre.next;
        while (cur != null) {
            pre = null;
            pre = cur;
            cur = cur.next;
        }
        pre = null;
        head.next = null;
        size = 0;
    }

    /*
    * 打印链表
    * */
    public void display() {
        if (size == 0)
            System.out.println("链表为空!");
        Node cur = head.next;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null)
                System.out.print("->");
            cur = cur.next;
        }
        System.out.println();
    }
}

class Node {

    int val;

    Node next;

    Node() {

    }

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
