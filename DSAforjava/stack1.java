public class stack1 {
        int[] stackArr = new int[3];
        static int top = 0;
        public void insert(int num){
            stackArr[top] = num;
            top++;
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
