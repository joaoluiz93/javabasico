
package TratamentoExcessões;

import javax.swing.JOptionPane;

public class InstrucaoThrows {
    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Forneça uma nota de 0 a 10"));
        try {
            if ( nota < 0 || nota > 10){
                throw new Exception("Fora da faixa permitida de 0 a 10");
            }
            //Executa normalmente
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
        System.exit(0);
    }
}
