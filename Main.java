import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static StudentLinkedList studentList =
            new StudentLinkedList();

    private static ActionStack actionStack =
            new ActionStack();

    private static ServiceRequestQueue requestQueue =
            new ServiceRequestQueue();

    private static StudentBST studentBST =
            new StudentBST();

    private static StudentHashTable hashTable =
            new StudentHashTable();

    private static CampusGraph campusGraph =
            new CampusGraph();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("==============================================");
        System.out.println(" UNIVERSITY STUDENT & CAMPUS MANAGEMENT SYSTEM");
        System.out.println("==============================================");

        while (running) {

            displayMenu();

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    updateStudent();
                    break;

                case 3:
                    deleteStudent();
                    break;

                case 4:
                    studentList.displayStudents();
                    break;

                case 5:
                    addServiceRequest();
                    break;

                case 6:
                    processServiceRequest();
                    break;

                case 7:
                    actionStack.display();
                    break;

                case 8:
                    studentBST.displayInOrder();
                    break;

                case 9:
                    searchStudentUsingHashing();
                    break;

                case 10:
                    addCampusLocation();
                    break;

                case 11:
                    removeCampusLocation();
                    break;

                case 12:
                    addCampusConnection();
                    break;

                case 13:
                    removeCampusConnection();
                    break;

                case 14:
                    campusGraph.displayConnections();
                    break;

                case 15:
                    traverseCampus();
                    break;

                case 16:
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please select 1-16."
                    );
            }
        }

        scanner.close();
    }

    // =========================
    // MAIN MENU
    // =========================

    private static void displayMenu() {

        System.out.println();
        System.out.println("======================================");
        System.out.println("              MAIN MENU");
        System.out.println("======================================");

        System.out.println("1. Add Student Record");
        System.out.println("2. Update Student Record");
        System.out.println("3. Delete Student Record");
        System.out.println("4. Display All Records using Linked List");
        System.out.println("5. Add Service Request to Queue");
        System.out.println("6. Process Next Service Request");
        System.out.println("7. Display Recent Actions using Stack");
        System.out.println("8. Display Students using BST");
        System.out.println("9. Search Student using Hashing");
        System.out.println("10. Add Campus Location");
        System.out.println("11. Remove Campus Location");
        System.out.println("12. Add Campus Connection/Road");
        System.out.println("13. Remove Campus Connection/Road");
        System.out.println("14. Display Campus Connections");
        System.out.println("15. Traverse Campus Locations using BFS");
        System.out.println("16. Exit");

        System.out.println("======================================");
    }

    // =========================
    // STUDENT OPERATIONS
    // =========================

    private static void addStudent() {

        System.out.println("\n===== ADD STUDENT =====");

        int id = readInt("Enter Student ID: ");

        if (studentList.searchStudent(id) != null) {

            System.out.println(
                    "Student ID already exists."
            );

            return;
        }

        String name = readNonEmpty(
                "Enter Student Name: "
        );

        String programme = readNonEmpty(
                "Enter Programme: "
        );

        double marks = readMarks(
                "Enter Marks (0-100): "
        );

        Student student =
                new Student(id, name, programme, marks);

        studentList.addStudent(student);
        studentBST.insert(student);
        hashTable.insert(student);

        actionStack.push(
                "Added student with ID " + id
        );

        System.out.println(
                "Student added successfully."
        );
    }

    private static void updateStudent() {

        System.out.println("\n===== UPDATE STUDENT =====");

        int id = readInt("Enter Student ID: ");

        Student student =
                studentList.searchStudent(id);

        if (student == null) {

            System.out.println(
                    "Student record not found."
            );

            return;
        }

        String name = readNonEmpty(
                "Enter new name: "
        );

        String programme = readNonEmpty(
                "Enter new programme: "
        );

        double marks = readMarks(
                "Enter new marks (0-100): "
        );

        student.setName(name);
        student.setProgramme(programme);
        student.setMarks(marks);

        actionStack.push(
                "Updated student with ID " + id
        );

        System.out.println(
                "Student updated successfully."
        );
    }

    private static void deleteStudent() {

        System.out.println("\n===== DELETE STUDENT =====");

        int id = readInt("Enter Student ID: ");

        Student student =
                studentList.searchStudent(id);

        if (student == null) {

            System.out.println(
                    "Student record not found."
            );

            return;
        }

        studentList.deleteStudent(id);
        studentBST.delete(id);
        hashTable.delete(id);

        actionStack.push(
                "Deleted student with ID " + id
        );

        System.out.println(
                "Student deleted successfully."
        );
    }

    // =========================
    // QUEUE OPERATIONS
    // =========================

    private static void addServiceRequest() {

        System.out.println("\n===== ADD SERVICE REQUEST =====");

        String request = readNonEmpty(
                "Enter service request: "
        );

        requestQueue.enqueue(request);

        actionStack.push(
                "Added service request: " + request
        );

        System.out.println(
                "Service request added to queue."
        );
    }

    private static void processServiceRequest() {

        System.out.println(
                "\n===== PROCESS SERVICE REQUEST ====="
        );

        String request = requestQueue.dequeue();

        if (request == null) {

            System.out.println(
                    "No service requests available."
            );

            return;
        }

        System.out.println(
                "Processing request: " + request
        );

        actionStack.push(
                "Processed service request: " + request
        );
    }

    // =========================
    // HASH SEARCH
    // =========================

    private static void searchStudentUsingHashing() {

        System.out.println(
                "\n===== HASHING SEARCH ====="
        );

        int id = readInt(
                "Enter Student ID: "
        );

        Student student =
                hashTable.search(id);

        if (student == null) {

            System.out.println(
                    "Student not found."
            );

        } else {

            System.out.println(
                    "Student found:"
            );

            System.out.println(student);
        }
    }

    // =========================
    // GRAPH OPERATIONS
    // =========================

    private static void addCampusLocation() {

        System.out.println(
                "\n===== ADD CAMPUS LOCATION ====="
        );

        String name = readNonEmpty(
                "Enter location name: "
        );

        boolean result =
                campusGraph.addLocation(name);

        if (result) {

            actionStack.push(
                    "Added campus location: " + name
            );

            System.out.println(
                    "Campus location added successfully."
            );

        } else {

            System.out.println(
                    "Location already exists or is invalid."
            );
        }
    }

    private static void removeCampusLocation() {

        System.out.println(
                "\n===== REMOVE CAMPUS LOCATION ====="
        );

        String name = readNonEmpty(
                "Enter location name: "
        );

        boolean result =
                campusGraph.removeLocation(name);

        if (result) {

            actionStack.push(
                    "Removed campus location: " + name
            );

            System.out.println(
                    "Campus location removed successfully."
            );

        } else {

            System.out.println(
                    "Campus location not found."
            );
        }
    }

    private static void addCampusConnection() {

        System.out.println(
                "\n===== ADD CAMPUS CONNECTION ====="
        );

        String first = readNonEmpty(
                "Enter first location: "
        );

        String second = readNonEmpty(
                "Enter second location: "
        );

        boolean result =
                campusGraph.addConnection(
                        first,
                        second
                );

        if (result) {

            actionStack.push(
                    "Added connection between "
                    + first + " and " + second
            );

            System.out.println(
                    "Connection added successfully."
            );

        } else {

            System.out.println(
                    "Unable to add connection."
            );

            System.out.println(
                    "Check that both locations exist "
                    + "and the connection does not already exist."
            );
        }
    }

    private static void removeCampusConnection() {

        System.out.println(
                "\n===== REMOVE CAMPUS CONNECTION ====="
        );

        String first = readNonEmpty(
                "Enter first location: "
        );

        String second = readNonEmpty(
                "Enter second location: "
        );

        boolean result =
                campusGraph.removeConnection(
                        first,
                        second
                );

        if (result) {

            actionStack.push(
                    "Removed connection between "
                    + first + " and " + second
            );

            System.out.println(
                    "Connection removed successfully."
            );

        } else {

            System.out.println(
                    "Connection not found or locations do not exist."
            );
        }
    }

    private static void traverseCampus() {

        System.out.println(
                "\n===== BFS CAMPUS TRAVERSAL ====="
        );

        String start = readNonEmpty(
                "Enter starting location: "
        );

        campusGraph.bfs(start);
    }

    // =========================
    // INPUT VALIDATION
    // =========================

    private static int readInt(String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine();

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a whole number."
                );
            }
        }
    }

    private static double readMarks(String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine();

            try {

                double marks = Double.parseDouble(input);

                if (marks >= 0 && marks <= 100) {
                    return marks;
                }

                System.out.println(
                        "Marks must be between 0 and 100."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid marks. Please enter a number."
                );
            }
        }
    }

    private static String readNonEmpty(String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(
                    "Input cannot be empty."
            );
        }
    }
}