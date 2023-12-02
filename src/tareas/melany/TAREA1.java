
package tareas.melany;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class TAREA1 {
    
    public static void main(String[] args) {
        String frase="";
        String fraseCod="";
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese la frase: ");
        frase=sc.nextLine();
        
        int i=0;
        while (i<frase.length()) {            
            if(frase.substring(i,i+1).equals("a")||frase.substring(i,i+1).equals("A")){
                fraseCod=fraseCod+"@";
            }else if(frase.substring(i,i+1).equals("e")||frase.substring(i,i+1).equals("E")){
                fraseCod=fraseCod+"#";
            }else if(frase.substring(i,i+1).equals("i")||frase.substring(i,i+1).equals("I")){
                fraseCod=fraseCod+"$";
            }else if(frase.substring(i,i+1).equals("o")||frase.substring(i,i+1).equals("O")){
                fraseCod=fraseCod+"%";
            }else if(frase.substring(i,i+1).equals("u")||frase.substring(i,i+1).equals("U")){
                fraseCod=fraseCod+"*";
            }else if(frase.substring(i,i+1).equals(".")){
                fraseCod=fraseCod+frase.substring(i,i+1);
                break;
            }
            else{
                fraseCod=fraseCod+frase.substring(i,i+1);
            }
            //System.out.println(frase.substring(i,i+1));prueba  
            i++;
        }
        
              System.out.println(fraseCod);
    }
    
}
