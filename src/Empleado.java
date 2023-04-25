public class Empleado extends Persona{
    private int anioIncorp;
    private int numeroDespacho;

    public Empleado (String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorp = anioIncorp;
        this.numeroDespacho = numeroDespacho;
    }
}
