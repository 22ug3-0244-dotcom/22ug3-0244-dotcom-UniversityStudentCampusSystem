public class StudentBST {

    private BSTNode root;

    public StudentBST() {
        root = null;
    }

    // Insert student
    public boolean insert(Student student) {

        if (search(student.getStudentId()) != null) {
            return false;
        }

        root = insertRecursive(root, student);

        return true;
    }

    private BSTNode insertRecursive(BSTNode node, Student student) {

        if (node == null) {
            return new BSTNode(student);
        }

        if (student.getStudentId() < node.student.getStudentId()) {

            node.left = insertRecursive(node.left, student);

        } else if (student.getStudentId() > node.student.getStudentId()) {

            node.right = insertRecursive(node.right, student);
        }

        return node;
    }

    // Search
    public Student search(int studentId) {

        BSTNode current = root;

        while (current != null) {

            if (studentId == current.student.getStudentId()) {
                return current.student;
            }

            if (studentId < current.student.getStudentId()) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    // Display students in sorted ID order
    public void displayInOrder() {

        if (root == null) {
            System.out.println("BST is empty.");
            return;
        }

        System.out.println("\n===== STUDENTS USING BST =====");

        inOrder(root);

        System.out.println("==============================\n");
    }

    private void inOrder(BSTNode node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);

        System.out.println(node.student);

        inOrder(node.right);
    }

    // Delete student
    public boolean delete(int studentId) {

        if (search(studentId) == null) {
            return false;
        }

        root = deleteRecursive(root, studentId);

        return true;
    }

    private BSTNode deleteRecursive(BSTNode node, int studentId) {

        if (node == null) {
            return null;
        }

        if (studentId < node.student.getStudentId()) {

            node.left = deleteRecursive(node.left, studentId);

        } else if (studentId > node.student.getStudentId()) {

            node.right = deleteRecursive(node.right, studentId);

        } else {

            // No child
            if (node.left == null && node.right == null) {
                return null;
            }

            // Only right child
            if (node.left == null) {
                return node.right;
            }

            // Only left child
            if (node.right == null) {
                return node.left;
            }

            // Two children
            BSTNode successor = findMinimum(node.right);

            node.student = successor.student;

            node.right = deleteRecursive(
                    node.right,
                    successor.student.getStudentId()
            );
        }

        return node;
    }

    private BSTNode findMinimum(BSTNode node) {

        BSTNode current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }
}