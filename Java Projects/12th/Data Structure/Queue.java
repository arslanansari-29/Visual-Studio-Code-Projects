import java.util.Scanner;

public class Queue {
    int Que[];
    int front;
    int rear;
    int size;
    Queue(int mm) {
        size = mm;
        Que = new int[size];
        front = -1;
        rear = -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    int item = sc.nextInt();
                    q.insert(item);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }
    void insert(int item) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1)
            front = 0;
        rear++;
        Que[rear] = item;
    }
    void delete() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        front++;
        if (front > rear)
            front = rear = -1;
    }
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Que[i] + " ");
        System.out.println();
    }
}
