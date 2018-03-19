import java.io.IOException;

public class Ascensor {
    private int Pisos;
    private int Sotanos;
    
    // Contructor
    public Ascensor(int noPisos , int noSotanos){
        this.Pisos = noPisos;
        this.Sotanos = noSotanos;
    }
    
    public int getnoPisos(){
        return Pisos;
    }
    
    public int getnoSotanos(){
        return Sotanos;
    }
    
    public static int sgntPiso(int Pisos, int Sotanos , int piso){
        int pisosiguiente = 0;
        int actual;
        
        actual = piso;
        piso++;
        
        if(actual >= Pisos || Pisos == 0){
            pisosiguiente = 0;
        }else{
            if(piso == 0){
                actual = actual + 2;
            }else{
                actual++;
            }
            pisosiguiente=actual;
        }
        return pisosiguiente;           
    }
    
    
    public static int antPiso(int Pisos, int Sotanos , int piso){
        int pisoanterior = 0;
        int actual;
        
        actual = piso;
        piso--;
        
        if(actual <= (Sotanos*-1)|| Sotanos == 0){
            pisoanterior = 0;
        }else{
            if(piso == 0){
                actual=actual - 2;
            }else{
                actual--;
            }
            pisoanterior=actual;
        }
        return pisoanterior;           
    }  
    
    // Total de todos los pisos contabilizado los sotanos.
    public static int Atencion(int pisos, int sotanos){
        int totalpisos=0;
        totalpisos = pisos + sotanos; 
        return totalpisos;
    }
}