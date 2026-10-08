import java.util.Scanner;

public class App {
    public static void main(String[] args) {   

    Scanner leer = new Scanner(System.in);
    double temperatura;
    int contadorTemperaturas = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Dame la temperatura");
            temperatura = leer.nextDouble();
            if (temperatura > 35.0) {
                contadorTemperaturas++;
            }
        }
        System.out.println("El número de temperaturas mayores a 35°C es: " + contadorTemperaturas);
        leer.close();
    }
    
}
