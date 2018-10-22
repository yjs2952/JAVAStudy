package examples.daoexam.dao;

import examples.daoexam.dto.Member;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.Map;

@Repository
public class MemberDao {
    private NamedParameterJdbcTemplate jdbc;
    // insert
    private SimpleJdbcInsert insertAction;

    public MemberDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);

        this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("member")
                .usingGeneratedKeyColumns("id");
    }

    public Long addMember(Member member) {
        // Member DTO의 내용을 읽어들여서 Insert문장에 바인딩할 값을 가지고 있는
        // SqlParameterSouce객체를 생성.
        SqlParameterSource params = new BeanPropertySqlParameterSource(member);

        //id가 자동으로 증가하지 않을 경우에는 다음과 같이 execute()메소드를 사용한다.
        //insertAction.execute(Map) or  insertAction.execute(SqlParameterSource)
        //insert가 실행되고, 자동으로 증가한 id값을 리턴한다.
        return insertAction.executeAndReturnKey(params).longValue();
    }

    public Member getMemberByEmail(String email) {
        String sql = "select id, name, email, password, regdate\n" +
                "from member where email = :email";
        try {
            // Member 값을 담아주는 규칙을 가지고 있는 RowMapper를 만든다.
            // Member.class정보를 읽어들여서 프로퍼티의 이름을 가지고 칼럼에 담아주는 규칙을 만든다.
            RowMapper<Member> rowMapper = BeanPropertyRowMapper.newInstance(Member.class);
            Map<String, ?> params = Collections.singletonMap("email", email);
            // 한건 or null 을 조회할 때는 queryForObject
            // 첫번째 파라미터 : sql
            // 두번째 파라미터 : 바인딩할 Map
            // 세번째 파라미터 : Mapper (칼럼을 DTO에 담아주기위한 규칙)
            return jdbc.queryForObject(sql, params, rowMapper);
        } catch (Exception ex) {
            return null;
        }

    }
}
