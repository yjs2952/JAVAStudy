package example.myboard.dao;

import example.myboard.dto.Board;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardDao {
    private NamedParameterJdbcTemplate jdbc;
    private SimpleJdbcInsert insertAction;

    public BoardDao(DataSource dataSource) {
        System.out.println("BoardDao()");
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
        this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("board")
                .usingGeneratedKeyColumns("id");
    }

    public List<Board> getBoards(){
        String sql = "select id, name, title, content, regdate, read_count     " +
                "from board order by id desc";

        try {
            RowMapper<Board> rowMapper = BeanPropertyRowMapper.newInstance(Board.class);
            return jdbc.query(sql, rowMapper);
        } catch (Exception e) {
            return null;
        }
    }

    public Long addBoard(Board board) {
        SqlParameterSource params = new BeanPropertySqlParameterSource(board);
        return insertAction.executeAndReturnKey(params).longValue();
    }

    public int updateCount(Long id) {
        String sql = "UPDATE board SET read_count = read_count + 1 WHERE id = :id";
        Map<String, Long> map = new HashMap<>();
        map.put("id", 1L);
        return jdbc.update(sql, map);
    }

    public Board getBoard(Long id) {
        String sql = "SELECT id, name, title, content, regdate, read_count FROM board WHERE id = :id";

        try {
            RowMapper<Board> rowMapper = BeanPropertyRowMapper.newInstance(Board.class);
            Map<String, ?> params = Collections.singletonMap("id", id);
            return jdbc.queryForObject(sql, params, rowMapper);
        } catch (Exception e) {
            return null;
        }
    }

    public int updateBoard(Board board) {
        String sql = "UPDATE board " +
                    "SET title = :title, " +
                        "content = :content " +
                    "WHERE id = :id";
        Map<String, Object> map = new HashMap<>();
        map.put("title", board.getTitle());
        map.put("content", board.getContent());
        map.put("id", board.getId());
        return jdbc.update(sql, map);
    }

    public int deleteBoard(Long id) {
        String sql = "DELETE FROM board " +
                     "WHERE id = :id";
        Map<String, ?> map = Collections.singletonMap("id", id);
        return jdbc.update(sql, map);
    }
}
