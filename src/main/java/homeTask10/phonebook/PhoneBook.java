package homeTask10.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (name.equals(record.getName())) return record;
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();

        for (Record record : records) {
            if (name.equals(record.getName())) result.add(record);
        }
        if (result.isEmpty()) {
            return null;
        } else return result;
    }
}
