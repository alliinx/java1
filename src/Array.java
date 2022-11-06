public class Array <T>{
class Node{
    T data;
    Node next;

    Node(T elem){
        data=elem;
        next=null;
    }
}

private Node head;
private Node tail;
private int amount_of_elem;

Array(){
    this.head=null;
    this.tail=null;
    this.amount_of_elem=0;
}

void add(T element){

    Node p=new Node(element);

    if(this.head==null){
        this.head=p;
        this.tail=head;
    }
    else{
        this.tail.next=p;
        this.tail=p;
    }

    this.amount_of_elem++;
}

public int capacity(){
    return amount_of_elem;
}

T getByIndex(int index){
    if(index<this.amount_of_elem) {
        Node pHead = this.head;
        for (int i = 0; i <index; i++) {
            pHead = pHead.next;
        }
        return pHead.data;
    }
    else throw new IndexOutOfBoundsException ( );
}

void remove(int index){
    if(index<this.amount_of_elem)
    {
        this.amount_of_elem--;
        if(index==0)
            this.head=this.head.next;
        else
        {
            Node pHead = this.head.next;
            Node pHeadPrev=this.head;
            for (int i = 1; i < index; i++) {
                pHead = pHead.next;
                pHeadPrev=pHeadPrev.next;
            }
            if(pHead==this.tail)
            {
                pHeadPrev.next=null;
                this.tail=pHeadPrev;
            }
            else
            {
                pHeadPrev.next= pHead.next;
            }
        }
    }
    else throw new IndexOutOfBoundsException ( );
}
}
