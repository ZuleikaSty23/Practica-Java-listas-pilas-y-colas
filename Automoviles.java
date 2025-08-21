import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author alisonzuleikacruzmontes
 */
public class Automoviles {
    static Scanner escaner = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("Ingresa la marca, modelo y año de 5 automóviles:");

        ArrayList<String> marca = new ArrayList<>();
        System.out.println("Ingresa la marca:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Marca del automóvil " + (i + 1));
            marca.add(escaner.nextLine());
        }

        Queue<String> modelo = new LinkedList<>();
        System.out.println("Ingresar el modelo");
        for (int i = 0; i < 5; i++) {
            System.out.print("Modelo del automóvil " + (i + 1));
            modelo.add(escaner.nextLine());
        }

        Stack<String> anio = new Stack<>();
        System.out.println("Ingresar año");
        for (int i = 0; i < 5; i++) {
            System.out.print("Año del automóvil " + (i + 1));
            anio.push(escaner.nextLine());
        }

      
        System.out.println("Información de los automóviles");
        for (int i = 0; i < 5; i++) {
            String mar = marca.get(i);       
            String mod = modelo.poll();   
            String ani = anio.get(i);        

            System.out.println("Automóvil " + (i + 1) + ": Marca: " + mar + ", Modelo: " + mod + ", Año: " + anio);
        }
    }
}
