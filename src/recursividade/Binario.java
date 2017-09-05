/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author Cardoso
 */
public class Binario {
    
    /**
     * metodo que converte um numero decimal para um numero binario
     * @param num
     * @return 
     */
    private static String converter(int num){
        
        if (num==0)
           return "";
        return converter(num/2) + num%2;
      
          
    }
    public static void main(String[] args) {
        
        System.out.println(converter(40));
    }
}
