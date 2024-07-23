import linkedList.List;
import stack.Stack;
import queue.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        /**
         * List....
         */
        //Creating List
        List<Integer> list = new List<>();

        // Insert at first position
        list.insertAtFirstPosition(3);
        list.insertAtFirstPosition(2);
        list.insertAtFirstPosition(4);
        System.out.println("List after inserting at first: " + list);

        // Insert at last position
        list.insertAtLastPosition(7);
        list.insertAtLastPosition(5);

        //Find a node
        System.out.println(list.find(3));
        System.out.println(list.find(5));

        //Showing list before deleting
        System.out.println("List before using delete()");
        list.show();

        //Delete a node
        list.delete(3);

        //Showing list after 1st delete
        System.out.println("First delete()");
        list.show();

        //Deleting another Node
        list.delete(1);

        //Showing list after 2md delete
        System.out.println("Second delete()");
        list.show();

        /**
         * Stack...
         */
        Stack<Integer> stack = new Stack<>();

        //Pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.show();

        // Popping elements
        stack.pop();
        stack.pop();

        stack.show();
        stack.peek();

        /**
         * Queue...
         */
        Queue<Integer> queue = new Queue<>();

        System.out.println("Showing Queue");

        //Pushing elements
        queue.push(1);
        queue.push(2);
        queue.push(3);

        queue.show();

        //Popping elements
        queue.pop();
        queue.pop();

        System.out.println("Showing Queue again");
        queue.show();

    }
}
