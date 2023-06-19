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
        int opcion;
        if(edad >= 0 && edad <=5){
            prioridad = 1;
        } else{
            if(edad > 60) {
                prioridad = 2;
            }
        }
        do{
            System.out.println("¿El paciente está conciente?");
            System.out.println("1) Si");
            System.out.println("2) No");
            opcion = lector.nextInt();
            if(opcion != 1 && opcion != 2){
                System.out.println("Opcion no valida");
            }
            else {
                if(opcion == 1){
                    do{
                        System.out.println("¿Tiene hemorragia?");
                        System.out.println("1) Si");
                        System.out.println("2) No");
                        opcion = lector.nextInt();
                        if(opcion != 1 && opcion != 2){
                            System.out.println("Opcion no valida");
                        }
                        else {
                            if(opcion == 1){
                                do{
                                    System.out.println("¿Pierde mucha sangre?");
                                    System.out.println("1) Si");
                                    System.out.println("2) No");
                                    opcion = lector.nextInt();
                                    if(opcion != 1 && opcion != 2){
                                        System.out.println("Opcion no valida");
                                    }
                                    else {
                                        if(opcion == 1){
                                            prioridad = prioridad + 60;
                                        }
                                        else {
                                            prioridad = prioridad + 40;
                                        }
                                    }
                                } while(opcion != 1 && opcion != 2);
                            } else {
                                prioridad = 0;
                            }
                        }
                        
                    }while(opcion != 1 && opcion != 2);
                }
                else 
                {
                    do{
                        System.out.println("¿Tiene hemorragia?");
                        System.out.println("1) Si");
                        System.out.println("2) No");
                        opcion = lector.nextInt();
                        if(opcion != 1 && opcion != 2){
                            System.out.println("Opcion no valida");
                        }
                        else {
                            if(opcion == 1){
                                do{
                                    System.out.println("¿Pierde mucha sangre?");
                                    System.out.println("1) Si");
                                    System.out.println("2) No");
                                    opcion = lector.nextInt();
                                    if(opcion != 1 && opcion != 2){
                                        System.out.println("Opcion no valida");
                                    }
                                    else{
                                        if(opcion == 1){
                                            prioridad = prioridad + 70;
                                        }
                                        else {
                                            prioridad = prioridad + 55;
                                        }
                                    }
                                }while(opcion != 1 && opcion != 2);
                            } else {
                                prioridad = prioridad + 40;
                            }
                        }
                    }while(opcion != 1 && opcion != 2);
                }
            }
        }while(opcion != 1 && opcion != 2);
    }
    
    /* 
    public void calcularPrioridad(){
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("Escoge ");
    }
    */
    
}
