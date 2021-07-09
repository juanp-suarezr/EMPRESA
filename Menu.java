package EMPRESA;
import java.util.Scanner;

public class Menu {
    
    public static void Presentar() { 
        
        System.out.println("Menu ----- ");
        System.out.println("1. Añadir Empleado"); 
        System.out.println("2. Añadir Cliente");
        System.out.println("3. Editar nombre Empresa");
        System.out.println("4. MOSTRAR ACUTALIZACIÓN");
        System.out.println("5. SALIR");
        System.out.println("----------------------");

        System.out.println("Digite el numero que desea realizar (1-5) ");
    
    }

    public static void Asignacion(){
        System.out.println("----------------------");
        System.out.println("CATEGORIA");
        System.out.println("----------------------");
        System.out.println("A. DIRECTIVO");
        System.out.println("C. EMPLEADO");
        System.out.println("Digite la letra que correspondiente a cada categoria (A o C) ");
    }
}
