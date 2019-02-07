import static java.lang.System.out;

class UseStudent {
    public static void main(String args[]){
        final String format = "Student name: %s\n Student id: %d\n Student GPA: %.2f\n Student major: %s ";

//        making new students with constructors
        Student stud = new Student("MIchał Olszak", 20);
        stud.setGpa(3.66);
        stud.setMajor(StudentMajor.COMPUTER_SCIENCE);
        out.printf(format,stud.getName(),stud.getId(), stud.getGpa(), stud.getMajor());
        out.println();
        out.println();
        out.println();

        stud = new Student("Nicole Kukla Olszak", 75, 4.55, StudentMajor.PHYSIC);
        out.printf(format,stud.getName(),stud.getId(), stud.getGpa(), stud.getMajor());
    }
}
