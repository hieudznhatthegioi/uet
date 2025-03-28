package QLSV;
import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    private Student[] students = new Student[100];
    private int count = 0;

    /**
     * Adds a new student to the management system.
     *
     * @param newStudent the student to be added
     */
    public void addStudent(Student newStudent) {
        this.students[count] = newStudent;
        count++;
    }

    /**
     * Groups students by their group and returns the information as a string.
     *
     * @return a string containing students grouped by their group
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        Map<String, Boolean> printedClasses = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String studentClass = students[i].getGroup();

            if (!printedClasses.containsKey(studentClass)) {
                result.append(studentClass).append("\n");
                printedClasses.put(studentClass, true);

                for (int j = 0; j < count; j++) {
                    if (students[j].getGroup().equals(studentClass)) {
                        result.append(students[j].getInfo()).append("\n");
                    }
                }
            }
        }
        return result.toString();
    }

    /**
     * Removes a student from the management system by their ID.
     *
     * @param id the ID of the student to be removed
     */
    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count--;
                break;
            }
        }
    }
}
