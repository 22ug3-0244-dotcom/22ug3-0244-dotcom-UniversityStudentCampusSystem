# 22ug3-0244-dotcom-UniversityStudentCampusSystem
University Student Record and Campus Route Management System

CIT300 – Data Structures and Algorithms

Graded Practical Assignment 1

---

📌 Project Overview

The University Student Record and Campus Route Management System is a Java-based console application developed to demonstrate the practical implementation and integration of fundamental Data Structures and Algorithms.

The system combines multiple data structures to manage university student records, student service requests, recent system actions, student searching, and campus locations and connections.

The project demonstrates how different data structures can be selected and applied to solve different real-world problems within a single integrated system.

---

🎯 Project Objectives

The main objectives of this project are to:

- Implement fundamental data structures using Java.
- Manage university student records efficiently.
- Demonstrate CRUD operations on student records.
- Implement a Stack for recent system actions/history.
- Implement a Queue for student service requests.
- Implement a Binary Search Tree (BST) for student organization and searching.
- Implement Hashing for efficient Student ID searching.
- Implement a Graph to represent campus locations and connections.
- Implement Breadth-First Search (BFS) for campus traversal.
- Apply input validation and error handling.
- Integrate all data structures into one menu-driven application.
- Demonstrate collaborative software development using Git and GitHub.

---

🏗️ System Architecture

The application consists of several interconnected components:

                    ┌─────────────────────────────┐
                    │          MAIN MENU          │
                    │       Java Console UI       │
                    └──────────────┬──────────────┘
                                   │
             ┌─────────────────────┼─────────────────────┐
             │                     │                     │
             ▼                     ▼                     ▼
      Student Records       Service Management      Campus Management
             │                     │                     │
             ▼                     ▼                     ▼
        Linked List           Queue + Stack            Graph
             │                                           │
       ┌─────┴─────┐                                    ▼
       │           │                                   BFS
       ▼           ▼
      BST       Hash Table

---

🧩 Data Structures Used

1. Linked List – Student Records

A custom Linked List is used to store and manage student records.

Each student record contains:

- Student ID
- Student Name
- Programme
- Marks

Supported operations

- Add student
- Search student
- Update student
- Delete student
- Display all students

The Linked List demonstrates dynamic record management without relying on a built-in collection for the student-record structure.

---

2. Stack – Recent Actions

A custom Stack is used to maintain the most recent system actions.

Examples of recorded actions include:

Added student with ID 1001
Updated student with ID 1001
Deleted student with ID 1002
Added service request
Processed service request
Added campus location

The Stack follows the:

LIFO – Last In, First Out

principle.

Supported operations

- Push
- Pop
- Peek
- Display recent actions

---

3. Queue – Student Service Requests

A custom Queue is used to manage student service requests.

Example requests:

Request transcript
Request student ID card
Request registration assistance
Request academic letter

The Queue follows the:

FIFO – First In, First Out

principle.

Supported operations

- Enqueue
- Dequeue
- Peek
- Display requests

---

4. Binary Search Tree – Student Organization

A Binary Search Tree (BST) is used to organize student records according to Student ID.

Example:

             1005
            /    \
         1002    1010
        /   \       \
      1001 1004     1015

Supported operations

- Insert student
- Search student
- Delete student
- In-order traversal/display

The in-order traversal provides student records in sorted Student ID order.

---

5. Hash Table – Student ID Searching

A custom Hash Table is used to provide efficient searching based on Student ID.

The project uses a hash function based on the Student ID and handles collisions using linear probing.

Supported operations

- Insert student
- Search student
- Delete student

Example:

Student ID → Hash Function → Table Position → Student Record

---

6. Graph – Campus Locations and Connections

The campus is represented using a Graph.

Vertices

Campus locations such as:

Library
Cafeteria
Lecture Hall
Administration

Edges

Connections between campus locations.

Example:

Library
   |
   |
Cafeteria
   |
   |
Lecture Hall
   |
   |
Administration

The graph is represented using an adjacency list.

Supported operations

- Add campus location
- Remove campus location
- Add campus connection
- Remove campus connection
- Display campus connections
- Traverse the campus using BFS

