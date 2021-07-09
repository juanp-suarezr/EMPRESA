package EMPRESA;
import java.util.ArrayList;
import java.util.List;

import EMPRESA.Persona;

public class Cliente extends Persona{
    
    private Long telefono = 3008634104L;

    public void SetTelefono(Long telefono2) { 
        this.telefono = telefono;
    }

    public Long GetTelefono() {
        return this.telefono;
    }

    List<String> nomb_cl =new ArrayList<String>();
    List<Integer> edad_cl = new ArrayList<Integer>();
    List<String> telefono_cl = new ArrayList<String>();

    @Override
    public void mostrar() {

        for (int i=0; i<nomb_cl.size(); i++) {

            System.out.println("El Cliente de nombre " +nomb_cl.get(i)+ " tiene " +edad_cl.get(i)+ " años y su numero de telefono es " +telefono_cl.get(i));
        }
    }
}