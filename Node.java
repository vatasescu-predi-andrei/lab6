public class Node<T> extends Tree{
    private Node<T> c0;
    private Node<T> C1;
    private Node<T> c2;
    private Node<T> C3;
    private Node<T> c4;
    private T data;

    public Node<T> next;

    /**
     *
     * @param data the element that is in the node
     * @param left the left child of the node
     * @param right the right child of the node
     */
    public Node(T data, Node[] array = new Node[5];){
        //Assign data to the new node, set children to null
        setElement(data);
    }

    /**
     * This method return the left child of the node
     * @return left
     */
    public Node<T> getLeft() {
        return left;
    }

    /**
     * This method returns the right child of the node
     * @return right
     */
    public Node<T> getRight() {
        return right;
    }

    /**
     * This method returns the element in the specified node
     * @return data
     */
    public T getElement() {
        return data;
    }
    public T getChild(int i){
        return array[i];
    }

    /**
     * This method sets the element in the specified node
     * @param data
     */
    public void setElement(T data) {
        this.data = data;
    }

    public void setChildren(Node array){
        for(int i=0;i<=array.length-1;i++){
            this.array[i]=array[i];
        }
    }
    /**
     * This method sets the left child
     * @param left
     */
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    /**
     * This method sets the right child
     * @param right
     */
    public void setRight(Node<T> right) {
        this.right = right;
    }

}
