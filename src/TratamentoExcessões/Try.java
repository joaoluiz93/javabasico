package TratamentoExcessões;

import javax.swing.JOptionPane;

public class Try {

    public static void main(String[] args) {
        String aux1 = JOptionPane.showInputDialog("Forneça o valor 1: ");
        if (aux1 == null) {
            System.exit(0);
        }
        String aux2 = JOptionPane.showInputDialog("Forneça o valor 2: ");
        if (aux2 == null) {
            System.exit(0);
        }
        try {
            int num1 = Integer.parseInt(aux1);
            int num2 = Integer.parseInt(aux2);

            JOptionPane.showMessageDialog(null, "Soms: " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Div: " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Mul: " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Div: " + (num1 / num2));
        } catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero! \n" + erro.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas numero! \n" + erro.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Final da Execução");
        }
        System.exit(0);
    }
}
