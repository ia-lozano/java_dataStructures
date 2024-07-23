package queue;

public class Queue<E> {
    public static final int CAPACITY = 1000;

    private E[] data;

    private int size = 0;

    public Queue(){
        this.data = (E[]) new Object[this.CAPACITY];
    }

    /**
     * Return true if the Queue is empty
     * @return
     */
    public boolean isEmpty(){
        return(this.size == 0);
    }

    /**
     * Return Queue size
     * @return
     */
    public int size(){
        return(this.size);
    }

    /**
     * Add value to the top
     * @param value to push
     */
    public void push(E value){
        this.data[this.size] = value;
        this.size++;
    }

    /**
     * Get the first element and delete it
     * @return first element
     * @throws Exception
     */
    public E pop() throws Exception {
        E result = null;

        if (this.isEmpty()){
            throw new Exception("Empty Queue");
        }
        result = this.data[0];
        for(int i=0; i<this.size; i++){
            data[i]=data[i+1];
        }
        this.data[this.size] = null;
        this.size--;
        return result;
    }

    /**
     * Peek at the first element
     * @return first value
     * @throws Exception
     */
    public E peek() throws Exception {
        E result = null;

        if(this.isEmpty()){
            throw new Exception("Empty Queue");
        }

        result = this.data[0];
        return result;
    }

    public void show() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < this.size; i++) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}
