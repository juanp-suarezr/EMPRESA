package EMPRESA;

import java.util.ArrayList;
import java.util.List;

import org.graalvm.compiler.nodes.java.NewArrayNode;

public class Empleado extends Persona {
    private Integer salario;
    
    public void SetSalario(Integer salario) {
        this.salario = salario;

    }

    public Integer GetSalario() {
        return this.salario;
    }
    
    List<String> nomb_ep =new ArrayList<String>();
    List<Integer> edad_ep = new ArrayList<Integer>();
    List<Integer> salario_ep = new ArrayList<Integer>();
    
    List<Integer> sal_neto = new ArrayList<Integer>();

    public void calcular(){

        for (int i=-1; i!=0; ++i) {
            var calculo = salario_ep.get(i+salario_ep.size())*0.92;
            int añadir;
            añadir = (int) calculo;
            sal_neto.add(añadir);
        }
    }
        
        
    

    @Override
    public void mostrar() {
    
        System.out.println("SUELDO BRUTO: " +salario_ep);
        for (int i=0; i<nomb_ep.size(); i++) {

            System.out.println("El empleado de nombre " +nomb_ep.get(i)+ " tiene " +edad_ep.get(i)+ " años y devenga un salario de $" +sal_neto.get(i)+ " Pesos");
        }
        
    }
}
