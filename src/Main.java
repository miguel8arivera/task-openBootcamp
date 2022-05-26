public class Main {
    public static void main(String[] args) {



        var result=addition(20,30);
        System.out.println(result);

        Automovil nuevoAutomovil = new Automovil();

        nuevoAutomovil.aumentarPuertas();

        System.out.println(nuevoAutomovil.numeroPuerta);
// Condicionales
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("EL numero es mayor que 0");
        } else if (numeroIf< 0) {
            System.out.println("El numero es menor que 0");
        }else {
            System.out.println("El numero es 0");
        }


// Ciclos

int numero = 0;
while(numero < 3){
    System.out.println(numero);
    numero = numero +1;
}

int numero2 = 3;
do{
    System.out.println(numero2);
    numero2 = numero2 -1;
}while(numero2>3);



for(int contador  = 0; contador <=10; contador++){
    System.out.println(contador);
}

// estructura de control switch

        var season = "Fall";
        switch (season){
            case "Summer" : {
                   System.out.println("La estacion es Verano");
                   break;
            }
            case "Spring":{
                System.out.println("La estacion es Primavera");
                break;
            }
            case "Fall":{
                System.out.println("La estacion es Otoño");
                break;
            }
            case "Winter":{
                System.out.println("La estacion es Invierno");
                break;
            }
            default: System.out.println("No es ninguna estacion");
        }

        Persona persona = new Persona();
            persona.setName("Miguel");
            persona.setEdad(26);
            persona.setTelefono(123456789);

            System.out.println(persona.getName());
            System.out.println(persona.getEdad());
            System.out.println(persona.getTelefono());
    }

static int addition(int a, int b){
        return a +b;
}
}

class Automovil {
    public int numeroPuerta =3;

    public void aumentarPuertas(){
        this.numeroPuerta ++;
    }
}

class Persona {
    private int edad;
    private String name;
    private int telefono;

    // Setters
    public void setEdad(int edad){
        this.edad = edad;
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    //Getters

    public int getEdad(){
        return this.edad;
    }

    public String getName(){
        return this.name;
    }

    public int getTelefono(){
        return this.telefono;
    }
}


