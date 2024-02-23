public class DyamicStack {
    int capacity = 2;
    int[] stackArr = new int[capacity];
        static int top = 0;
        public void insert(int num){
            if(size() == capacity){
                expand();
            }
            stackArr[top] = num;
            top++;
        }
        private void expand() {
            int length = size();
            int[] newStack = new int[capacity*2];
            System.arraycopy(stackArr, 0, newStack, 0, length);
            stackArr = newStack;
            capacity *= 2;
        }
        public void show(){
            for(int n:stackArr){
                System.out.print(n+" ");
            }
            System.out.println();
        }

        public int peek(){
            return stackArr[top-1];
        }
        public int size(){
            return top;
        }
        public int pop(){
            top--;
            int data = stackArr[top];
            stackArr[top] = 0;
            return data;
        }
        public boolean isEmpty(){
            if(top<=0){
                return true;
            }
            return false;
        }
}
