package my.examples.studentboard.controller;

import my.examples.studentboard.BoardUI;
import my.examples.studentboard.dao.StudentDAO;
import my.examples.studentboard.vo.Student;

import java.util.List;

public class MainController {

    private StudentDAO studentDAO;
    private BoardUI boardUI;

    public void controll(){

        boolean flag = true;

        while (flag) {
            int num = boardUI.main();

            if (num == 1) {
                Student student = boardUI.addStudent();

                if (student != null) {
                    studentDAO.add(student);
                }

            } else if (num == 2) {
                boardUI.listStudent(studentDAO.getList());
            } else if (num == 3) {
                flag = boardUI.end();
            }
        }
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void setBoardUI(BoardUI boardUI) {
        this.boardUI = boardUI;
    }
}
