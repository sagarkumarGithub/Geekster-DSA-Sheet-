public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    // Write your code here
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        
        for(int i=0; i<position-1; i++){
            curr = curr.next;
        }
        
        SinglyLinkedListNode save = curr.next;
        curr.next=temp;
        temp.next=save;
        return head;
    }
