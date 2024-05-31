package crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import juegos.Alumno;

public class Main {
	private static void insertarAlumno(BufferedReader br)throws IOException{
		System.out.println("Introduce el nombre del alumno: ");
		String nombreIntroducido = br.readLine();
		System.out.println("Introduce la edad del alumno: ");
		String edadIntroducida = br.readLine();
		int edad = Integer.parseInt(edadIntroducida);
		Alumno nuevoAlumno = new Alumno(nombreIntroducido,edad);
		alumnos.add(nuevoAlumno);
		System.out.println("Alumno insertado correctamente.");
		
	}
	private static void eliminarAlumno(BufferedReader br) throws IOException{
	System.out.println("Introduce el nombre del alumno a eliminar: ");
	String nombreIntroducido = br.readLine();
	Iterator<Alumno> iterator = alumnos.iterator();
	boolean encontrado = false;
	while(iterator.hasNext()) {
		Alumno alumno = iterator.next();
		if(alumno.getNombre().equalsIgnoreCase(nombreIntroducido)) {
			iterator.remove();
			encontrado = true;
			System.out.println("Alumno eliminado correctamente.");
			break;
		}
	}
	if(!encontrado)
	System.out.println("Alumno no encontrado.");
	}
	 private static void modificarAlumno(BufferedReader br) throws IOException {
		 System.out.println("Introduce el nombre del alumno a modificar");
		 String nombreIntroducido = br.readLine();
		 boolean encontrado = false;
		 for(Alumno alumno : alumnos) {
			 if(alumno.getNombre().equalsIgnoreCase(nombreIntroducido)) {
				 System.out.println("Introduce el nuevo nombre del alumno:");
				 String nuevoNombre = br.readLine();
				 System.out.println("Introduce la nueva edad del alumno:");
				 String valorNuevaEdad = br.readLine();
				 int nuevaEdad = Integer.parseInt(valorNuevaEdad);
				 
				 alumno.setNombre(nuevoNombre);
				 alumno.setEdad(nuevaEdad);
				 encontrado = true;
				 System.out.println("Alumno modificado correctamente.");
				 break;
			 }
		 }
		 if(!encontrado) {
			 System.out.println("Alumno no encontrado.");
		 }
	 }
	 private static void mostrarAlumnos() {
		 if(alumnos.isEmpty()) {
			 System.out.println("No hay alumnos registrados.");
		 }{
			 for(Alumno alumno : alumnos) {
				 System.out.println(alumno);
			 }
		 }
	 }

	private static ArrayList<Alumno> alumnos = new ArrayList<>();
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	boolean salir = false;
	while(!salir) {
		System.out.println("Selecciona una opcion: ");
		System.out.println("1. Insertar un nuevo alumno ");
		System.out.println("2. Eliminar un alumno ");
		System.out.println("3. Modificar los datos de un alumno ");
		System.out.println("4. Mostrar todos los alumnos");
		System.out.println("5. Salir");
		String opcion = br.readLine();
		if (opcion.equals("1")) {
			insertarAlumno(br);
		}else if(opcion.equals("2")) {
			eliminarAlumno(br);
		}else if(opcion.equals("3")){
			modificarAlumno(br);
		}else if (opcion.equals("4")) {
			mostrarAlumnos();
		}else if (opcion.equals("5")) {
			System.out.println("Ha salido correctamente!");
			salir = true;		
		}else {
			System.out.println("Error");
		}
	}
	
}
}
