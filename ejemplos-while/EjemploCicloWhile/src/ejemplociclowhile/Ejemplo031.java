/*7
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 5;
        double contador = 1;
        int suma = 0;
        int valor_ingresado;
        double promedio;

        while (contador <= limite) {
            System.out.println("Ingrese la nota");
            valor_ingresado = entrada.nextInt();
            suma = suma + valor_ingresado;
            contador = contador + 1;
        }
        promedio = suma / limite;
        System.out.printf("La nota final es %f\nEl promedio es %.2f\n",
                suma,
                promedio);
    }
}
