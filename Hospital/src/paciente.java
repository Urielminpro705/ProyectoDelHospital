import java.util.Scanner;

public class paciente {
    private String nombre;
    private String curp;
    private int edad;
    private String tipoSangre;
    private String sintomas = "";
    private Integer prioridad;

    public Integer getPrioridad() {
        return prioridad;
    }

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

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintomas() {
        return sintomas;
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
            if(edad >= 60) {
                prioridad = 2;
            }
            else{
                prioridad = 0;
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
                                            prioridad = prioridad + 30;
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
                                            prioridad = prioridad + 80;
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

        do{
            System.out.println("¿Tiene fracturas?");
            System.out.println("1) Si");
            System.out.println("2) No");
            opcion = lector.nextInt();
            if(opcion == 1){
                do{
                    System.out.println("¿Es en alguna zona vital?");
                    System.out.println("1) Si");
                    System.out.println("2) No");
                    opcion = lector.nextInt();
                    if(opcion == 1){
                        prioridad = prioridad + 6;
                    }
                    else{
                        prioridad = prioridad + 3;
                    }
                }while(opcion != 1 && opcion != 2);            
            }
        }while(opcion != 1 && opcion != 2);    
    }
    
    public void sintomas(){
        Scanner lector = new Scanner(System.in);
        String opcion;
        System.out.println("--Escoge los sintomas--");
        System.out.println("1) Dolor de cabeza");
        System.out.println("2) Fiebre");
        System.out.println("3) Dolor en una zona en especifico");
        System.out.println("4) Mareos");
        System.out.println("5) Vomito");
        System.out.println("6) Diarrea");
        System.out.println("7) Dolor de garganta");
        System.out.println("8) Ninguno de estos");
        opcion = lector.nextLine();
        String[] sintomas2 = new String[7];
        sintomas2[0] = "Dolor de cabeza";
        sintomas2[1] = "Fiebre";
        sintomas2[2] = "Dolor en una zona en especifico";
        sintomas2[3] = "Mareos";
        sintomas2[4] = "Vomito";
        sintomas2[5] = "Diarrea";
        sintomas2[6] = "Dolor de garganta";
        opcion = opcion.replaceAll("\s+", "");
        opcion = opcion.replaceAll(",", "");
        char[] letras = opcion.toCharArray();
        for(int i = 0; i < letras.length; i++){
            if(i == 0){
                if(letras[i] == '1'){
                sintomas = sintomas2[0]; 
                }
                if(letras[i] == '2'){
                    sintomas = sintomas2[1]; 
                }
                if(letras[i] == '3'){
                    sintomas = sintomas2[2]; 
                }
                if(letras[i] == '4'){
                    sintomas = sintomas2[3]; 
                }
                if(letras[i] == '5'){
                    sintomas = sintomas2[4]; 
                }
                if(letras[i] == '6'){
                    sintomas = sintomas2[5]; 
                }
                if(letras[i] == '7'){
                    sintomas = sintomas2[6]; 
                }
            } else {
                if(letras[i] == '1'){
                sintomas = sintomas + ", " + sintomas2[0]; 
                }
                if(letras[i] == '2'){
                    sintomas = sintomas + ", " + sintomas2[1]; 
                }
                if(letras[i] == '3'){
                    sintomas = sintomas + ", " + sintomas2[2]; 
                }
                if(letras[i] == '4'){
                    sintomas = sintomas + ", " + sintomas2[3]; 
                }
                if(letras[i] == '5'){
                    sintomas = sintomas + ", " + sintomas2[4]; 
                }
                if(letras[i] == '6'){
                    sintomas = sintomas + ", " + sintomas2[5]; 
                }
                if(letras[i] == '7'){
                    sintomas = sintomas + ", " + sintomas2[6]; 
                }
            }
        }
    }
}