---

7. Breadth-First Search (BFS)

Breadth-First Search is used to traverse connected campus locations starting from a selected location.

Example:

Starting Location: Library

Library
   ↓
Cafeteria
   ↓
Lecture Hall
   ↓
Administration

BFS visits connected locations level by level.

---

💻 System Features

The application provides the following main menu:

======================================
              MAIN MENU
======================================

1. Add Student Record
2. Update Student Record
3. Delete Student Record
4. Display All Records using Linked List
5. Add Service Request to Queue
6. Process Next Service Request
7. Display Recent Actions using Stack
8. Display Students using BST
9. Search Student using Hashing
10. Add Campus Location
11. Remove Campus Location
12. Add Campus Connection/Road
13. Remove Campus Connection/Road
14. Display Campus Connections
15. Traverse Campus Locations using BFS
16. Exit

======================================

---

👥 Group Members and Responsibilities

«Replace the placeholders below with your actual names and student IDs before submission.»

Member 1 – Student Records & Linked List

Name: "[MEMBER 1 FULL NAME]"
Student ID: "[MEMBER 1 STUDENT ID]"

Responsibility

- Student record management
- "Student.java"
- "StudentNode.java"
- "StudentLinkedList.java"

Individual Contribution

- Designed the Student data model.
- Implemented the Student Node.
- Implemented the Linked List.
- Implemented add, search, update, delete and display operations.
- Tested student record operations.
- Participated in integration and final testing.

---

Member 2 – Stack & Queue

Name: "[MEMBER 2 FULL NAME]"
Student ID: "[MEMBER 2 STUDENT ID]"

Responsibility

- Recent actions management
- Student service request management
- "ActionStack.java"
- "ServiceRequestQueue.java"

Individual Contribution

- Implemented the custom Stack.
- Implemented recent system action tracking.
- Implemented the custom Queue.
- Implemented student service request processing.
- Tested LIFO and FIFO operations.
- Participated in integration and final testing.

---

Member 3 – BST & Hashing

Name: "[MEMBER 3 FULL NAME]"
Student ID: "[MEMBER 3 STUDENT ID]"

Responsibility

- Student organization and searching
- "BSTNode.java"
- "StudentBST.java"
- "StudentHashTable.java"

Individual Contribution

- Implemented the Binary Search Tree.
- Implemented BST insertion, searching and deletion.
- Implemented in-order traversal.
- Implemented the Student ID Hash Table.
- Implemented collision handling using linear probing.
- Tested BST and hashing operations.
- Participated in integration and final testing.

---

Member 4 – Graph & BFS

Name: "[MEMBER 4 FULL NAME]"
Student ID: "[MEMBER 4 STUDENT ID]"

Responsibility

- Campus location management
- Campus connections
- "CampusLocation.java"
- "CampusGraph.java"

Individual Contribution

- Implemented campus locations.
- Implemented campus connections.
- Implemented graph using an adjacency list.
- Implemented adding and removing locations.
- Implemented adding and removing connections.
- Implemented BFS campus traversal.
- Tested graph operations.
- Participated in integration and final testing.

---

📁 Project Structure

UniversityStudentCampusSystem/
│
├── src/
│   │
│   ├── Main.java
│   │
│   ├── Student.java
│   ├── StudentNode.java
│   ├── StudentLinkedList.java
│   │
│   ├── ActionStack.java
│   ├── ServiceRequestQueue.java
│   │
│   ├── BSTNode.java
│   ├── StudentBST.java
│   ├── StudentHashTable.java
│   │
│   ├── CampusLocation.java
│   └── CampusGraph.java
│
├── README.md
└── .gitignore

---

🛠️ Technologies and Tools

Programming Language

Java

Development Environment

Visual Studio Code

Version Control

Git

Repository and Collaboration

GitHub

Java Concepts Used

- Classes and Objects
- Encapsulation
- Methods
- Constructors
- Arrays
- Recursion
- Loops
- Exception Handling
- Custom Data Structures
- Searching
- Traversal Algorithms

---

