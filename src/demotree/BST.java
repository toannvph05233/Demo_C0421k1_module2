package demotree;

public class BST<E extends Comparable<E>> {
    E arr;
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public void add(E element) {
        TreeNode<E> node = new TreeNode<>(element);
        if (root == null) {
            root = node;
        } else {
            TreeNode<E> temp = root;
            while (temp != null) {
                if (element.compareTo(temp.element) > 0) {
                    temp = temp.right;
                } else if (element.compareTo(temp.element) < 0) {
                    temp = temp.left;
                } else {
                    System.out.println("phần tử đã tồn tại");
                    return;
                }
            }
            temp = node;
        }
        size++;
    }

    public void remove(E element) {
        root = removeDQ(root, element);
        size--;
    }

    public TreeNode<E> removeDQ(TreeNode<E> root, E element) {
        if (root == null) {
            System.out.println("null");
            return null;
        } else {
            if (element.compareTo(root.element) < 0) {
                root.left = removeDQ(root.left, element);
            } else if (element.compareTo(root.element) > 0) {
                root.right = removeDQ(root.right, element);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                root.element = minValue(root.right);
                root.right = removeDQ(root.right, element);
            }
        }
        return root;

    }

    public E minValue(TreeNode<E> root) {
        E minVal = root.element;
        while (root.left != null) {
            minVal = root.left.element;
            root = root.left;
        }
        return minVal;
    }
}
