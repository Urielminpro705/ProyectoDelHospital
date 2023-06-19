import java.util.Scanner;

public class paciente {
    private String nombre; // Atributo para el nombre
    private String curp; // Atributo para la curp
    private int edad; // Atributo para la edad
    private String tipoSangre; // Atributo para el tipoSangre
    private String sintomas = ""; // Atributo para los sintomas
    private Integer prioridad; // Atributo para la prioridad

    public Integer getPrioridad() { // Funcion get
        return prioridad;
    }

    public void setNombre(String nombre) { // Funcion set
        this.nombre = nombre;
    }

    public void setCurp(String curp) { // Funcion set
        this.curp = curp;
    }

    public void setEdad(int edad) { // Funcion set
        this.edad = edad;
    }

    public void setPrioridad(int prioridad) { // Funcion set
        this.prioridad = prioridad;
    }

    public void setTipoSangre(String tipoSangre) { // Funcion set
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() { // Funcion get
        return tipoSangre;
    }

    public String getNombre() { // Funcion get
        return nombre;
    }

    public String getSintomas() { // Funcion get
        return sintomas;
    }

    public String getCurp() { // Funcion get
        return curp;
    }

    public int getEdad() { // Funcion get
        return edad;
    }

    public  paciente(){} // Metodo constructor

    // Funcion para calcular la prioridad de cada paciente
    public void calcularPrioridad(){
        Scanner lector = new Scanner(System.in);
        int opcion;
        // El sistema de prioridad funciona por puntos, entre mas puntos, mas prioridad
        // Un bebe tiene mas prioridad que un adulto, pero un anciano tiene mas que un bebe
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
            // Toda la seccion siguiente es para determinar que pacientes necesitan atencion mas rapido
            // basandose en el sistema de puntos de prioridad.
            // Son 3 preguntas principales, ¿está conciente?, ¿tiene hemorragia? y ¿Tiene fracturas?
            // Dentro de estas preguntas hay otras subpreguntas para hacer mas preciso el puntaje
            // Cada pregunta está dentro de un do-while para poder repetir la pregunta en caso de que se ingrese una opcion no valida
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
    
    // Funcion para agregar sintomas al registro
    public void sintomas(){
        Scanner lector = new Scanner(System.in);
        String opcion, personalizados;
        // Se muestra una lista de sintomas predefinidos, con la posibilidad de agregar otros que el usuario quiera
        System.out.println("--Escoge los sintomas--");
        System.out.println("1) Dolor de cabeza");
        System.out.println("2) Fiebre");
        System.out.println("3) Dolor en una zona en especifico");
        System.out.println("4) Mareos");
        System.out.println("5) Vomito");
        System.out.println("6) Diarrea");
        System.out.println("7) Dolor de garganta");
        System.out.println("8) Agregar algunos");
        System.out.println("*Puedes escoger varias opciones separandolas con coma (ejemplo: 1,2,3)");
        opcion = lector.nextLine(); // Se guardan las opciones seleccionadas en la variable opcion
        String[] sintomas2 = new String[7]; // Se guardan todas opciones seleccionadas en arreglo de tipo string
        sintomas2[0] = "Dolor de cabeza";
        sintomas2[1] = "Fiebre";
        sintomas2[2] = "Dolor en una zona en especifico";
        sintomas2[3] = "Mareos";
        sintomas2[4] = "Vomito";
        sintomas2[5] = "Diarrea";
        sintomas2[6] = "Dolor de garganta";
        opcion = opcion.replaceAll("\s+", ""); // Se eliminan espacios en opcion
        opcion = opcion.replaceAll(",", ""); // Se eliminan las comas en opcion
        char[] letras = opcion.toCharArray(); // Se convierte la variable opcion en un arreglo de caracteres
        // Se analiza cada caracter y se buscan coincidencias con las opciones disponibles
        // Cuando se encuentran se concatena la variable sintomas con la posicion correspondiente del arreglo sintomas
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
                if(letras[i] == '8'){ // Cuando es 8 es para agregar sintomas personalizados
                    System.out.println("Ingrese sus sintomas"); // Se imprime un mensaje
                    personalizados = lector.nextLine(); // Se leen los sintomas extras 
                    sintomas = sintomas + personalizados; // Se concatenan con los que ya existian
                }
            } else {
                // Esta segunda lista de if es para cuando ya existian sintomas en la variable sintomas.
                // Con el simple objetivo de agregar las comas para separar los sintomas
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
                if(letras[i] == '8'){
                    System.out.println("Ingrese sus sintomas");
                    personalizados = lector.nextLine();
                    sintomas = sintomas + ", " + personalizados;
                }
            }
        }
    }
}
