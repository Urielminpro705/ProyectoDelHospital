import java.util.PriorityQueue;
import java.util.Scanner;
public class Proyecto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
    }

    public static int menuPrincipal() {
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("---Escoge una opcion---");
        System.out.println("1) Agregar paciente");
        System.out.println("2) Atender siguiente paciente");
        System.out.println("3) Mostrar paciente");
        System.out.println("4) Salir");
        opcion = lector.nextInt();
        return opcion;
    }

    public static int menuSecundario() {
        Scanner lector = new Scanner(System.in);
        int opcion;
        paciente nuevo = new paciente();
        System.out.println("Ingresa el nombre");
        nuevo.setNombre(lector.nextLine());
        System.out.println("Ingresa la curp");
        nuevo.setCurp(lector.nextLine());
        System.out.println("Ingresa la edad");
        nuevo.setEdad(lector.nextInt());
        opcion = lector.nextInt();
        return opcion;
    }
}
