import java.util.ArrayList;
import java.util.List;

public class AdminFacultad {
    private List<Estudiante> listaEstudiantes;
    private List<Profesor> listaProfesores;
    private List<PersonalDeServicio> listaPersonalDeServicio;
    private List<Persona> listaPersonas;

    // Inicializar Administrador
    public AdminFacultad () {
        listaEstudiantes = new ArrayList<>();
        listaProfesores = new ArrayList<>();
        listaPersonalDeServicio = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public void agregarProfesor(String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho, int depto) {
        Profesor profesor = new Profesor(nombre, apellido, dni, estadoCivil, anioIncorp, numeroDespacho, depto);
        listaProfesores.add(profesor);
        listaPersonas.add(profesor);
    }

    public void agregarEstudiante(String nombre, String apellido, int dni, int estadoCivil, int curso) {
        Estudiante estudiante = new Estudiante(nombre, apellido, dni, estadoCivil, curso);
        listaEstudiantes.add(estudiante);
        listaPersonas.add(estudiante);
    }

    public void agregarPersonalDeServicio(String nombre, String apellido, int dni, int estadoCivil, int anioIncorp, int numeroDespacho, int seccion) {
        PersonalDeServicio personal = new PersonalDeServicio(nombre, apellido, dni, estadoCivil, anioIncorp, numeroDespacho, seccion);
        listaPersonalDeServicio.add(personal);
        listaPersonas.add(personal);
    }

    public List<Estudiante> obtenerEstudiantes() {return listaEstudiantes;};

    public List<Profesor> obtenerProfesores() {return listaProfesores;};
    public void mostrarEstudiantesPorCurso(int curso) {
        System.out.println("--------Estudiantes---------");
        System.out.println("/* Curso: " + curso + " */");
        List<Estudiante> estudiantesDelCurso = new ArrayList<>();
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.obtenerCurso() == curso) {
                estudiantesDelCurso.add(estudiante);
                System.out.println("· " + estudiante.obtenerDni());
            }
        }

        if(estudiantesDelCurso.isEmpty()){
            System.out.println("No se encontraron estudiantes para el curso ingresado.");
        }

        System.out.println();
    }

    public void mostrarProfesoresPorDepto(int depto) {
        System.out.println("--------Profesores---------");
        System.out.println("/* Departamento: " + depto + " */");

        List<Profesor> profesoresDelDepto = new ArrayList<>();
        for (Profesor profesor : listaProfesores) {
            if (profesor.obtenerDepto() == depto) {
                profesoresDelDepto.add(profesor);
                System.out.println("· " + profesor.obtenerDni());
            }
        }

        if (profesoresDelDepto.isEmpty()) {
            System.out.println("No se encontraron profesores en este departamento. ");
        }

        System.out.println();
    }

    public void mostrarEstudiantes() {
        System.out.println("----------------------");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.obtenerDni());
        }
    }

    public void mostrarProfesores() {
        System.out.println("----------------------");
        for (Profesor profesor : listaProfesores) {
            System.out.println(profesor.obtenerDni());
        }
    }

    public void matricularEstudiante(int dni, int curso) {
        Estudiante e = buscarEstudiante(dni);

        if (e.obtenerDni() == 0) {
            System.out.println("No se encontro al estudiante.");
        }

        else {
            e.matricular(curso);
            System.out.println("El estudiante ha sido exitosamente matriculado al curso " + curso);
        }

    }

    public void cambiarEstadoCivil(int dni, int estadoCivil) {
        Persona p = buscarPersona(dni);

        if (p.obtenerDni() == 0) {
            System.out.println("No se encuentra a la persona seleccionada en la base de datos.");
        }

        else {
            System.out.println("Estado civil cambiado de " + p.obtenerEstadoCivil() + " a " + estadoCivil);
            p.cambiarEstadoCivil(estadoCivil);
        }
    }

    public void cambiarDepto(int dni, int depto){
        Profesor p = buscarProfesor(dni);

        if (p.obtenerDni() == 0) {
            System.out.println("No se encuentra a la persona seleccionada en la base de datos.");
        }

        else {
            System.out.println("Departamento cambiado de " + p.obtenerDepto() + " a " + depto);
            p.cambiarDepto(depto);
        }
    };

    public void trasladarPersonal(int dni, int seccion) {
        PersonalDeServicio pds = buscarPersonalDeServicio(dni);

        if (pds.obtenerDni() == 0) {
            System.out.println("No se encuentra a la persona seleccionada en la base de datos.");
        }

        else {
            System.out.println("Personal trasladado de " +  pds.obtenerSeccion() + " a " + seccion);
            pds.cambiarSeccion(seccion);
        }
    }

    private Persona buscarPersona(int dni) {
        Persona p = new Persona("","",0,-1);
        for (Persona persona : listaPersonas) {
            if (persona.obtenerDni() == dni) {
                p = persona;
                return p;
            }
        }
        return p;
    }
    private Estudiante buscarEstudiante(int dni) {
        Estudiante e = new Estudiante("", "", 0,-1,-1);
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.obtenerDni() == dni) {
                e = estudiante;
                return e;
            }
        }
        return e;
    }

    private Profesor buscarProfesor(int dni) {
        Profesor p = new Profesor("", "", 0,-1,-1, -1, -1);
        for (Profesor profesor : listaProfesores) {
            if (profesor.obtenerDni() == dni) {
                p = profesor;
                return p;
            }
        }
        return p;
    }

    private PersonalDeServicio buscarPersonalDeServicio(int dni) {
        PersonalDeServicio pds = new PersonalDeServicio("", "", 0,-1,-1,-1,-1);
        for (PersonalDeServicio personal : listaPersonalDeServicio) {
            if (personal.obtenerDni() == dni) {
                pds = personal;
                return pds;
            }
        }
        return pds;
    }
}

