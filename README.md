# DataStructures-Assignment1

**Name:** Tsering Khando Lama  
**Student ID:** C0916140

## Overview

This repository contains the solutions to the "Indiana Jones and the Template of Infinite Recursions" lab. The assignment consists of five coding challenges that test the understanding of fundamental data structures and algorithms. Below is a description of each challenge and how I approached it.

---

## Coding Challenges

### 1. The Array Artifact (ArtifactVault)
- **Description:** Implements an array-based vault to store ancient artifacts with methods to add, remove, and search for artifacts.
- **Approach:** 
  - Used a basic array for storage.
  - Implemented a linear search for finding an artifact and a binary search by assuming the artifacts were sorted by age.
  - Created methods to add artifacts to the first available slot and remove them by their unique names.
- **Assumptions:** Assumed that artifact names are unique.

### 2. The Linked List Labyrinth (LabyrinthPath)
- **Description:** A singly linked list represents a path through a labyrinth, with the ability to add, remove, check for loops, and print the path.
- **Approach:** 
  - Researched first about the singly linked list.

![image](https://github.com/user-attachments/assets/3594faf2-c836-4a08-8739-bc0c249cd562)
from : https://www.simplilearn.com/tutorials/java-tutorial/linked-list-in-java#:~:text=Circular%20Linked%20List-,Singular%20Linked%20List,is%20called%20Singly%20Linked%20list.
  - Implemented a simple singly linked list where each node represents a location.
  - Designed methods to add new locations, remove the last visited location, detect loops, and print the entire path.
- **Assumptions:** The labyrinth path follows a linear structure without intersections.

### 3. The Stack of Ancient Texts (ScrollStack)
- **Description:** A stack data structure to manage ancient scrolls with operations like push, pop, peek, and checking for a specific scroll.

![image](https://github.com/user-attachments/assets/92fe954f-5222-482c-bb39-25e71ec28840)
from : https://www.javatpoint.com/java-stack
- **Approach:** 
  - Implemented a stack using an array to store scrolls.
  - Methods include push (add), pop (remove), peek (view top item), and searching for a specific scroll in the stack.
- **Assumptions:** Stack operations adhere to Last-In-First-Out (LIFO) principles.

### 4. The Queue of Explorers (ExplorerQueue)
- **Description:** A circular queue to manage explorers waiting in line to enter a temple.

![image](https://github.com/user-attachments/assets/e0b06631-6f6e-482f-86d5-fcec56ac63a2)
  from : https://www.geeksforgeeks.org/introduction-to-circular-queue/
- **Approach:** 
  - Implemented a circular queue using an array.
  - Enqueue (add explorers), dequeue (remove explorers), peek (see the next in line), and checks for full/empty queue conditions were implemented.
- **Assumptions:** The queue has a fixed size and is used for FIFO (First-In-First-Out) operations.

### 5. The Binary Tree of Clues (ClueTree)
- **Description:** A binary tree representing clues, with methods for insertion, traversals (in-order, pre-order, post-order), searching, and counting total clues.

  ![image](https://github.com/user-attachments/assets/cf5ce7ce-088d-451f-a71a-afb4c429f467)
  from : https://www.geeksforgeeks.org/introduction-to-binary-tree/
- **Approach:**
  - Implemented a binary search tree where each node represents a clue.
  - Designed methods for inserting clues, performing various tree traversals, finding a specific clue, and counting the total number of clues.
- **Assumptions:** Clue names are unique, and the tree follows binary search tree properties.

---

## Instructions to Run the Code

### 1. Clone the Repository:
   - Clone the GitHub repository to your local machine using the following command:
   
     ```bash
     git clone https://github.com/Tseringkhando/DataStructures-Assignment1-TseringLama.git
     ```
   - Navigate into the repository directory:
   
     ```bash
     cd DataStructures-Assignment1-TseringLama
     ```

### 2. Compile the Java Files:
   - Ensure that you have the Java Development Kit (JDK) installed on your machine.
   - Compile all the `.java` files in the repository using the following command:
   
     ```bash
     javac *.java
     ```

### 3. Run the `Main` Class:
   - After compilation, run the `Main` class to execute the code for all challenges:
   
     ```bash
     java Main
     ```

### 4. Expected Output:
   - The program will run the test cases for each challenge, performing operations like adding, removing, searching, and traversing the data structures.
   - Output:
   - ![image](https://github.com/user-attachments/assets/bbe96939-e5e8-4fc7-b27e-02c458738e8f)
