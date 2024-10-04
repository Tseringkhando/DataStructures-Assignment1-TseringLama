public class Main {
    public static void main(String[] args) {
        // ArtifactVault demonstration
        System.out.println("ArtifactVault Demo:");
        ArtifactVault vault = new ArtifactVault(5);
        vault.addArtifact(new Artifact("Golden Idol", 1000));
        vault.addArtifact(new Artifact("Crystal Skull", 500));
        vault.addArtifact(new Artifact("Lost Ark", 1500));
        System.out.println("Linear Search: " + vault.findArtifactLinear("Crystal Skull").getName());
        System.out.println("Binary Search: " + vault.findArtifactBinary("Lost Ark").getName());
        vault.removeArtifact("Golden Idol");
        System.out.println("After Removal: " + (vault.findArtifactLinear("Golden Idol") == null ? "Removed" : "Still present"));

        // LabyrinthPath demonstration
        System.out.println("\nLabyrinthPath Demo:");
        LabyrinthPath path = new LabyrinthPath();
        path.addLocation("Entrance");
        path.addLocation("Chamber");
        path.addLocation("Treasure Room");
        path.printPath();
        path.removeLastLocation();
        path.printPath();

        // ScrollStack demonstration
        System.out.println("\nScrollStack Demo:");
        ScrollStack scrollStack = new ScrollStack();
        scrollStack.pushScroll("Scroll of Wisdom");
        scrollStack.pushScroll("Scroll of Power");
        System.out.println("Top of the stack: " + scrollStack.peekScroll());
        scrollStack.popScroll();
        System.out.println("After pop, top of the stack: " + scrollStack.peekScroll());

        // ExplorerQueue demonstration
        System.out.println("\nExplorerQueue Demo:");
        ExplorerQueue queue = new ExplorerQueue(3);
        queue.enqueueExplorer(new Explorer("Indy"));
        queue.enqueueExplorer(new Explorer("Marion"));
        System.out.println("Next explorer: " + queue.nextExplorer().getName());
        queue.dequeueExplorer();
        System.out.println("After dequeue, next explorer: " + queue.nextExplorer().getName());

        // ClueTree demonstration
        System.out.println("\nClueTree Demo:");
        ClueTree clueTree = new ClueTree();
        clueTree.insertClue("Clue A");
        clueTree.insertClue("Clue B");
        clueTree.insertClue("Clue C");
        clueTree.inOrderTraversal();
        System.out.println("Clue found: " + clueTree.findClue("Clue B"));
        System.out.println("Total clues: " + clueTree.countClues());
    }
}
