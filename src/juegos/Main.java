package juegos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    private static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Insertar un nuevo alumno");
            System.out.println("2. Eliminar un alumno");
            System.out.println("3. Modificar los datos de un alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");

            int opcion = Integer.parseInt(reader.readLine());

            switch (opcion) {
                case 1:
                    insertarAlumno(reader);
                    break;
                case 2:
                    eliminarAlumno(reader);
                    break;
                case 3:
                    modificarAlumno(reader);
                    break;
                case 4:
                    mostrarAlumnos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void insertarAlumno(BufferedReader reader) throws IOException {
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = reader.readLine();
        System.out.print("Introduce la edad del alumno: ");
        int edad = Integer.parseInt(reader.readLine());

        Alumno nuevoAlumno = new Alumno(nombre, edad);
        alumnos.add(nuevoAlumno);
        System.out.println("Alumno insertado correctamente.");
    }

    private static void eliminarAlumno(BufferedReader reader) throws IOException {
        System.out.print("Introduce el nombre del alumno a eliminar: ");
        String nombre = reader.readLine();

        Iterator<Alumno> iterator = alumnos.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Alumno alumno = iterator.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                encontrado = true;
                System.out.println("Alumno eliminado correctamente.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void modificarAlumno(BufferedReader reader) throws IOException {
        System.out.print("Introduce el nombre del alumno a modificar: ");
        String nombre = reader.readLine();

        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Introduce el nuevo nombre del alumno: ");
                String nuevoNombre = reader.readLine();
                System.out.print("Introduce la nueva edad del alumno: ");
                int nuevaEdad = Integer.parseInt(reader.readLine());

                alumno.setNombre(nuevoNombre);
                alumno.setEdad(nuevaEdad);
                encontrado = true;
                System.out.println("Alumno modificado correctamente.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }
}
