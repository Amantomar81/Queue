//Queue with array
public class QueuewithArray {
    int arr[];
    int front;
    int rear;
    public QueuewithArray(int size)
    {
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public Boolean isempty(){
        if (front == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean isfull()
    {
        if(rear == arr.length){
            return true;
        }
        else {
            return false;
        }
    }
    public void enqueue(int value)
    {
        if (isfull()){
            System.out.println("Array is full");
        }
        else if (isempty()){
            front =0;
            rear = rear+1;
            arr[rear] = value;
        }
        else {
            rear++;
            arr[rear] = value;
        }
    }
    public void dequeue(){
        if (isempty()){
            System.out.println("Array is empty");
        }
        else
        {
            System.out.println(arr[front]);
            front++;
        }
        if (front == rear)
        {
            front = rear = -1;
        }
    }
    public void display(){
        int i;
        if (front == rear){
            System.out.println("empty");
            return;
        }
        for (i = front; i <rear ; i++) {
            System.out.print(arr[i]+" ");
        }
        return;
    }

    public static void main(String[] args) {
        QueuewithArray obj = new QueuewithArray(5);
        int value;
        obj.enqueue(20);
        obj.enqueue(10);
        obj.enqueue(5);
        obj.enqueue(4);
        obj.display();
        System.out.println("\nremove element :");
        obj.dequeue();
       obj.display();

    }
}
