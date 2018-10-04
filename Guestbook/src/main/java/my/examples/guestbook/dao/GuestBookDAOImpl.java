package my.examples.guestbook.dao;

import my.examples.guestbook.servlet.Guestbook;
import my.examples.guestbook.utils.JDBCHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestBookDAOImpl implements GuestbookDAO{
    private String dbUrl = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false&serverTimezone=UTC";
    private String dbId = "root";
    private String dbPassword = "1234";

    @Override
    public List<Guestbook> getList() {
        List<Guestbook> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCHelper.connect(dbUrl, dbId, dbPassword);

            String sql = "SELECT guest_id, name, content, reg_date FROM guestbook ORDER BY guest_id DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Guestbook guestbook = new Guestbook();
                guestbook.setId(rs.getLong(1));
                guestbook.setName(rs.getString(2));
                guestbook.setContent(rs.getString(3));

                Date dbDate = rs.getDate(4);
                java.util.Date date = new Date(dbDate.getTime());
                LocalDateTime ldt = date.toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDateTime();
                guestbook.setRegate(ldt);
                list.add(guestbook);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCHelper.close(conn, ps, rs);
        }

        return list;
    }

    @Override
    public int addGuestbook(Guestbook guestbook) {
        int result = 0;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JDBCHelper.connect(dbUrl, dbId, dbPassword);

            String sql = "INSERT INTO guestbook (name, content, reg_date) values (?, ?, now())";
            ps = conn.prepareStatement(sql);
            ps.setString(1, guestbook.getName());
            ps.setString(2,guestbook.getContent());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCHelper.close(conn, ps);
        }
        return result;
    }

    @Override
    public int deleteGuestbook(int id) {
        return 0;
    }
}
