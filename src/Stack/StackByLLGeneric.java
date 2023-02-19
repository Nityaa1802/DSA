package Stack;

class Node<T>{
    T val;
    Node<T> next;

    Node(T val){
        this.val=val;
        next=null;
    }
}
public class StackByLLGeneric<T> {

    Node<T> head;

    public StackByLLGeneric(){
        head = null;
    }
    public void push(T element){
        if(head==null){
            head = new Node<T>(element);
        }
    }

}
