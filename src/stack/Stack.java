package stack;

public class Stack<E> {
    //Stack capacity
    public static final int CAPACITY = 1000;

    //Storing values
    private E[] data;

    //Number of elements in the stack
    private int size = 0;

    //Create a new Stack object
    public Stack() {
        this.data = (E[]) new Object[this.CAPACITY];
    }

    /**
     * Return true if the stack is empty
     * @return
     */
    public boolean isEmpty(){
        return (this.size == 0);
    }

    /**
     * Return the stack size
     * @return
     */
    public int size(){
        return (this.size);
    }

    /**
     * Add an element to the top
     * @param
     */
    public void push(E value){
        //add the corresponding value to the top
        this.data[this.size] = value;

        //increase the size
        this.size++;
    }

    /**
     * Get the top item and delete it
     * @return
     * @throws
     */
    public E pop() throws Exception{
        E result = null;
        // if the stack is empty, return an error
        if (this.isEmpty()){
           throw new Exception("Stack is empty");
        }
        this.size--;
        result = this.data[this.size];
        this.data[this.size] = null;
        return result;
    }

    public E peek() throws Exception{
        E result = null;
        // throw exception if the stack is empty
        if (this.isEmpty()){
            throw new Exception("Stack is empty");
        }
        result = this.data[this.size];
        return result;
    }

    public void show() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            // Print elements from top to bottom
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

}
