package linkedList;

public class Node<E> {
    public E data;
    public Node next;

    // Having two constructors allows for different ways to create an
    // instance of a 'Node' (constructor overloading)
    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(E data){
        this.data = data; // This node's next is null
    }
}