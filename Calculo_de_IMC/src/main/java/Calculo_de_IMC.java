import java.util.Scanner;
import java.lang.Math;
public class Calculo_de_IMC {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Hola! Sigue los pasos a continuación para determinar tu índice de masa corporal.");
        System.out.println("Introduce tu peso en kilogramos.");
        double peso = p.nextDouble();
        System.out.println("Introduce tu estatura en metros.");
        double estatura =p.nextDouble();
        double indiceDeMasaCorporal = (peso/Math.pow(estatura,2));        
       System.out.println("Tu índice de masa corporal es " + indiceDeMasaCorporal + ".");
        
                        
    }
}
