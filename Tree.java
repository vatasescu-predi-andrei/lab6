public class Tree<T> {
    public Node root;

    //creating the root of the Binary tree
    public Tree( T data){
        root=new Node(data ,null ,null);
    }

    /**
     * Empty constructor for the root
     */
    public Tree(){
        root=null;
    }

    /**
     * This method sets the root
     * @param root
     */
    public void setRoot(Node root) {
        Node <String> node1 = new Node<String>("Kiki",null,null);
        this.root = root;
    }

    /**
     * This method gets the Root
     * @return
     */
    public Node getRoot() {
        return root;
    }
}

