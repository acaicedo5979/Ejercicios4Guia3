package ColegioPerros;
import javax.*; 

import java.io.*;

public class perros {
	static String nombre; 
	static String raza;
	static String localidad;
	static int cedula;
	static int telefono;
	static String dia_asistencia;
	static String nombre_dueno;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public perros(){
		nombre = "Zeus";
		raza = "Golden";
		localidad = "Engativa";
		cedula = 12345678;
		telefono = 55535567;
		dia_asistencia = "Martes";
		nombre_dueno = "Catalina";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Morgan";
		raza = "Pitbull";
		localidad = "Usaquen";
		cedula = 1192736;
		telefono = 21512367;
		dia_asistencia = "Miercoles";
		nombre_dueno = "Juan";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Lucas";
		raza = "Pincher";
		localidad = "Engativa";
		cedula = 8766662;
		telefono = 76184123;
		dia_asistencia = "Jueves";
		nombre_dueno = "Daniela";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Greco";
		raza = "Labrador";
		localidad = "Usme";
		cedula = 51232312;
		telefono = 9876621;
		dia_asistencia = "Viernes";
		nombre_dueno = "Diana";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Thomas";
		raza = "Beagle";
		localidad = "Usaquen";
		cedula = 12312321;
		telefono = 51215314;
		dia_asistencia = "Lunes";
		nombre_dueno = "Mateo";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Gregori";
		raza = "Snowser";
		localidad = "Engativa";
		cedula = 12312321;
		telefono = 51215314;
		dia_asistencia = "Martes";
		nombre_dueno = "Tobias";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Firulais";
		raza = "Snowser";
		localidad = "Usme";
		cedula = 123243423;
		telefono = 2352432;
		dia_asistencia = "Miercoles";
		nombre_dueno = "German";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Jeronimo";
		raza = "Pastor Aleman";
		localidad = "Usaquen";
		cedula = 35346345;
		telefono = 35453234;
		dia_asistencia = "Viernes";
		nombre_dueno = "Tatiana";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Lula";
		raza = "Shitsu";
		localidad = "Engativa";
		cedula = 1234123;
		telefono = 6543745;
		dia_asistencia = "Lunes";
		nombre_dueno = "Angie";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Morita";
		raza = "Pastor Colie";
		localidad = "Usme";
		cedula = 8571923;
		telefono = 9823647;
		dia_asistencia = "Miercoles";
		nombre_dueno = "Claudia";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Godiz";
		raza = "Labrador";
		localidad = "Centro";
		cedula = 847561232;
		telefono = 12374851;
		dia_asistencia = "Martes";
		nombre_dueno = "Jacobo";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
		nombre = "Nacho";
		raza = "Boxer";
		localidad = "Engativa";
		cedula = 51232132;
		telefono = 8263421;
		dia_asistencia = "Jueves";
		nombre_dueno = "David";
		System.out.println(
					"Nombre Perro: " + nombre + "\n" + 
					"Tipo de Raza: " + raza + "\n" + 
					"Nombre de Localidad: " + localidad + "\n" + 
					"Numero de Cedula: " + cedula + "\n" + 
					"Numero de Telefono: " + telefono + "\n" + 
					"Dia de Asistencia: " + dia_asistencia + "\n" + 
					"Nombre del Dueño: " + nombre_dueno
				);
	}
	public static void main(String args[]) throws IOException{

		perros perro = new perros();
		nuevoPerro Perrito = new nuevoPerro();
		agrupar Agrupar = new agrupar();
	}
}
