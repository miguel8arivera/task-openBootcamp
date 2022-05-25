public class Main {
    public static void main(String[] args) {

        var name = "kamila";
        System.out.println(name.length());

        var result=addition(20,30);
        System.out.println(result);

        Automovil nuevoAutomovil = new Automovil();

        nuevoAutomovil.aumentarPuertas();

        System.out.println(nuevoAutomovil.numeroPuerta);


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

