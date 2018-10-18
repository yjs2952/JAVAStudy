package my.examples.studentboard.dao;

import my.examples.studentboard.util.JdbcUtil;
import my.examples.studentboard.vo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private JdbcUtil jdbcUtil;

    public void add(Student student) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = jdbcUtil.getConnection();
            String sql = "INSERT INTO student (name, kor_score, eng_score, math_score, reg_date) values (?, ?, ?, ?, now())";
            ps = conn.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getKorScore());
            ps.setInt(3, student.getEngScore());
            ps.setInt(4, student.getMathScore());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            jdbcUtil.close(conn, ps);
        }
    }

    public List<Student> getList() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Student> list = new ArrayList<>();

        try {
            conn = jdbcUtil.getConnection();
            String sql = "SELECT name, kor_score, eng_score, math_score FROM student ORDER BY reg_date";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                student.setName(rs.getString(1));
                student.setKorScore(rs.getInt(2));
                student.setEngScore(rs.getInt(3));
                student.setMathScore(rs.getInt(4));
                list.add(student);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            jdbcUtil.close(conn, ps, rs);
        }

        return list;
    }

    public void setJdbcUtil(JdbcUtil jdbcUtil) {
        this.jdbcUtil = jdbcUtil;
    }
}
