package Tree;

public class Tree {
    private class Node{
        public int key;
        public Node nextRight;
        public Node nextLeft;

        public Node(int key){
            this.key = key;
            nextLeft = nextRight = null;
        }
    }

    private Node root;
    public Tree(){
        root = null;
    }

    private Node addNode(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value > root.key){
            root = addNode(root.nextRight, value);
        }
        else if(value < root.key){
            root = addNode(root.nextLeft, value);
        }

        return root;
    }
    public void add(int value){
        root = addNode(root , value);
    }


    
}
