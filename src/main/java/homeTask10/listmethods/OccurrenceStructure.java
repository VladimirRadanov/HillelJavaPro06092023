package homeTask10.listmethods;

public class OccurrenceStructure {
    private String name;
    private int occurrence;

    public OccurrenceStructure(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}

