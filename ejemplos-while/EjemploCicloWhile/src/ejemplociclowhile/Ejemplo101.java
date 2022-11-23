
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author l1b3r4t0
 */
public class Ejemplo101 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla = 12;
        int contador = 1;
        int operacion;
        int tabla;
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        System.out.println("Ingrese el limite a generar");
        limite_tabla = entrada.nextInt();
        
        String cadena = ""; // cadena acumulador
        cadena = String.format("%sTabla de multiplicar\n", cadena);
        
        while (contador <= limite_tabla){
            operacion = tabla * contador;
            
            cadena = String.format("%s%d*%d=%d\n", 
                    cadena, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
        }
                
        System.out.printf("%s\n", cadena);
        
    }
}
