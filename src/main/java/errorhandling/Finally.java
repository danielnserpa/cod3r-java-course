package errorhandling;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);



        try {
            System.out.println(7/entrada.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // WWith finally, even if there's an error like / by 0, it will call finally
            // Forces something to execute independently of having and error or not
        } finally {
            System.out.println("Finally...");
            entrada.close();
        }
    }
}
