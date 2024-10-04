//Coding Challenge 2: The Linked List Labyrinth
// Class representing a location node in a singly linked list
class Location {
    String name;
    Location next;

    public Location(String name) {
        this.name = name;
        this.next = null;
    }
}

// Class representing a labyrinth path using a singly linked list
public class LabyrinthPath {
    private Location firstNode;

    public LabyrinthPath() {
        firstNode = null;
    }

    // Adds a new location to the end of the path
    public void addLocation(String name) {
        Location newLocation = new Location(name);
        if (firstNode == null) {
        	firstNode = newLocation;
        } else {
            Location temp = firstNode;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newLocation;
        }
    }

    // Removes the last visited location
    public void removeLastLocation() {
        if (firstNode == null) {
            System.out.println("Path is empty.");
            return;
        }
        if (firstNode.next == null) {
        	firstNode = null;
        } else {
            Location temp = firstNode;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Prints the entire path
    public void printPath() {
        Location temp = firstNode;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
