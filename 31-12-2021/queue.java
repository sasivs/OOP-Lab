import queues.queue_i;
public class queue implements queue_i {
    int [] arr = new int[size];
    int front;
    int rear;
    queue(){
        front=rear=-1;
    }
    public void enqueue(int key){
        if(front==(rear+1)%size){return;}
        rear=(rear+1)%size;
        arr[rear]=key;
        if(front==-1){
            front=(front+1)%size;
        }
        return;
    }
    public int dequeue(){
        if(front==-1){
            return -1;
        }
        int temp = arr[front];
        if(front==rear){
            front=rear=-1;
            return temp;
        }
        front=(front+1)%size;
        return temp;
    }
    public int front(){
        if(front==-1){
            return -1;
        }
        return arr[front];
    }
    public int rear(){
        if(rear==-1){return -1;}
        return arr[rear];
    }
}
