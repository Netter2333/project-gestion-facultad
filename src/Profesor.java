public class Profesor extends Empleado{
    private int depto;
    public Profesor(String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho, int depto) {
        super(nombre, apellido, dni, estadoCivil, anioIncorp, numeroDespacho);
        this.depto = depto;
    }

    public void cambiarDepto(int depto) {
        this.depto = depto;
    }

    public int obtenerDepto () {return this.depto;}

    public int obtenerDni() {return this.dni;}

}
