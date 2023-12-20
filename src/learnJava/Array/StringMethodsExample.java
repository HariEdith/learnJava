package learnJava.Array;
public class StringMethodsExample {
    public static void main(String[] args) {
        // Create a sample string
        String text = "Hello, World!";

        // charAt(int index)
        char firstChar = text.charAt(0);
        System.out.println("First character: " + firstChar);

        // length()
        int length = text.length();
        System.out.println("Length of the string: " + length);

        // substring(int beginIndex)
        String substring1 = text.substring(7);
        System.out.println("Substring from index 7: " + substring1);

        // indexOf(String str)
        int indexOfComma = text.indexOf(",");
        System.out.println("Index of ',' character: " + indexOfComma);

        // toLowerCase() and toUpperCase()
        String lowercaseText = text.toLowerCase();
        String uppercaseText = text.toUpperCase();
        System.out.println("Lowercase: " + lowercaseText);
        System.out.println("Uppercase: " + uppercaseText);

        // trim()
        String stringWithWhitespace = "   Trim me!   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // startsWith(String prefix) and endsWith(String suffix)
        boolean startsWithHello = text.startsWith("Hello");
        boolean endsWithExclamation = text.endsWith("!");

        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with '!': " + endsWithExclamation);

        // replace(char oldChar, char newChar)
        String replacedText = text.replace('o', '0');
        System.out.println("Text with 'o' replaced by '0': " + replacedText);

        // split(String regex)
        String csvData = "John,Doe,30,New York";
        String[] parts = csvData.split(",");
        System.out.println("CSV Data:");
        for (String part : parts) {
            System.out.println(part);
        }

        // isEmpty()
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);
    }
}
