package fundamentals;

public class OperadorTernario {
    public static void main(String[] args) {


        double average = 7.6;
        String result = average >= 7.0 ? "Pass" : "Fail";

        System.out.println(result);

        // Creating a String called result that takes the value of (if average is equal or higher than 7.6, result = "Pass". If not, result = "Fail".

        // String result = average => 7.0 ? "Pass" : "Fail";

        String resultado = average <= 8 ? "Not good" : "Congrats";

        System.out.println(resultado);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String rslt = temDesconto ? "Sim" : "Nao";

        System.out.println("Tem desconto?" + rslt);



    }
}
