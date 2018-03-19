import java.io.IOException;
import java.util.Scanner;

public class Programaprincipal  {
    
    public static int nextInt(){
		Scanner teclado = new Scanner(System.in);
                int i = teclado.nextInt();
		return i;
	}
    public static void main(String[] args) {
        
        int ascensores;
        int pisos;
        int sotanos;
        int piso;
        int opcion = 0;
        int numeroAscensor = 1;           
       
        System.out.print("Digite la cantidad de ascensores que tiene el edificio: ");
        ascensores = nextInt();
        Ascensor[] ascensor=new Ascensor[ascensores];
        
        for(int i = 0 ; i < ascensores ; i++ ){
            System.out.print("Digite el numero de pisos que tiene el edificio " + numeroAscensor +" : " );
            pisos = nextInt();
            System.out.print("Digite el numero de sotanos que tiene el edificio " + numeroAscensor + " : ");
            sotanos = nextInt();
            ascensor[i] = new Ascensor(pisos,sotanos);
            numeroAscensor++;
        }
        
        do {
            System.out.println("Menu\n1. Subir un piso");    
            System.out.println("2. Bajar un piso");            
            System.out.println("3. Numero de pisos que tiene el edificio");
            System.out.println("4. Salir");
            System.out.print("¿Cual opcion desea?: ");
            opcion = nextInt();
            
            switch(opcion) {
                case 1:
                int objeto;
                System.out.print("Seleccione el ascensor : ");
                ascensores = nextInt();
                ascensores--;
                pisos = ascensor[ascensores].getnoPisos();
                sotanos = ascensor[ascensores].getnoSotanos();
                ascensores++;
                System.out.println("El ascensor No."+ ascensores + " tiene " + pisos + " pisos y " + sotanos +" sotanos");
                System.out.print("Seleccione el piso en el que se encuentra actualmente : ");
                piso = nextInt();
                if(piso<(sotanos*-1)){
                    System.out.println("El ascensor No."+ ascensores + " solo tiene " + sotanos + " sotanos");
                }else{
                    objeto = Ascensor.sgntPiso(pisos, sotanos, piso);
                    if(objeto == 0){
                        System.out.println("No esposible seguir subiendo dado que el ascensor No. "+ ascensores + " solo tiene " + pisos + " pisos");
                    }else{
                        System.out.println("El siguiente piso es : " + objeto);
                    }
                }
                
                break;
                case 2:
                int caso;
                System.out.print("Seleccione el ascensor : ");
                ascensores = nextInt();
                ascensores--;
                pisos = ascensor[ascensores].getnoPisos();
                sotanos = ascensor[ascensores].getnoSotanos();
                ascensores++;
                System.out.println("El ascensor No."+ ascensores + " tiene " + pisos + " pisos y " + sotanos +" sotanos");
                System.out.print("Seleccione el piso en el que se encuentra actualmente : ");
                piso = nextInt();
                if(piso > pisos){
                    System.out.println("El ascensor No."+ ascensores + " solo tiene " + pisos + " pisos");
                }else{
                    caso = Ascensor.antPiso(pisos, sotanos, piso);
                    if(caso == 0){
                        System.out.println("No esposible seguir subiendo dado que el ascensor No. "+ ascensores + " solo tiene " + sotanos + " sotanos");
                    }else{
                        System.out.println("El piso anterior es : " + caso);
                    }
                }                
                break;
                case 3:        
                int Nopisos;
                System.out.print("Seleccione el ascensor : ");
                ascensores = nextInt();
                ascensores--;
                pisos = ascensor[ascensores].getnoPisos();
                sotanos = ascensor[ascensores].getnoSotanos();
                ascensores++;
                System.out.println("El ascensor No."+ ascensores + " tiene " + pisos + " pisos y " + sotanos +" sotanos.");
                Nopisos = Ascensor.Atencion(pisos, sotanos);
                System.out.println("El total de pisos que tiene el edificio No. "+ ascensores + " son " + Nopisos + ".");
                break;
            }
        }while(opcion!=4);
        System.out.println("Feliz Dia...");
    }
}