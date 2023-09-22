package homeTask09;

import homeTask09.helper.LogFileHelper;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String pathToLogDir = "./src/test/resources/log";
        String logFileName = "/log.txt";
        LogFileReader logFileReader = new LogFileReader();
        List<String> list;
        String resultOutputHeader = "\n### Records with Log level: '%s'  ###";

        LogFileHelper.generateLogFile(pathToLogDir, logFileName);

        System.out.println(String.format(resultOutputHeader, LogLevel.INFO));
        list = logFileReader.readByLogLevel(pathToLogDir + logFileName, LogLevel.INFO);
        printList(list);

        System.out.println(String.format(resultOutputHeader, LogLevel.DEBUG));
        list = logFileReader.readByLogLevel(pathToLogDir + logFileName, LogLevel.DEBUG);
        printList(list);

        LogFileHelper.removeLogDir(pathToLogDir);

    }

    public static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
