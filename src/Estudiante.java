public class Estudiante extends Persona{
    private int curso;
    public Estudiante(String nombre, String apellido, int dni, int estadoCivil, int curso) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public void matricular(int curso) {
        this.curso = curso;
    }

    public int obtenerCurso() {
        return this.curso;
    }

    public int obtenerDni() {return this.dni;}
}
