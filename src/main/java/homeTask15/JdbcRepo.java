package homeTask15;

import java.sql.*;

public class JdbcRepo {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private void getConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/hillel_homework",
                    "postgres",
                    "admin");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection() throws SQLException {
        if (null != resultSet) resultSet.close();
        if (null != preparedStatement) preparedStatement.close();
        if (null != connection) connection.close();
    }

    public void executeSql(SqlQuery sqlQuery) throws SQLException {
        getConnection();
        resultSet = connection.prepareStatement(sqlQuery.toString()).executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }
        closeConnection();
    }

    public void printHomeworkDetails() throws SQLException {
        getConnection();
        resultSet = connection
                .prepareStatement(SqlQuery.GET_HOMEWORK_DETAILS.toString())
                .executeQuery();
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString(1) + "\t" +
                            resultSet.getString(2) + "\t" +
                            resultSet.getString(3) + "\t" +
                            resultSet.getString(4) + "\t" +
                            resultSet.getString(5) + "\t" +
                            resultSet.getString(6)
            );
        }
        closeConnection();
    }

}
