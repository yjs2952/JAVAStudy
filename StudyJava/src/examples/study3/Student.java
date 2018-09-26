package examples.study3;

public class Student {

    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + sno;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return student.name.equals(name) && (sno == student.sno);
        } else {
            return false;
        }
    }
}
