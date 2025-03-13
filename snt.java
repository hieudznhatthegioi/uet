public class snt {
    private String name;
    private int age;

    public void setage(int tuoi) {
        this.age = tuoi;
    }

    public int getage() {
        return this.age;
    }
}

class empoly extends snt {
    private int salary;

    public static void main(String[] args) {
        empoly s = new empoly();
        s.setage(12);
        System.out.println((s.getage()));
    }
}