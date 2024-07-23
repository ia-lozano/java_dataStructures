package stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class fixedSizeStack {
    public static void main(String[] args){
        Stack<Integer> myStack = new Stack();
        int size = 0;
        int currentData = 0; // current Node value
        size = Integer.parseInt(
                JOptionPane.showInputDialog("How many elements do you need to add?"));
        for (int i=0; i<size; i++){
            currentData = Integer.parseInt(
                    JOptionPane.showInputDialog("Insert element " + (i+1)));
            myStack.push(currentData);
        }

        // Show list
        System.out.println("Stack elements: ");
        myStack.show();
        try {
            myStack.pop();
        } catch (Exception ex){
            Logger.getLogger(fixedSizeStack.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Show list
        System.out.println("Stack elements: ");
        myStack.show();
        // Show list (again......)
        try{
            myStack.pop();
        } catch (Exception ex){
            Logger.getLogger(fixedSizeStack.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Stack elements: ");
        myStack.show();
    }
}
