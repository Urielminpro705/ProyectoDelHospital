import java.util.Scanner;

public class paciente {
    private String nombre;
    private String curp;
    private int edad;
    private String sintomas;
    private int prioridad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurp() {
        return curp;
    }

    public int getEdad() {
        return edad;
    }

    public  paciente(){}

    public void calcularPrioridad(){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿El paciente está conciente?");
        System.out.println("1) Si");
        System.out.println("2) No");
    }
}
