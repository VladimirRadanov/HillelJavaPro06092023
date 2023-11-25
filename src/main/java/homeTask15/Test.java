package homeTask15;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {
        JdbcRepo jdbcRepo = new JdbcRepo();
        jdbcRepo.executeSql(SqlQuery.GET_ALL_HOMEWORKS_SQL);
        jdbcRepo.printHomeworkDetails();
    }

}
