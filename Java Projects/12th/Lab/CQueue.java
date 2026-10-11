import java.util.Scanner;
public class CQueue {
    static int[] q;
    static int front = -1, rear = -1, n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size N: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Input");
            sc.close(); return;
        }
        q = new int[n];
        int ch;
        do {
            System.out.print("\n1. Push\n2. Pop\n3. Display\n4. Exit\nEnter choice: ");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter value: ");
                push(sc.nextInt());
            } 
            else if (ch == 2)
                pop();
            else if (ch == 3)
                display();
        } while (ch < 3); sc.close();
    }
    static void push(int val) {
        if ((rear + 1) % n == front) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % n;
        q[rear] = val;
        System.out.println(val + " pushed.");
    }
    static void pop() {
        if (front == -1) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(q[front] + " popped.");
        if (front == rear) 
            front = rear = -1;
        else
            front = (front + 1) % n;
    }
    static void display() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(q[i] + " ");
            if (i == rear) break;
            i = (i + 1) % n;
        }
        System.out.println();
    }
}