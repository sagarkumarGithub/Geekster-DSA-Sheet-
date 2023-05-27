static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    
    if(head == null){
        head = node;
    }else{
        SinglyLinkedListNode tmp = head;
        while(tmp.next != null){
            tmp=tmp.next;
        }
        tmp.next=node;
    }
    return head;
}