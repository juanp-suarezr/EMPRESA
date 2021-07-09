package EMPRESA;
import EMPRESA.*;
import java.util.Scanner;


public class Principal {
    
    public static void Opinion() {
        var sc = new Scanner(System.in);
        Integer Mn = sc.nextInt();} 
    
                
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        Empresa emp = new Empresa();
        Cliente cl = new Cliente();
        Empleado ep = new Empleado();
        Directivo dir = new Directivo();
        Menu menu = new Menu();
        Principal Pr = new Principal();
        

        System.out.println("Bienvenido a base de datos de la empresa " +emp.nom_empresa);
        System.out.println("--------------------------------------");
        
        
        menu.Presentar(); 
        Integer Mn = 0;
        Mn = sc.nextInt();
        
        
    
        while (Mn != 5) {
            
            if (1==Mn) {
                System.out.print("\033[H\033[2J");
                menu.Asignacion();
                var categ = sc.next().toUpperCase();
                Character categoria = categ.charAt(0);
                dir.SetCategoria(categoria);
                if ('A' == categoria) {
                    dir.categoria_ep.add('A');
                    var scaa = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del Directivo: " );
                    String nombre = scaa.nextLine();
                    dir.SetNombre(nombre); 
                    dir.nomb_ep1.add(nombre);

                    System.out.println("Ingrese la edad del Directivo " +nombre+ " :" );
                    Integer edad = scaa.nextInt();
                    dir.SetEdad(edad);
                    dir.edad_ep1.add(edad);
                
                    System.out.println("Ingrese el salario del Directivo " +nombre+ " :" );
                    Integer salario = sc.nextInt();
                    dir.SetSalarioa(salario);
                    dir.salario_ep1.add(salario);
                    dir.calcular();
                    System.out.print("\033[H\033[2J");
                    menu.Presentar(); 
                    Mn = scaa.nextInt();
                    System.out.print("\033[H\033[2J");
                    



                } else if('C' == categoria) {
                    var sca = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del Empleado: " );
                    String nombre = sca.nextLine();
                    ep.SetNombre(nombre); 
                    ep.nomb_ep.add(nombre);

                    System.out.println("Ingrese la edad del Empleado " +nombre+ " :" );
                    Integer edad = sca.nextInt();
                    ep.SetEdad(edad);
                    ep.edad_ep.add(edad);
                
                    System.out.println("Ingrese el salario del empleado " +nombre+ " :" );
                    Integer salario = sc.nextInt();
                    ep.SetSalario(salario);
                    ep.salario_ep.add(salario);
                    ep.calcular();
                    System.out.print("\033[H\033[2J");
                    menu.Presentar(); 
                    Mn = sca.nextInt();
                    System.out.print("\033[H\033[2J");
               } else { 
                   var sca = new Scanner(System.in);   
                   System.out.println("Categoria inexistente" );
                   System.out.println("Vuelva a empezar desde el inicio porfavor" );
                   menu.Presentar(); 
                   Mn = sca.nextInt();
                   System.out.print("\033[H\033[2J");
                }
               } else if (2 == Mn) {
                   var sc2 = new Scanner(System.in);
                   System.out.println("Ingrese el nombre del Cliente: " );
                   String nombre = sc2.nextLine();
                   cl.SetNombre(nombre); 
                   cl.nomb_cl.add(nombre);

                   System.out.println("Ingrese la edad del CLIENTE " +nombre+ " :" );
                   Integer edad = sc2.nextInt();
                   cl.SetEdad(edad);
                   cl.edad_cl.add(edad);
            
                   System.out.println("Ingrese el telefono del cliente " +nombre+ " :" );
                   Long telef = sc.nextLong();
                   cl.SetTelefono(telef);
                   String telefono = telef.toString();
                   
                   cl.telefono_cl.add(telefono);
                   
                   System.out.print("\033[H\033[2J");
                   menu.Presentar(); 
                   Mn = sc2.nextInt();
                   System.out.print("\033[H\033[2J");

                       
               } else if (3 == Mn) {
                   var sc3 = new Scanner(System.in);

                   System.out.println("Digite el nuevo nombre de la empresa");
                   emp.nom_empresa = sc3.nextLine();
                   menu.Presentar(); 
                   Mn = sc3.nextInt();
                   System.out.print("\033[H\033[2J");

               } else if (4 == Mn) {
                   var sc4 = new Scanner(System.in);
                   System.out.println("EMPRESA");
                   System.out.println(emp.nom_empresa);
                   System.out.println("----------------");
                   System.out.println("EMPLEADOS");
                   ep.mostrar();
                   System.out.println("...........");
                   System.out.println("DIRECTIVOS");
                   dir.mostrar();
                   System.out.println("----------------");
                   System.out.println("CLIENTES");
                   cl.mostrar();

                   System.out.println("Enter para continuar");
                   sc4.nextLine();
                   System.out.print("\033[H\033[2J");
                   menu.Presentar(); 
                   Mn = sc4.nextInt();
                   System.out.print("\033[H\033[2J");

            } 

            
        } 

            
        
        System.out.println("Saliendo");
    }
}
        
        
        
   
    
    
