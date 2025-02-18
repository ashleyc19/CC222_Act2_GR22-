import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        LinkedList scannerLinkedList = new LinkedList();
        int[] array = new int[10];
        int arrayIndex = 0;

        while (true) {
            System.out.println("Enter number:");
            int num = scanner.nextInt();

        System.out.println("Operations:");
        System.out.println("1. Insert into Array");
            System.out.println("2. Insert into Linked List");
           int option = scanner.nextInt();

            if (option == 1) {
                if (arrayIndex < array.length) {
         array[arrayIndex] = num;
            arrayIndex++;
                    System.out.println("After insertion: " + java.util.Arrays.toString(array));
              } else {
                    System.out.println("Array is full");
                }
            } else if (option == 2) {
          System.out.println("Options:");
               System.out.println("1. Insert at Beginning");
             System.out.println("2. Insert at End");
                int LinkedListOption = scanner.nextInt();

                if (LinkedListOption == 1) {
                 scannerLinkedList.insertAtBeginning(num);
          System.out.println("After insertion:");
                    scannerLinkedList.display();
                } else if (LinkedListOption == 2) {
                    scannerLinkedList.insertAtEnd(num);
             System.out.println("After insertion:");
                    scannerLinkedList.display();
                }
            }

            System.out.println("Options:");
            System.out.println("1. Enter new value");
            System.out.println("2. End");
            int endOption = scanner.nextInt();

            if (endOption == 2) {
                break;
            }
        }
    }
}


