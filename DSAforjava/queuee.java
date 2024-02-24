public class queuee {
    int capacity = 4;
    int queue[] = new int[capacity];
     int top;
     int rear;
     int size;
    public  void  enqueue(int data){
        queue[rear] = data;
        rear = (rear+1)%capacity;
        size++;
    }
    public void show(){
        for(int i = 0;i<size;i++){
            System.out.print(queue[(top+i)%capacity]+" ");
        }
        System.out.println();
        for(int i:queue){
            System.out.print(i+" ");
        }
    }
    public  int dequeue(){
        int data = queue[top];
        queue[top] = 0;
        top = (top+ 1)%capacity;
        size--;
        return data;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return capacity == size;
    }
}
