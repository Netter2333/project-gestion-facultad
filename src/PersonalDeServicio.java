public class PersonalDeServicio extends Empleado{
    private int seccion;
    public PersonalDeServicio(String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho, int seccion) {
        super(nombre, apellido, dni, estadoCivil, anioIncorp, numeroDespacho);
        this.seccion = seccion;
    }

    public void cambiarSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int obtenerDni() {return this.dni;}

    public int obtenerSeccion() {return this.seccion;}
}
