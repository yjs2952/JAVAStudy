package my.examples.studentboard;

import my.examples.studentboard.controller.MainController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");

        MainController mainController = ac.getBean(MainController.class);
        mainController.controll();
    }
}
