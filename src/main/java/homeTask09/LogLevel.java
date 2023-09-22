package homeTask09;

public enum LogLevel {

    INFO("INFO:"),
    DEBUG("DEBUG:");

    private String logLevelValue;

    LogLevel(String logLevelValue) {
        this.logLevelValue = logLevelValue;
    }

    @Override
    public String toString() {
        return logLevelValue;
    }
}
