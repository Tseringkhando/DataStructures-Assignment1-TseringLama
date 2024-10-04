import java.util.Arrays;
//Coding Challenge 1: The Array Artifact 
//Assuming the array is kept sorted
// Class representing an artifact
class Artifact {
    String name;
    int age;
    // assuming artifacts attributes are name and age
    public Artifact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Class representing a vault to store artifacts using an array
public class ArtifactVault {
    private Artifact[] artifacts;
    private int size;

    public ArtifactVault(int capacity) {
        artifacts = new Artifact[capacity];
        size = 0;
    }

    // Adds an artifact to the first empty slot in the array
    public void addArtifact(Artifact artifact) {
        if (size < artifacts.length) {
            artifacts[size] = artifact;
            size++;
            //Using lambda expression
            Arrays.sort(artifacts, 0, size, (a1, a2) -> a1.getAge() - a2.getAge()); // Keep array sorted by age
        } else {
            System.out.println("Vault is full!");
        }
    }

    // Removes an artifact by its name
    public void removeArtifact(String name) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].getName().equals(name)) {
                // Shift all elements after the found artifact to fill the gap
                for (int j = i; j < size - 1; j++) {
                    artifacts[j] = artifacts[j + 1];
                }
                artifacts[size - 1] = null; // Clear the last slot
                size--;
                return;
            }
        }
        System.out.println("Artifact not found.");
    }

    // Find an artifact using linear search
    public Artifact findArtifactLinear(String name) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].getName().equals(name)) {
                return artifacts[i];
            }
        }
        return null;
    }

    // Find an artifact using binary search (assuming array is sorted by age)
    public Artifact findArtifactBinary(String name) {
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (artifacts[mid].getName().equals(name)) {
                return artifacts[mid];
            } else if (artifacts[mid].getName().compareTo(name) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
