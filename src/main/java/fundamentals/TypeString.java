package fundamentals;

public class TypeString {
    public static void main(String[] args) {
        String words = "Hello World!";

        System.out.println(words.charAt(3));

        System.out.println(words.concat(" xD"));

        System.out.println(words.startsWith("h"));

        System.out.println(words.startsWith("H"));

        System.out.println(words.toLowerCase().startsWith("h"));

        System.out.println(words.endsWith("?"));

        System.out.println(words.length());

        // String don't use ==, but .equals
        System.out.println(words.equalsIgnoreCase("hello WoRlD!"));

        String sentence = "Any sentence";

        // Check if contains "ny" on the String
        System.out.println(sentence.contains("ny"));

        // Show where "ten" starts
        System.out.println(sentence.indexOf("ten"));

        // Starts on index 7
        System.out.println(sentence.substring(7));

        // Starts on index 7 and stops on index 10
        System.out.println(sentence.substring(7, 10));

        //Show length
        System.out.println(sentence.length());

    }
}
