import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
    private Object root;
    private BinaryTree left, right;

    public BinaryTree(Object root) {

        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this(root);
        if (left != null)
            this.left = left;
        if (right != null)
            this.right = right;
    }

    public BinaryTree(BinaryTree that) {

        this.root = that.root;
        if (that.left != null)
            this.left = new BinaryTree(that.left);
        if (that.right != null)
            this.right = new BinaryTree(that.right);
    }
    public void levelOrderPrint() {
        List<BinaryTree> queue = new LinkedList<BinaryTree>();
        queue.add(this);
        while (!queue.isEmpty()) {
            BinaryTree tree = queue.remove(0);
            System.out.print(tree.root + " ");
            if (tree.left != null)
                queue.add(tree.left);
            if (tree.right != null)
                queue.add(tree.right);
        }
    }
    public void inorderPrint() {
        if (left != null)
            left.inorderPrint();
        System.out.print(root + " ");
        if (right != null)
            right.inorderPrint();
    }
    public void preorderPrint() {
        System.out.print(root + " ");
        if (left != null)
            left.preorderPrint();
        if (right != null)
            right.preorderPrint();
    }
        public void postorderPrint() {
            if (left != null)
                left.postorderPrint();
            if (right != null)
                right.postorderPrint();
            System.out.print(root + " ");
        }
        public String toString () {
            StringBuilder sb = new StringBuilder("[");
            if (left != null)
                sb.append(left + ",");
            sb.append(root);
            if (right != null)
                sb.append("," + right);
            return sb + "]";
        }
    }
