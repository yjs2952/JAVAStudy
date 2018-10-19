package my.examples.studentboard;

import my.examples.studentboard.config.StudentBoardConfig;
import my.examples.studentboard.controller.MainController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main01 {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(StudentBoardConfig.class);
        MainController mc = ac.getBean("mainController", MainController.class);
        mc.controll();
    }
}
