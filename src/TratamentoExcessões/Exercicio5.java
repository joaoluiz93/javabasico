
package TratamentoExcessões;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int soma = 0;
        int impares = 1 ;
        
        while(impares <=1000){
            soma += impares;
            
            impares += 2;
        }
        JOptionPane.showMessageDialog(null, "A soma dos impares:"+soma);
    }
 
}
