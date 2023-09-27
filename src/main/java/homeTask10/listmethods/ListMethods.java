package homeTask10.listmethods;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static int countOccurrence(List<String> list, String string) {
        List<String> arrayList = new ArrayList<>(list);
        arrayList.removeIf(s -> !s.equals(string));
        return arrayList.size();
    }

    public static <T> List<T> toList(T[] array) {
        List<T> arrayList = new ArrayList<>();
        for (T t : array) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static <T> List<T> findUnique(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j--);
                }
            }
        }
        return list;
    }

    public static String calcOccurrence(List<String> list) {
        List<String> listUnique = new ArrayList<>(list);
        findUnique(listUnique);
        StringBuilder result = new StringBuilder();

        int calc = 0;
        for (String string : listUnique) {
            result.append(string + ": ");
            for (String string1 : list) {
                if (string.equals(string1)) calc++;
            }
            result.append(calc + "\n");
            calc = 0;
        }
        return result.toString();
    }

    public static List<OccurrenceStructure> findOccurrence(List<String> list) {
        List<String> listUnique = new ArrayList<>(list);
        findUnique(listUnique);
        List<OccurrenceStructure> result = new ArrayList<>();

        int calc = 0;
        for (String string : listUnique) {
            for (String string1 : list) {
                if (string.equals(string1)) calc++;
            }
            result.add(new OccurrenceStructure(string, calc));
            calc = 0;
        }
        return result;
    }
}
