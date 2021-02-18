public class Main {


    public static void main(String[] arqs){
        Persona P1 = new Persona();
        Persona P2 = new Persona();

        P1.SetNombre("Sofia");
        P2.SetNombre("Alan");

        P1.CumplirAnios();
        P1.CumplirAnios();
        P1.CumplirAnios();
        P1.CumplirAnios();

        P2.CumplirAnios();
        P2.CumplirAnios();

        System.out.println(P1.getNombre() + " tiene " + P1.getEdad() + " años");
        System.out.println(P2.getNombre() + " tiene " + P2.getEdad() + " años");
    }
}

class Persona{

    private int Edad;
    private String Nombre;

    public void SetNombre(String Nombre) {
    this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void CumplirAnios() {
        Edad++;
    }

    public int getEdad() {
        return Edad;
    }

}
