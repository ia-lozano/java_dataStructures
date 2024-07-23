package linkedList;

public class List <E> {
    Node<E> firstNode;

    /**
     * Constructors
     **/

    public List() {
        this.firstNode = null;
    }

    public List(Node firstNode) {
        this.firstNode = firstNode;
    }

    /**
     * Setters & getters
     */
    public Node getFirst() {
        return firstNode;
    }

    /**
     * Insert Value at first position
     *
     * @param value
     */
    public void insertAtFirstPosition(int value) {
        Node nodeToInsert = new Node(value);
        nodeToInsert.next = firstNode;
        firstNode = nodeToInsert;
    }

    /**
     * Override toString() to show the list
     * @return String representation of the list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = this.firstNode;
        while (currentNode != null) {
            sb.append(currentNode.data).append(" ");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }

    // Showing whole list
    public void show() {
        Node currentNode = this.firstNode;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    /**
     * Insert value at last position
     *
     * @param value
     */
    public void insertAtLastPosition(int value) {
        Node nodeToInsert = new Node(value);
        if (this.isEmpty()) {
            this.insertAtFirstPosition(value);
        } else {
            Node currentNode = firstNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = nodeToInsert;
        }
    }

    /**
     * Check if the list is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return (this.firstNode == null);
    }

    /**
     * Find a node with a specific value
     *
     * @param value
     * @return Node
     */
    public Node find(int value) {
        Node result = null; // Node to return
        Node currentNode = this.firstNode;
        boolean found = false;

        while (currentNode != null && !found) {
            if (Integer.valueOf(value).equals(currentNode.data)) {
                found = true;
                result = currentNode;
            }
            currentNode = currentNode.next;
        }
        return result;

    }

    /**
     * Delete a node according to its position
     * @param position
     * @throws Exception
     */
    public void delete(int position) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("The list is empty");
        }

        if (position == 1) {
            // Remove the first node
            firstNode = firstNode.next;
        } else {
            Node<E> currentNode = firstNode;
            // Traverse to the node before the one to be deleted
            for (int i = 1; i < position - 1; i++) {
                if (currentNode == null || currentNode.next == null) {
                    throw new Exception("Invalid position");
                }
                currentNode = currentNode.next;
            }

            // Check if the node to delete exists
            if (currentNode.next == null) {
                throw new Exception("Invalid position");
            }

            // Remove the node
            currentNode.next = currentNode.next.next;
        }
    }

}
