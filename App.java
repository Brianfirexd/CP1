import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        boolean salir = true;
        int op;

        do {

            System.out.println("Ingrese una opcion. ");
            System.out.println("1. Escribir.");
            System.out.println("2. Leer.");
            System.out.println("3. Salir. ");
            op = leer.nextInt();
            leer.nextLine();


            switch (op) {
                case 1:
                System.out.println("Ingrese el Nombre que desea escribir en el fichero. ");
                String Name = leer.nextLine();
                Escribir(Name);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            
        } while (salir);
    }

    public static void Escribir(String nombre) {
        try {BufferedWriter writer = new BufferedWriter(new FileWriter("Nombres.txt",true)) {
            writer.write(nombre);
            writer.newLine();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void Leer() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Nombres.txt"))) {
            String linea;
            while (linea = reader.readLine()) != null {
                System.out.println(linea); 
            }
            
        } catch (IOException e) {
            e.printStackTrace();

        }
        
    }
}
