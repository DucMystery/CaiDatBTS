

public class TreeNode<E extends Comparable> {

    private Node<E> root;

    public void insert(E element){
        if (root==null){
            root = new Node<>(element);
        }else {
           Node<E> currentNode = root;
           while (currentNode!= null){
               if (element.compareTo(currentNode.element)<0){
                   if (currentNode.left == null){
                       currentNode.left =new Node<>(element);
                       break;
                   }else {
                       currentNode =currentNode.left;
                   }
               }else if(element.compareTo(currentNode.element)>0){
                   if (currentNode.right==null){
                       currentNode.right = new Node<>(element);
                       break;
                   }else {
                       currentNode =currentNode.right;
                   }
               }else {
                   throw new RuntimeException("Gia tri da ton tai !");
               }

            }


        }

    }
}
