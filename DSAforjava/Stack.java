public class Stack {
    public static void main(String args[]){
        stack1 stack = new stack1();
        stack.insert(15);
        stack.insert(8);
        stack.insert(10);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println("Stack Size : "+stack.size());
        System.out.println("Stack isEmpty : "+stack.isEmpty());
        stack.show();

        System.out.println("-------------------------------------------------------------------------------");
        DyamicStack dstack = new DyamicStack();
        dstack.insert(15);
        dstack.show();
        dstack.insert(8);
        dstack.show();
        dstack.insert(10);
        dstack.show();



    }
}
