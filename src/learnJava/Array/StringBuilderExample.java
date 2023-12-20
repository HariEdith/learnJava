package learnJava.Array;
public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // append(String str)
        stringBuilder.append(", World!");
        System.out.println(stringBuilder);

        // insert(int offset, String str)
        stringBuilder.insert(6, "Java ");
        System.out.println(stringBuilder);
        
        // replace(int start, int end, String str)
        stringBuilder.replace(0, 5, "Hi");
        System.out.println(stringBuilder);

        // delete(int start, int end)
        stringBuilder.delete(0, 2);
        System.out.println(stringBuilder);

        // reverse()
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        // toString() to convert to a regular String
        String result = stringBuilder.toString();

        System.out.println("Result: " + result);
    }
}
