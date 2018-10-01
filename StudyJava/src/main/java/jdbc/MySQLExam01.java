package jdbc;

import java.sql.*;

public class MySQLExam01 {
    public static void main(String[] args) {

        // JDBC에 연결하기 위한 인터페이스
        Connection conn = null;

        // JDBC에 SQL문 실행을 위한 인터페이스
        PreparedStatement ps = null;

        // 실행한 결과를 받기 위한 인터페이스
        ResultSet rs = null;

        // 쿼리문 준비
        String sql = "SELECT name FROM country";

        try {
            // 1. 드라이버
            Class.forName("com.mysql.cj.jdbc.Driver");

            // JDBC에 연결
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false&serverTimezone=UTC", "dbuser", "1234");

            // 쿼리문 준비
            ps = conn.prepareStatement(sql);

            // 쿼리문 실행
            rs = ps.executeQuery();

            // 조회내용 실행
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
