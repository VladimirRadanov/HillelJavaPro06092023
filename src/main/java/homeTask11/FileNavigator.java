package homeTask11;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileNavigator {
    private final String pathToFiles;
    List<FileData> fileList = new ArrayList<>();

    public FileNavigator(String pathToFiles) {
        this.pathToFiles = pathToFiles;
    }

    public boolean add(FileData fileData) {
        boolean isAdded = false;
        //Add FileData object to List if FileData.filePath == filePath
        if (fileData.getFilePath().equals(pathToFiles)) {
            fileList.add(fileData);
            isAdded = true;
        }
        //Log to console if FileData.filePath != filePath
        else {
            System.out.println("Different path value for " + fileData.getFileName() + ":\n"
                    + this.getClass().getSimpleName() + ":\t" + pathToFiles + "\n"
                    + fileData.getClass().getSimpleName() + ":\t\t" + fileData.getFilePath() + "\n"
            );
        }
        return isAdded;
    }

    // return fist of files from path set in parameter
    public List<FileData> find(String filePath) {
        if (filePath.equals(this.pathToFiles)) return fileList;
        return null;
    }

    // returns list of files with size in bytes <= set in parameter
    public List<FileData> filterBySize(long fileSize) {
        return fileList.stream()
                .filter(s -> s.getFileSize() <= fileSize)
                .toList();
    }

    // removes files and path set in parameter
    public boolean remove(String filePath) throws IOException {
        boolean isRemoved = false;
        if (filePath.equals(this.pathToFiles)) {
            File file = new File(filePath);
            if (new File(filePath).exists()) {
                FileUtils.deleteDirectory(file);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    // sorts files by size and returns list of sorted files
    public List<FileData> sortBySize() {
        return fileList.stream()
                .sorted(Comparator.comparingLong(FileData::getFileSize))
                .toList();
    }

}
