package classesandmethods;

public class Area {

    double raio;
    // Se eu coloco final na variável, eu nao consigo modificar o valor dela. Como pi é uma constante, é uma ÓTIMA opcao.
    // Quando eu crio uma constante (variavel usando final), eu troco o nome para maiusculo por convencao.
    final static double PI = 3.14;

    Area(double raioInicial) {
        raio = raioInicial;
    }

    double areaCirc (){
        return  PI * Math.pow(raio, 2);
    }
}