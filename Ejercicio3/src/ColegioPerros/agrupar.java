package ColegioPerros;

import java.io.IOException;

public class agrupar extends perros {
	
	public agrupar() throws IOException{
		System.out.println("Ingrese Localidad por la cual desee filtrar información");
		String Localidadfiltro = br.readLine();
		if(Localidadfiltro == localidad){
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
}
