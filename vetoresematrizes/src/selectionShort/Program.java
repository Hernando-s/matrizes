package selectionShort;

import java.util.Random;

public class Program {
   
    public static void main(String[] args) {
    	
        int[] vetor = new int[10];
        
        Random randomizar = new Random();
        
        //enchendo o vetor com valores aleatorios 
        for(int i = 0; i < vetor.length; i++){
            vetor[i]= randomizar.nextInt(100);
            System.out.println(vetor[i]);
        }
        
        
        // ordenando o vetor com o algoritmo selection sort 
        for(int i = 0; i < vetor.length; i++ ){
            for(int j = i + 1; j < vetor.length; j++){
            	
                if(vetor[i] > vetor[j]){
                    int auxiliar;
                    auxiliar = vetor[j];
                    vetor[j]= vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        } 
        // imprimindo números ordenados
        System.out.println("Vetor Ordenado: ");
        for(int i = 0; i < vetor.length; i++){
            
            System.out.println(vetor[i]);
        }
    }
    
}

