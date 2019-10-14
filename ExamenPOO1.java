import java.util.Scanner;
 
public class ExamenPOO1 {
	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int notas=5;
           
        int suma = 0;
        int promedio = 0;
        int nota = 0;
        
        for(int i=1; i<=notas; i++){
            
            System.out.println("Ingrese nota"+" "+i+" "+"de"+" "+notas+":");
            nota = leer.nextInt();
            suma = suma + nota;
            
            promedio = suma / notas;
                    
              }
            System.out.println("EL promedio es: "+promedio);
        }
 
}