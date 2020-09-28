public class main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        /*create root*/
        tree.root = new Node<>("Kiki",null, null);
        Node<String>node2=new Node<>("Haku",null,null);
        Node<String> node3=new Node<>("San",null,null);
        Node<String> node4=new Node<>("Chihiro",null,null);
        Node<String> node5=new Node<>("Jiji",null,null);
        Node<String> node6=new Node<>("Ponyo",null,null);
        Node<String> node7=new Node<>("Satsuki",null,null);
        // following is the tree after above statement
        tree.root.setLeft(node2);
        tree.root.setLeft(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);
        node3.setLeft(node7);


    }
}