🔐 Input Validation and Error Handling

The application includes validation and error handling for common invalid situations.

Student Validation

The system checks:

- Invalid Student ID input
- Duplicate Student IDs
- Student records that do not exist
- Empty student names
- Empty programme names
- Marks outside the valid "0–100" range

Example:

Enter Marks (0-100): 150

Marks must be between 0 and 100.

Campus Validation

The system checks:

- Empty location names
- Duplicate campus locations
- Non-existing campus locations
- Duplicate connections
- Connections involving unavailable locations
- Attempts to remove unavailable connections

Menu Validation

Invalid menu choices are handled without terminating the application.

Example:

Enter your choice: 25

Invalid choice. Please select 1-16.

---

🔄 Student Record Integration

When a student is added, the same Student object is integrated with multiple data structures:

                 New Student
                      │
          ┌───────────┼───────────┐
          │           │           │
          ▼           ▼           ▼
     Linked List      BST      Hash Table
          │
          ▼
       Stack
   records action

This allows the application to demonstrate how multiple data structures can work together within one system.

---

🔀 GitHub Collaboration Workflow

The project is developed collaboratively using Git and GitHub.

Branch Structure

main
│
├── member1-linkedlist
├── member2-stack-queue
├── member3-bst-hashing
└── member4-graph

Member 1

member1-linkedlist

Responsible for:

Student.java
StudentNode.java
StudentLinkedList.java

Member 2

member2-stack-queue

Responsible for:

ActionStack.java
ServiceRequestQueue.java

Member 3

member3-bst-hashing

Responsible for:

BSTNode.java
StudentBST.java
StudentHashTable.java

Member 4

member4-graph

Responsible for:

CampusLocation.java
CampusGraph.java

---

🌿 Git Workflow

Each member works on their assigned branch.

Create/modify code
       ↓
Test locally
       ↓
git add
       ↓
git commit
       ↓
git push
       ↓
Pull Request
       ↓
Review
       ↓
Merge into main

Example:

git add .
git commit -m "Implemented student linked list"
git push

The project uses meaningful commits to provide evidence of individual contributions and development progress.

---

🔀 Pull Request Workflow

Each completed component is submitted through a Pull Request.

Example:

member1-linkedlist
        │
        ▼
Pull Request
        │
        ▼
Code Review
        │
        ▼
Merge
        │
        ▼
main

The same process is followed for the other members' branches.

---

🧪 Testing Strategy

Testing is performed at three levels.

1. Individual Component Testing

Each member tests their own data structure independently.

Examples:

- Linked List operations
- Stack operations
- Queue operations
- BST operations
- Hash Table operations
- Graph operations
- BFS traversal

2. Integration Testing

After merging the components, the complete application is tested.

Examples:

Add Student
     ↓
Linked List
     ↓
BST
     ↓
Hash Table
     ↓
Stack records action

3. System Testing

All menu options are tested from the complete application.

The group also tests invalid inputs and boundary cases.

---

🧪 Test Cases

Test Case| Expected Result
Add valid student| Student added successfully
Add duplicate Student ID| Duplicate rejected
Search existing student| Student displayed
Search missing student| Student not found
Update existing student| Details updated
Delete existing student| Student removed
Enter invalid marks| Input rejected
Add service request| Request added to Queue
Process request| First request processed
Display recent actions| Stack displayed
Search using BST| Student found/not found
Search using Hashing| Student found/not found
Add campus location| Location added
Add duplicate location| Location rejected
Add campus connection| Connection created
Remove connection| Connection removed
BFS traversal| Connected locations displayed
Invalid menu choice| Error message displayed

---

▶️ How to Run the Project

Prerequisites

Make sure Java is installed.

Check the installation:

java -version

Check the Java compiler:

javac -version

---

Clone the Repository

git clone [GITHUB-REPOSITORY-URL]

Move into the project:

cd UniversityStudentCampusSystem

---

Compile

From the project root:

