public class Main {
    public static void main(String[] args) {
        // inicializo el administrador
        AdminFacultad adm = new AdminFacultad();

        // cargo datos de personas

        adm.agregarEstudiante("Juan", "Perez", 12345678, 1,1);
        adm.agregarEstudiante("Maria", "Juarez", 25335675, 2,3);
        adm.agregarEstudiante("Dan", "Smith", 42345321, 0,1);
        adm.agregarEstudiante("Jose", "Rodriguez", 22345999, 1,1);

        adm.agregarProfesor("Martin", "Dominguez", 33333333, 2, 2018, 55, 2);
        adm.agregarProfesor("Juana", "Rodriguez", 23323931, 3, 2019, 22, 3);
        adm.agregarProfesor("Luciana", "Paz", 23353334, 1, 2017, 5, 2);

        adm.agregarPersonalDeServicio("Marcelo", "Cannoli", 40111233, 0,2022, 33, 1);
        adm.agregarPersonalDeServicio("Lucia", "Einstein", 36115231, 1,2021, 11, 2);
        adm.agregarPersonalDeServicio("Marta", "Bonaparte", 41131234, 0,2022, 3, 2);

        // testeo los metodos

        adm.mostrarEstudiantesPorCurso(1);
        adm.mostrarProfesoresPorDepto(2);
        adm.mostrarEstudiantesPorCurso(0);
        adm.mostrarProfesoresPorDepto(20);

        adm.matricularEstudiante(12345678, 2);

        adm.cambiarEstadoCivil(33333333, 3);

        adm.cambiarDepto(23323931, 4);

        adm.trasladarPersonal(40111233, 3);
    }
}