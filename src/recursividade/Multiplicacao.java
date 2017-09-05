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
public class Multiplicacao {
    
    /**
     * metodo que faz a multiplicacao de dois numeros sem a utilizacao da multiplicacao
     * @param valor1
     * @param valor2
     * @return 
     */
    private static int multiplicacao(int valor1, int valor2){
        if (valor2<1){
            return 0;
        }
        return valor1+multiplicacao(valor1, --valor2);
    }
    
    public static void main(String[] args) {
        System.out.println(multiplicacao(4, 6));
    }
}
