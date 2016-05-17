package TratamentoExcessões;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        try {
            double valorP = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
            String codigo = JOptionPane.showInputDialog("Informe o codigo do desconto");
            double valorFinal = 0;

            switch (codigo) {
                case "1":
                    valorFinal = valorP - (valorP * 0.5);
                    break;
                case "2":
                    valorFinal = valorP - (valorP * 0.10);
                    break;

                default: {
                    JOptionPane.showMessageDialog(null, "Codigo não existente:");
                    System.exit(0);
                }
            }

            JOptionPane.showMessageDialog(null, "O valor do produto foi: " + valorP + "\n"
                    + "O codigo digitado foi: " + codigo + "\n" + "O valor final com desconto: " + valorFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi fornecido um valor real: " , "erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}
