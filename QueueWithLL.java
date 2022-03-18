public class QueueWithLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    Node front;
    Node rear;

    //check queue is empty or not
    public boolean isEmpty(){
        return (rear == null && front == null);
    }

    //insert at rear -------------------------------
    public void Enqueue(int data){
        Node newnode = new Node(data);
        System.out.println(data);
        if (isEmpty()){
            front = rear = newnode;
        }
        else {
            rear.next = newnode;
            rear = newnode;//or rear = rear.next
        }
    }

    //--------------------------------------remove at front
    public  void dequeue(){
        if (isEmpty()){
            System.out.println("queue underflow");
        }
            Node temp = front;
            System.out.println("remove element is: "+temp.data);
            front = front.next;
        if (front == null){
            rear = null;
        }
        return;
    }

    public static void main(String[] args) {
        QueueWithLL list = new QueueWithLL();

        list.Enqueue(15);
        list.Enqueue(20);
        list.Enqueue(14);
        list.Enqueue(3);
        list.dequeue();

        System.out.println("front element is: "+list.front.data+" ");
        System.out.println("rear element is: "+list.rear.data+" ");


        if (list.isEmpty()){
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}
