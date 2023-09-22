package homeTask06;

public class Test {
    public static void main(String[] args) {
        StringAndChars stringAndChars = new StringAndChars();

        System.out.println(stringAndChars.findSymbolOccurrence("teesetee", 'e'));
        System.out.println(stringAndChars.findSymbolOccurrence("teesetee", 'y'));

        System.out.println(stringAndChars.findWordPosition("test", "st"));
        System.out.println(stringAndChars.findWordPosition("test", "xz"));

        System.out.println(stringAndChars.stringReverse("Test"));

        System.out.println(stringAndChars.isPalindrome("ABBA"));
        System.out.println(stringAndChars.isPalindrome("ALLO"));

        new GuessWord().game();
    }
}
