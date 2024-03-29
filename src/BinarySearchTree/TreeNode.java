package BinarySearchTree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public int getData() {
        return data;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (data == value) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
        if (data == value) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min() {
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.max();
        }
    }

    public void traverseInorder() {
        if(leftChild !=  null) {
            leftChild.traverseInorder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInorder();
        }
    }

    public void traversePreorder() {
        System.out.print(data + ", ");

        if(leftChild !=  null) {
            leftChild.traversePreorder();
        }
        if (rightChild != null) {
            rightChild.traversePreorder();
        }
    }

    public void traversePostorder() {
        if(leftChild !=  null) {
            leftChild.traversePostorder();
        }
        if (rightChild != null) {
            rightChild.traversePostorder();
        }

        System.out.print(data + ", ");
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
