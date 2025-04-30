package errorhandling;

public class CheckedVsNonChecked {

    public static void main(String[] args) {



        try {
            generateError1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            generateError2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("The end");

    }

    // Non checked doesn't need to be treated necessarily
    // Tem a liberdade de "voce quer ou nao" tratar o erro
    static void generateError1() {
        throw new RuntimeException("There's an error #01");

    }

    // Checked has to be treated and used throws
    static void generateError2() throws Exception {
        throw new Exception("There's another error #2");
    }

}
