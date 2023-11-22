package homeTask15;

public enum SqlQuery {
    GET_ALL_HOMEWORKS_SQL("SELECT * FROM homework"),
    GET_HOMEWORK_DETAILS("SELECT homework.name, homework.description,\n" +
            "       lesson.name, lesson.updatedat,\n" +
            "       schedule.name, schedule.updatedat\n" +
            "FROM homework\n" +
            "INNER JOIN lesson ON homework.id = lesson.homework_id\n" +
            "INNER JOIN schedule ON lesson.id = schedule.lessons;");

    private final String sql;

    SqlQuery(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return sql;
    }
}
