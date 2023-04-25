import java.util.ArrayList;
import java.util.List;

public class AdminFacultad {
    private List<Estudiante> listaEstudiantes;
    private List<Profesor> listaProfesores;
    private List<PersonalDeServicio> listaPersonalDeServicio;

    // Inicializar Administrador
    public AdminFacultad () {
        listaEstudiantes = new ArrayList<>();
        listaProfesores = new ArrayList<>();
        listaPersonalDeServicio = new ArrayList<>();
    }

    public void agregarProfesor(String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho) {
        Profesor profesor = new Profesor(nombre, apellido, dni, estadoCivil, anioIncorp, numeroDespacho);
        listaProfesores.add(profesor);
    }

    public void agregarEstudiante(String nombre, String apellido, int dni, int estadoCivil, int curso) {
        Estudiante estudiante = new Estudiante(nombre, apellido, dni, estadoCivil, curso);
        listaEstudiantes.add(estudiante);
    }

    public void agregarPersonalDeServicio(String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho) {
        PersonalDeServicio personal = new PersonalDeServicio(nombre, apellido, dni, estadoCivil, anioIncorp, numeroDespacho);
        listaPersonalDeServicio.add(personal);
    }

    public List<Estudiante> obtenerEstudiantes() {return listaEstudiantes;};

    public List<Profesor> obtenerProfesores() {return listaProfesores;};
    public List<Estudiante> obtenerEstudiantesPorCurso(int curso) {
        List<Estudiante> estudiantesDelCurso = new ArrayList<>();
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.obtenerCurso() == curso) {
                estudiantesDelCurso.add(estudiante);
            }
        }
        return estudiantesDelCurso;
    }

    public List<Profesor> obtenerProfesoresPorDepto(int depto) {
        List<Profesor> profesoresDelDepto = new ArrayList<>();
        for (Profesor profesor : listaProfesores) {
            if (profesor.obtenerDepto() == depto) {
                profesoresDelDepto.add(profesor);
            }
        }
        return profesoresDelDepto;
    }

}
