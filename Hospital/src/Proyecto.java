/*
Universidad De La Salle Bajío
Ingenieria en software y sistemas computacionales
Programacion Estructurada y Orientada a Objetos
Uriel Mata Castellanos 76907
Proyecto final de java
*/

//Código

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // Se usa un comparator para establecer la logica del PriorityQueue
        Comparator<paciente> logica = new Comparator<paciente>() {
            @Override
            public int compare(paciente pac1, paciente pac2) {
                if (pac1.getPrioridad() == 0 && pac2.getPrioridad() == 0) {
                    // Ambos tienen prioridad 0, se preserva el orden de llegada
                    return 0;
                } else if (pac1.getPrioridad() == 0) {
                    // pac1 tiene prioridad 0, se coloca después de pac2
                    return 1;
                } else if (pac2.getPrioridad() == 0) {
                    // pac2 tiene prioridad 0, se coloca antes de pac1
                    return -1;
                } else {
                    // Ambos tienen prioridad distinta de 0, se ordenan por prioridad
                    if (pac1.getPrioridad().compareTo(pac2.getPrioridad()) > 0) {
                        return -1; // pac1 tiene mayor prioridad que pac2
                    } else if (pac1.getPrioridad().compareTo(pac2.getPrioridad()) < 0) {
                        return 1; // pac1 tiene menor prioridad que pac2
                    } else {
                        return 0; // pac1 y pac2 tienen la misma prioridad distinta de 0
                    }
                }
            }
        };
        
        PriorityQueue<paciente> colaPrioridad = new PriorityQueue<>(logica);
        Queue<paciente> cola = new LinkedList<>();
        int opcion; // Se declara la variable opcion
        do{ // Ciclo que sirve para repetir el programa hasta que se escoga la opcion 4
            opcion = menuPrincipal(); // Se llama la funcion menuPrincipal() en la variable opcion
            switch(opcion){ // Se hace un switch con la variable opcion
                case 1:
                    paciente aux = menuSecundario();
                    if(aux.getPrioridad() == 0){
                        cola.add(aux);
                    }
                    else{
                        colaPrioridad.add(aux);
                    }
                break;

                case 2:
                    if(colaPrioridad.isEmpty() == false){
                        colaPrioridad.poll();
                    } else {
                        cola.poll();
                    }
                    
                break;

                case 3:
                    imprimir(colaPrioridad, cola); // Se llama a la funcion imprimir()
                break;

                case 4:
                    System.out.println("Adios"); // Se imprime un mensaje de despedida
                break;

                default:
                    System.out.println("Opcion no valida"); // Se imprime un mensaje de error
                break;
            }
        }while(opcion != 4); // El ciclo sigue hasta que la opcion sea 4
        
    }

    // Funcion para imprimir el menu de opciones principal
    public static int menuPrincipal() {
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("---Escoge una opcion---");
        System.out.println("1) Agregar paciente");
        System.out.println("2) Atender siguiente paciente");
        System.out.println("3) Mostrar paciente");
        System.out.println("4) Salir");
        opcion = lector.nextInt();
        return opcion; // Regresa la opcion seleccionada
    }

    // Funcion para imprimir el menu de opciones secundario
    public static paciente menuSecundario() {
        Scanner lector = new Scanner(System.in);
        paciente nuevo = new paciente(); // Se crea un objeto de tipo paciente
        System.out.println("\nIngresa el nombre"); 
        nuevo.setNombre(lector.nextLine()); // Se guarda el nombre
        System.out.println("Ingresa la curp"); 
        nuevo.setCurp(lector.nextLine()); // Se guarda la curp
        System.out.println("Ingresa la edad"); 
        nuevo.setEdad(lector.nextInt()); // Se guarda la edad
        System.out.println("Ingresa el tipo de sangre");
        nuevo.setTipoSangre(lector.next()); // Se guarda el tipo de sangre
        System.out.print("\n");
        nuevo.calcularPrioridad(); // Se llama a la funcion calcularPrioridad()
        System.out.print("\n");
        nuevo.sintomas(); // Se llama a la funcion sintomas()
        System.out.print("\n");
        return nuevo; // Regresa el objeto de tipo paciente
    }

    // Funcion para imprimir los pacientes
    public static void imprimir(PriorityQueue<paciente> cola1, Queue<paciente> cola2) {
        System.out.println("\n---------------------------");
        for(paciente act : cola1){
            System.out.println("Nombre: " + act.getNombre());
            System.out.println("CURP: " + act.getCurp());
            System.out.println("Edad: " + act.getEdad());
            System.out.println("Sangre: " + act.getTipoSangre());
            System.out.println("Sintomas: " + act.getSintomas());
            System.out.println("Prioridad: " + act.getPrioridad() + "\n");
        }
        for(paciente act : cola2){
            System.out.println("Nombre: " + act.getNombre());
            System.out.println("CURP: " + act.getCurp());
            System.out.println("Edad: " + act.getEdad());
            System.out.println("Sangre: " + act.getTipoSangre());
            System.out.println("Sintomas: " + act.getSintomas());
            System.out.println("Prioridad: " + act.getPrioridad() + "\n");
        }
        System.out.println("---------------------------\n");
    }
}
