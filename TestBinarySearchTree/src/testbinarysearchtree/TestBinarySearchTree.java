
package testbinarysearchtree;

//import javax.swing.tree.TreeNode;

public class TestBinarySearchTree<E extends Comparable<E>> {

    private TreeNode<E> root;

    public static void main(String[] args) {
        TestBinarySearchTree<Integer> bst = new TestBinarySearchTree<>();

        TreeNode<Integer> root = new TreeNode<>(60);
        root.left = new TreeNode<>(55);
        root.right = new TreeNode<>(100);

        bst.root = root;

        // Example usage of search
        System.out.println(bst.search(55));  // Should print true
        System.out.println(bst.search(70));  // Should print false
    }

    public boolean search(E element) {

        TreeNode<E> current = root;

        while (current != null) {
            int cmp = element.compareTo(current.element);
            if (cmp < 0) {
                current = current.left;
            } else if (cmp > 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
