import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Proyecto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Comparator<paciente> logica = new Comparator<paciente>() {
            @Override
            public int compare(paciente pac1, paciente pac2) {
                if (pac1.prioridad.compareTo(pac2.prioridad) > 0) {
                    return -1; // pac1 tiene mayor prioridad que pac2
                } else if (pac1.prioridad.compareTo(pac2.prioridad) < 0) {
                    return 1; // pac1 tiene menor prioridad que pac2
                } else {
                    return 0; // pac1 y pac2 tienen la misma prioridad
                }
            }
        };
        PriorityQueue<paciente> cola = new PriorityQueue<>(logica);
        int opcion;
        do{
            opcion = menuPrincipal();
            switch(opcion){
                case 1:
                    cola.offer(menuSecundario());
                break;

                case 2:
                    cola.poll();
                break;

                case 3:
                    imprimir(cola);
                break;

                case 4:
                    System.out.println("Adios");
                break;

                default:
                    System.out.println("Opcion no valida");
                break;
            }
        }while(opcion != 4);
        
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

    public static paciente menuSecundario() {
        Scanner lector = new Scanner(System.in);
        paciente nuevo = new paciente();
        System.out.println("\nIngresa el nombre");
        nuevo.setNombre(lector.nextLine());
        System.out.println("Ingresa la curp");
        nuevo.setCurp(lector.nextLine());
        System.out.println("Ingresa la edad");
        nuevo.setEdad(lector.nextInt());
        System.out.print("\n");
        nuevo.calcularPrioridad();
        System.out.print("\n");
        return nuevo;
    }

    public static void imprimir(PriorityQueue<paciente> cola) {
        System.out.println("\n---------------------------");
        for(paciente act : cola){
            System.out.println("Nombre: " + act.getNombre());
            System.out.println("CURP: " + act.getCurp());
            System.out.println("Edad: " + act.getEdad());
            System.out.println("Prioridad: " + act.prioridad + "\n");
        }
        System.out.println("---------------------------\n");
    }
}
