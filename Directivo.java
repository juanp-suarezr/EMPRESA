package EMPRESA;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Persona {

    private Character categoria;
    private Integer salarioa;

    public void SetCategoria(Character categoria){
        this.categoria = categoria;
    }

    public Character GetCategoria(){
        return this.categoria;
    }
    
    public void SetSalarioa(Integer salarioa){
        this.salarioa = salarioa;
    }

    public Integer GetSalario() {
        return this.salarioa;
    }

    List<String> nomb_ep1 =new ArrayList<String>();
    List<Integer> edad_ep1 = new ArrayList<Integer>();
    List<Integer> salario_ep1 = new ArrayList<Integer>(); 
    List<Character> categoria_ep = new ArrayList<Character>();

    List<Integer> sal_neto1 = new ArrayList<Integer>();
    
    
    public void calcular(){

        for (int i=-1; i!=0; ++i) {
            var calculo = salario_ep1.get(i+salario_ep1.size())*0.92;
            int añadir;
            añadir = (int) calculo;
            sal_neto1.add(añadir);
        }
    }

    public void mostrar() {

        System.out.println("SUELDO BRUTO: " +salario_ep1);
        for (int j=0; j<nomb_ep1.size(); j++) {
            
            System.out.println("El empleado de Categoria " +categoria_ep.get(j)+ " con nombre " +nomb_ep1.get(j)+ " tiene " +edad_ep1.get(j)+ " años y devenga un salario de $" +sal_neto1.get(j)+ " Pesos");
        }
        
        
    }
    
}
