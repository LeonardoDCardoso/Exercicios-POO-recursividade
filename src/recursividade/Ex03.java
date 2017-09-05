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
public class Ex03 {
    
    /**
     * metodo que soma os elementos de um numero
     * @param numero
     * @return 
     */
    private static int soma(int numero){
        if(numero==0)
           return 0; 
        return soma(numero/10) + numero%10;
    }
 
    public static void main(String[] args) {
        System.out.println(soma(103));
    }
}
