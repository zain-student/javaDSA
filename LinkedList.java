public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) {
        Node firstNode = new Node(6);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(9);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        // Printing the list
        Node currentNode = firstNode;
        while (currentNode != null) {
            System.out.println(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");

    }

}
