package TratamentoExcessões;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {
        try {

            String operacao = JOptionPane.showInputDialog("Informe o que deseja:\n"
                    + "  A = soma \n B = multiplicação \n C = divisão \n D = subtração");

            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2: "));
            if (operacao.equalsIgnoreCase("A")) {

                JOptionPane.showMessageDialog(null, "Os numeros foram: " + num1 + " e " + num2 + "\n"
                        + "A operação foi: Soma  \n " + "O resultado foi: " + (num1 + num2));
            } else if (operacao.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null, "Os numeros foram: " + num1 + " e " + num2 + "\n"
                        + "A operação foi: multiplicação  \n " + "O resultado foi: " + (num1 * num2));
            } else if (operacao.equalsIgnoreCase("C")) {
                JOptionPane.showMessageDialog(null, "Os numeros foram: " + num1 + " e " + num2 + "\n"
                        + "A operação foi: Divisão  \n " + "O resultado foi: " + (num1 / num2));
            } else if (operacao.equalsIgnoreCase("D")) {
                JOptionPane.showMessageDialog(null, "Os numeros foram: " + num1 + " e " + num2 + "\n"
                        + "A operação foi: Subtração  \n " + "O resultado foi: " + (num1 - num2));
            } else {
                JOptionPane.showMessageDialog(null, "Apenas opção de A a D:");
                    System.exit(0);
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero! \n" + e.toString(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Somente numeros \n" + e.toString(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }
}
