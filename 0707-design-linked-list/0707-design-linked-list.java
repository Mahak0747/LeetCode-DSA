class MyLinkedList {

    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    int size=0;

    public MyLinkedList() {        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size)
            return -1;
        Node temp=head;
        int idx=0;
        while(idx!=index){
            temp=temp.next;
            idx++;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if (head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;        
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if (head==null){
            head=tail=newNode;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;        
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;

        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;  // update tail if list becomes empty
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            // temp is at (index - 1)
            temp.next = temp.next.next;
            if (index == size - 1) {
                tail = temp; // update tail if last node was removed
            }
        }

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */