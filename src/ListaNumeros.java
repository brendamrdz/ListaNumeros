

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        
        agregarValores(numlist);
        mostrarValores(numlist);
        int sum = suma(numlist);
        int med = media(sum, numlist);
        mayorMedia(med, numlist);
    }

    public static void agregarValores(ArrayList<Integer> numlist){
        Scanner sc = new Scanner(System.in);
        int j = 0;
        System.out.println("Ingresa un numero, para salir ingresa el numero -99:");
        while(sc.hasNextInt()){
            
            int num = sc.nextInt();
            if(num != -99){
                numlist.add(j, num);
                j++;
                System.out.println("Ingresa un numero, para salir ingresa el numero -99:");
            }else{
                break;
            }
              
        }
        sc.close();   
    }
    
    public static void mostrarValores(ArrayList<Integer> numlist){
        System.out.println("lista de numeros ingresados:");
         for(int i=0; i<numlist.size(); i++){
            
            System.out.println(numlist.get(i));  
            }   
    }
    
    public static Integer suma(ArrayList<Integer> numlist){
        int sum = 0;
         for(int i=0; i<numlist.size(); i++){
            sum = sum + numlist.get(i);
          }   
          System.out.println("La suma es:" + sum);
          return sum;
    }
    
    public static Integer media(int sum, ArrayList<Integer> numlist){
        int med = sum / numlist.size();
        System.out.println("La media es:" + med);
        return med;
    }

    public static void mayorMedia(int med, ArrayList<Integer> numlist){

        int numMed = 0;  
        for(int i=0; i<numlist.size(); i++){
            if(numlist.get(i)>med){
                numMed = 1 + numMed;
            }
            } 
            System.out.println("Los numeros mayores a la media:" + numMed);
    }
}

