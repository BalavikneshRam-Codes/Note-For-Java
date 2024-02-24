public class binaryTreeFuc {
        Node root = null;
        public void insert(int data){
            root = insertRec(root, data);
            
        }
        private Node insertRec(Node root,int data){
            if(root == null){
                root = new Node(data);
            }else if(data < root.data){
               root.left =  insertRec(root.left, data);
            }else if(data > root.data){
                root.right = insertRec(root.left, data);
            }
        return root;
            
        }
        public void InOrder(){
            inOrderRec(root);
        }
        private void inOrderRec(Node root){
            if(root != null){
                inOrderRec(root.left);
                System.out.print(root.data+" ");
                inOrderRec(root.right);
            }
        }
        public void postOrder(){
            PostOrderRec(root);
        }
        private void PostOrderRec(Node root){
            if(root != null){
                PostOrderRec(root.left);
                PostOrderRec(root.right);
                System.out.print(root.data+" ");
            }
        }
        public void preOrder(){
            preOrderRec(root);
        }
        private void preOrderRec(Node root){
            if(root != null){
                System.out.print(root.data+" ");
                preOrderRec(root.left);
                preOrderRec(root.right);

            }
        }
    }
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    
}
