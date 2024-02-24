public class LinkedList {
    public static void main(String args[]){
        LLinkedList list = new LLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insertAtStart(0);
        list.insertAt(1, 11);
        list.delete(1);
        list.show();
    }
    public static class LLinkedList {
        static Node head;
        public void insert(int data){
            Node node = new Node();
            node.data = data;
            node.next = null;
    
    
            if(head == null){
                head = node;
            }else{
                Node n = head;
                while(n.next != null){
                    n = n.next;
                }
                n.next = node;
            }
        }
    
        public void show(){
            Node node = head;
            while(node.next != null){
                System.out.println(node.data);
                node = node.next;
            }
            System.out.print(node.data);
        }

        public void insertAtStart(int data){
            Node node = new Node();
            node.data = data;
            node.next = null;

            node.next = head;
            head = node;
        }
        public void insertAt(int index,int data){
            Node node = new Node();
            node.data = data;
            node.next = null;

            if(index == 0){
                insertAtStart(data);
            }else{
            Node n = head;
            for(int i = 0;i<index - 1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        }

        public void delete(int index){
            if(index == 0){
                head = head.next;
            }else{
                Node n = head;
                Node n1= null;
                int i =0;
                for(;i<index - 1;i++){
                    n = n.next;
                }
                n1 = n.next;
                n.next = n1.next;
                System.out.println("Deleted Sucessfully..."+n1.data);
            }
        }
    }
    public static class Node{
        int data;
        Node next;
    }
    
}
