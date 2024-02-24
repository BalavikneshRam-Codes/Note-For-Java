public class BinaryTree {
    public static void main(String agrs[]){
    binaryTreeFuc bt = new binaryTreeFuc();
    bt.insert(8);
    bt.insert(7);
    bt.insert(12);
    bt.insert(15);
    bt.insert(2);
    bt.insert(5);

    bt.InOrder();
    System.out.println("------------");
    bt.postOrder();
    System.out.println("------------");
    bt.preOrder();

    }
}