javac src/*.java

---

Run

java -cp src Main

The main menu will then appear.

---

🖥️ Example Usage

Add Student

===== ADD STUDENT =====

Enter Student ID: 1001
Enter Student Name: Kamal Perera
Enter Programme: Information Technology
Enter Marks (0-100): 78

Student added successfully.

Search Student Using Hashing

===== HASHING SEARCH =====

Enter Student ID: 1001

Student found:
Student ID: 1001 | Name: Kamal Perera |
Programme: Information Technology | Marks: 78.0

Add Campus Location

===== ADD CAMPUS LOCATION =====

Enter location name: Library

Campus location added successfully.

BFS

===== BFS CAMPUS TRAVERSAL =====

Enter starting location: Library

===== BFS TRAVERSAL =====
Library -> Cafeteria -> Lecture Hall -> END
=========================

---

📊 Data Structure Summary

Data Structure| Purpose| Main Operations
Linked List| Student records| Add, Search, Update, Delete, Display
Stack| Recent actions| Push, Pop, Peek, Display
Queue| Service requests| Enqueue, Dequeue, Peek, Display
BST| Student organization| Insert, Search, Delete, Traverse
Hash Table| Student ID search| Insert, Search, Delete
Graph| Campus network| Add/Remove Locations & Connections
BFS| Campus traversal| Breadth-first traversal

---

📚 Learning Outcomes Demonstrated

Through this project, the group demonstrates practical understanding of:

- Linear data structures
- Non-linear data structures
- Linked Lists
- Stacks
- Queues
- Binary Search Trees
- Hash Tables
- Graphs
- Graph traversal
- Searching algorithms
- Tree traversal
- Input validation
- Object-oriented programming
- Version control
- Collaborative development
- Software integration and testing

---

👨‍💻 Team Collaboration

All four members contribute to the project through:

- Individual development branches
- Meaningful Git commits
- Pull requests
- Code integration
- Testing
- Debugging
- Documentation
- Final system validation
- Demonstration video

The final application represents the integrated work of the entire group rather than four independent programs.

---

🎥 Demonstration Video

The final demonstration presents the complete application and the individual contributions of all group members.

Demonstration Sections

Member 1

- Student record management
- Linked List operations

Member 2

- Service request Queue
- Recent action Stack

Member 3

- BST operations
- Hash Table searching

Member 4

- Campus Graph
- Campus connections
- BFS traversal

The final demonstration also presents the integrated system and its menu-driven functionality.

---

📋 Assignment Compliance

The project implements the required major components:

- [x] Java console application
- [x] Student record management
- [x] Linked List
- [x] Stack
- [x] Queue
- [x] Binary Search Tree
- [x] Hashing
- [x] Graph
- [x] BFS traversal
- [x] Add student
- [x] Update student
- [x] Delete student
- [x] Search student
- [x] Display student records
- [x] Input validation
- [x] Error handling
- [x] Menu-driven interface
- [x] Git branches
- [x] Git commits
- [x] Pull requests
- [x] Integration testing
- [x] README documentation
- [x] Individual contribution documentation
- [x] Demonstration video

---

📌 Project Status

Status: Completed / In Development

«Update this section to Completed only after the complete application has been tested and integrated.»

---

📄 Academic Information

Module: CIT300 – Data Structures and Algorithms
Assessment: Graded Practical Assignment 1
Project: University Student Record and Campus Route Management System
Programming Language: Java

---

👥 Group Information

Member| Name| Student ID| Responsibility
1| "[Name]"| "[ID]"| Student Records & Linked List
2| "[Name]"| "[ID]"| Stack & Queue
3| "[Name]"| "[ID]"| BST & Hashing
4| "[Name]"| "[ID]"| Graph & BFS

---

📜 Academic Integrity

This project is developed as a group assignment for academic purposes. Each group member is responsible for understanding and being able to explain their individual contribution and the overall system integration.

---

⭐ Project Summary

The University Student Record and Campus Route Management System demonstrates the practical application of multiple data structures within a single Java console application.

By combining:

Linked List
     +
Stack
     +
Queue
     +
BST
     +
Hash Table
     +
Graph
     +
BFS

the system provides a practical example of how different data structures can be selected and integrated to solve different components of a university management problem.
