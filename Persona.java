package EMPRESA;

public abstract class Persona {
    private String nombre;
    private Integer edad;

    public abstract void mostrar(); //metodod abstracto

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String GetNombre() {
        return this.nombre;
    }

    public void SetEdad(Integer edad){
        this.edad = edad;
    }

    public Integer GetEdad(){
        return this.edad;
    }
}
