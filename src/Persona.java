public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int dni;
    int estadoCivil; // 0=soltero, 1=casado, 2=viudo, 3=divorciado

    // Constructor
    public Persona(String nombre, String apellido, int dni, int estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void mostrarEstadoCivil() {
        if (estadoCivil == 0) {
            System.out.println("Estado civil: Soltero/a");
        }

        else if (estadoCivil == 1) {
            System.out.println("Estado civil: Casado/a");
        }

        else if (estadoCivil == 2) {
            System.out.println("Estado civil: Viudo/a");
        }

        else if (estadoCivil == 3 ) {
            System.out.println("Estado civil: Divorciado/a");
        }

        else {
            System.out.println("Estado civil: n/a");
        }
    }

    public int obtenerDni() {return this.dni;}

    public int obtenerEstadoCivil () {return this.estadoCivil;}
}
