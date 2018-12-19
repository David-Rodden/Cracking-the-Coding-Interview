package chapter_4.tree_structure;

public class TreeNode<T> {
    private final T value;
    private TreeNode left, right;

    public TreeNode(final T value) {
        this.value = value;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
