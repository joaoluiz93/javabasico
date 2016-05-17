package TratamentoExcessões;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        int idade[] = new int[4];
        int maior = 0;
        int menor = 0;
        String totalIdades = "";
        try {
            for (int i = 0; i < 4; i++) {
                idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Informa a idade" + (i + 1) + ":"));
                totalIdades += idade[i] + " ";
            }

            maior = idade[0];
            menor = idade[0];

            for (int i = 0; i < 4; i++) {
                if (maior < idade[i]) {
                    maior = idade[i];
                }
                if (menor > idade[i]) {
                    menor = idade[i];
                }
            }

            JOptionPane.showMessageDialog(null, "As idades fornecidas \n" +totalIdades+ "\n A maior idade foi: "
                    + maior + "\n A menor idade foi: " + menor);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi fornecido idades inteiras", "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }
    }
}
