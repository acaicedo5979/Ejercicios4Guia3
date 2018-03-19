package ColegioPerros;

import java.io.IOException;

public class nuevoPerro extends perros {
	public nuevoPerro() throws IOException{
		System.out.println("Nombre del Perro?");
		nombre = br.readLine();
		System.out.println("Raza del Perro?");
		raza = br.readLine();
		System.out.println("Localidad donde reside el Perro?");
		localidad = br.readLine();
		System.out.println("Cedula del dueño?");
		String ced = br.readLine();
		cedula = Integer.parseInt(ced);
		System.out.println("Telefono del dueño?");
		String tel = br.readLine();
		telefono = Integer.parseInt(tel);
		System.out.println("Dia da asistencia en letras ejemplo 'Martes'");	
		dia_asistencia = br.readLine();	
		System.out.println("Nombre del dueño");	
		nombre_dueno = br.readLine();	
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
}
