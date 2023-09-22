package homeTask09.helper;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class LogFileHelper {
    public static void generateLogFile(String pathToLogDir, String logFileName) {

        if (!new File(pathToLogDir).exists()) {
            new File(pathToLogDir).mkdir();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToLogDir + logFileName));) {
            bufferedWriter.write("INFO: Starting JuniorCrudServiceApplication using Java 17.0.7\n");
            bufferedWriter.write("DEBUG: User admin created\n");
            bufferedWriter.write("INFO: Starting2 JuniorCrudServiceApplication using Java 17.0.7\n");
            bufferedWriter.write("DEBUG: User admin2 created\n");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void removeLogDir(String pathToLogDir) {
        if (new File(pathToLogDir).exists())
            try {
                FileUtils.cleanDirectory(new File(pathToLogDir.substring(0, pathToLogDir.length() - 3)));

            } catch (Exception exception) {
                exception.printStackTrace();
            }
    }
}
