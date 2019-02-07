public class Student {

//Student obligatory fields

    private String name;
    private int id;

//Student optional fields

    private double gpa;
    private StudentMajor major;

//Constructors



    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student(String name, int id, StudentMajor major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public Student(String name, int id, double gpa, StudentMajor major) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.major = major;
    }

// Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
       return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public StudentMajor getMajor() {
        return major;
    }

    public void setMajor(StudentMajor major) {
        this.major = major;
    }
}
