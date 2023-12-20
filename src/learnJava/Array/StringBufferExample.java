package learnJava.Array;
public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // append(String str)
        stringBuffer.append(", World!");

        // insert(int offset, String str)
        stringBuffer.insert(6, "Java ");

        // replace(int start, int end, String str)
        stringBuffer.replace(0, 5, "Hi");

        // delete(int start, int end)
        stringBuffer.delete(0, 2);

        // reverse()
        stringBuffer.reverse();

        // toString() to convert to a regular String
        String result = stringBuffer.toString();

        System.out.println("Result: " + result);
    }
}
