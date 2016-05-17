
package LacosDeRepeticao;

import javax.swing.JOptionPane;


public class ContadorWhile {
    public static void main(String[] args) {
        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade"));
            int cont = limite;
            while ( cont >=0){
                System.out.println(cont);
                cont--;
            }
            System.out.println("Fim do contador regressivo \n");
            cont=0;
            do{
                System.out.println(cont);
                cont++;
            } while (cont <= limite);
            System.out.println("Fim do contador progressivo");
        } catch (NumberFormatException e) {
            System.out.println("Não foi fornecido um numero inteiro valido \n"+ e.toString()); // se for invalido
        }
    }
     
    
}
