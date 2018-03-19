import java.util.Scanner;
public class Pendulo
{
    private double longitudCuerda;
    private double aceleracionGravitacional;
    
    //Contructor
    public Pendulo(double l, double g) {
        this.longitudCuerda = l;
        this.aceleracionGravitacional = g;
    }
    
    public double darLongitudCuerda() {
        return longitudCuerda;
    }
    
    public double darAceleracionGravitacional() {
        return aceleracionGravitacional;
    }
    
    public double periodo() {
        return 2 * Math.PI * Math.sqrt(longitudCuerda / aceleracionGravitacional);
    }
    
    public double frecuencia() {
        return 1 / (2 * Math.PI * Math.sqrt(longitudCuerda / aceleracionGravitacional));    
    }
    //programa principal
    public static void main(String [] args) {
        Scanner teclado = new Scanner (System.in);
        Pendulo p = null;
        double l, g;
        int opcion = 0;
        do {
            System.out.println("Menu\n1. Crear el pendulo.");
            System.out.println("2. Conocer la logintud de la cuerda del pendulo.");
            System.out.println("3. Conocer la aceleracion gravitacional del pendulo.");
            System.out.println("4. Conocer el perido del pendulo.");
            System.out.println("5. Conocer la frecuencia del pendulo.");
            System.out.println("6. Salir.");
            System.out.println("¿Cual opcion desea?: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                System.out.print("Ingrese la longitd de la cuerda del pendulo: ");
                l = teclado.nextDouble();
                System.out.print("Ingrese la aceleracion gravitacional del pendulo: ");
                g = teclado.nextDouble();
                
                p = new Pendulo(l,g);
                
                System.out.println("Pendulo creado de manera satisfactoria");
                break;
                
                case 2:
                System.out.println("Longitud de la cuerda = " + p.darLongitudCuerda() + " m");
                break;
              
                case 3:
                System.out.println("Aceleracion gravitacional =  " + p.darAceleracionGravitacional() + " m/s^2");
                break;
                
                case 4:
                System.out.println("Periodo del pendulo = " + p.periodo() + " s");
                break;
                
                case 5:
                System.out.println("Frecuencia del pendulo = " + p.frecuencia() + " Hz");
                break;
            }
                
        }while (opcion != 6);
        
        System.out.println("Hasta pronto.");

    }
}
