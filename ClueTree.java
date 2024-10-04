// Coding Challenge 5: The Binary Tree of Clues
// Class representing a node in a binary search tree
class ClueNode {
    String clue;
    ClueNode left, right;

    public ClueNode(String clue) {
        this.clue = clue;
        this.left = this.right = null;
    }
}

// Class representing a binary search tree of clues
public class ClueTree {
    private ClueNode root;

    public ClueTree() {
        root = null;
    }

    // Insert a new clue into the binary search tree
    public void insertClue(String clue) {
        root = insertRec(root, clue);
    }

    private ClueNode insertRec(ClueNode root, String clue) {
        if (root == null) {
            root = new ClueNode(clue);
            return root;
        }
        if (clue.compareTo(root.clue) < 0) {
            root.left = insertRec(root.left, clue);
        } else if (clue.compareTo(root.clue) > 0) {
            root.right = insertRec(root.right, clue);
        }
        return root;
    }

    // In-order traversal
    public void inOrderTraversal() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(ClueNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.clue + " ");
            inOrderRec(root.right);
        }
    }

    // Find a specific clue in the tree
    public String findClue(String clue) {
        ClueNode result = findRec(root, clue);
        return (result != null) ? result.clue : "Clue not found";
    }

    private ClueNode findRec(ClueNode root, String clue) {
        if (root == null || root.clue.equals(clue)) {
            return root;
        }
        if (clue.compareTo(root.clue) < 0) {
            return findRec(root.left, clue);
        }
        return findRec(root.right, clue);
    }

    // Count the total number of clues in the tree
    public int countClues() {
        return countRec(root);
    }
    
    private int countRec(ClueNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countRec(root.left) + countRec(root.right);
    }
}
