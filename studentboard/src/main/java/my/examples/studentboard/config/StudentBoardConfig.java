package my.examples.studentboard.config;

import my.examples.studentboard.BoardUI;
import my.examples.studentboard.controller.MainController;
import my.examples.studentboard.dao.StudentDAO;
import my.examples.studentboard.util.JdbcUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

@Configuration
public class StudentBoardConfig {

    @Bean
    public JdbcUtil jdbcUtil() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/studentboard?autoReconnect=true&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "1234";

        return new JdbcUtil(driver, url, user, password);
    }

    @Bean
    public BoardUI boardUI(){
        return new BoardUI();
    }

    @Bean
    public StudentDAO studentDAO(){
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.setJdbcUtil(jdbcUtil());
        return studentDAO;
    }

    @Bean
    public MainController mainController(){
        MainController mainController = new MainController();
        mainController.setBoardUI(boardUI());
        mainController.setStudentDAO(studentDAO());
        return mainController;
    }
}
