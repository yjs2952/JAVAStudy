package java3rd.ch16;

import java3rd.ch14.Student2;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MaleStudent {
    private List<Student2> list;

    public MaleStudent() {
        list = new ArrayList<>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(Student2 student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void comine(MaleStudent other) {
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }
}
