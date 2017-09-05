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
public class Ex04 {
    
    /**
     * metodo que verifica a ocorrencia de um numero
     * @param numero
     * @param n
     * @param i
     * @return 
     */
    private static int quantidade(int numero, int n, int i){
        if (numero==0)
            return i;
        if((numero%10)==n)
            i++;
        return quantidade(numero/10, n, i);
    }
    public static void main(String[] args) {
        System.out.println(quantidade(1223444, 4, 0));
    }
}
