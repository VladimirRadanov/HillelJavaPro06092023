package homeTask09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogFileReader {
    private List<String> lines = new ArrayList<>();

    public List<String> readByLogLevel(String pathToLogFile, LogLevel logLevel) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToLogFile));) {
            lines = bufferedReader.lines()
                    .filter(e -> e.startsWith(logLevel.toString()))
                    .toList();
        } catch (FileNotFoundException exception) {
            System.out.println("Check path to log file");
        } catch (IOException exception) {
            System.out.println("Check if log file not blocked for writing");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return lines;
    }

}
