package QLSV;
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return String.format("%s - %s - %s - %s", name, id, group, email);
    }

    /**
     * Student class constructor.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Student class constructor 2.
     *
     * @param email student email
     * @param name  student name
     * @param id    student id
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Student class constructor 3.
     *
     * @param s student name
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }
}
