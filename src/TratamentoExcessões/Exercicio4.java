package TratamentoExcessões;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            String senha = JOptionPane.showInputDialog("Informe sua senha: ");
            if (senha.equalsIgnoreCase("java")) {
                JOptionPane.showMessageDialog(null, "Acesso permitido");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Senha Incorreta\n tente novamente");
            }

        }
        JOptionPane.showMessageDialog(null, "Acesso Bloqueado");

    }
}
