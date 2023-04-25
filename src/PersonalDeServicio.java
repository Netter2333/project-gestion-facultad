public class PersonalDeServicio extends Empleado{
    private int seccion;
    public PersonalDeServicio(String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho) {
        super(nombre, apellido, dni, estadoCivil, anioIncorp, numeroDespacho);
    }

    public void cambiarSeccion(int seccion) {
        this.seccion = seccion;
    }
}
