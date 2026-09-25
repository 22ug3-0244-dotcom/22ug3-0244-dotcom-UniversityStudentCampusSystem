public class StudentHashTable {

    private Student[] table;

    private final int SIZE = 101;

    public StudentHashTable() {
        table = new Student[SIZE];
    }

    private int hash(int studentId) {

        return Math.abs(studentId) % SIZE;
    }

    // Insert student
    public boolean insert(Student student) {

        int index = hash(student.getStudentId());

        for (int i = 0; i < SIZE; i++) {

            int position = (index + i) % SIZE;

            if (table[position] == null) {

                table[position] = student;
                return true;
            }

            if (table[position].getStudentId()
                    == student.getStudentId()) {

                return false;
            }
        }

        return false;
    }

    // Search student
    public Student search(int studentId) {

        int index = hash(studentId);

        for (int i = 0; i < SIZE; i++) {

            int position = (index + i) % SIZE;

            if (table[position] == null) {
                return null;
            }

            if (table[position].getStudentId() == studentId) {
                return table[position];
            }
        }

        return null;
    }

    // Delete student
    public boolean delete(int studentId) {

        int index = hash(studentId);

        for (int i = 0; i < SIZE; i++) {

            int position = (index + i) % SIZE;

            if (table[position] == null) {
                return false;
            }

            if (table[position].getStudentId() == studentId) {

                table[position] = null;

                rehashCluster(position);

                return true;
            }
        }

        return false;
    }

    // Reinsert elements after deletion
    private void rehashCluster(int deletedPosition) {

        int position = (deletedPosition + 1) % SIZE;

        while (table[position] != null) {

            Student student = table[position];

            table[position] = null;

            insert(student);

            position = (position + 1) % SIZE;
        }
    }
}