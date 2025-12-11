class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}

class ListNode
{
    Node head;
    public void insert(int val)
    {
        Node n=new Node(val);
        if(head==null)
        {
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        
    }
}


class LinkedList_Implementation {
    public static void main(String[] args) {
        ListNode l=new ListNode();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.insert(60);
        l.display();
    }
}