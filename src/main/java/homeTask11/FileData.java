package homeTask11;

import java.io.File;

public class FileData {
    public FileData(String fullPathToFile) {
        this.file = new File(fullPathToFile);
        setProperties();
    }

    private final File file;
    private String fileName;
    private long fileSize;
    private String filePath;

    private void setProperties() {
        if (file.exists()) {
            fileName = file.getName();
            fileSize = file.length();
            filePath = file.getParent();
        } else {
            fileName = "";
            fileSize = 0;
            filePath = "";
        }
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "fileName:" + fileName + "\t\tfileSize:" + fileSize + "\t\tfilePath:" + filePath;
    }
}
