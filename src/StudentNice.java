
public class StudentNice extends Student {

    public StudentNice(String name, int id) {
        super(name, id );
    }

    public StudentNice(String name, int id, double gpa) {
        super(name, id, gpa);
    }

    public StudentNice(String name, int id, StudentMajor major) {
        super(name, id, major);
    }

    public StudentNice(String name, int id, double gpa, StudentMajor major) {
        super(name, id, gpa, major);
    }

    public String getString(){
        return String.format("Student id number %d , named %s, GPA: %.2f,  major %s, ", getId(), getName(), getGpa(), getMajor());
    }
}
