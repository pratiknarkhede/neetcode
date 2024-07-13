package coreskills;


import java.util.ArrayList;



public class LinkedList {
    ListNode head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1; // Out of bounds
        }
        ListNode p = head;
        for (int count = 0; count < index; count++) {
            p = p.next;
        }
        return p.value;
    }

    public void insertHead(int val) {
        //while inserting new node , do not assume it to be created , create the new node first
        ListNode newNode = new ListNode(val, head);
        head = newNode;
        length++;
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
        length++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= length) {
            return false; // Index out of bounds
        }
        //if linked list is empty make the node as head
        if (index == 0) {
            head = head.next;
        } else {
            ListNode p = head;
            for (int count = 0; count < index - 1; count++) {
                p = p.next;
            }
            p.next = p.next.next;
        }
        length--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            //remember we are using add() here and not set() because initially list is empty
            values.add(p.value);
            p = p.next;
        }
        return values;
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
