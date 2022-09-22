package Gym;

import java.util.Arrays;
import java.util.Scanner;

public class treino {
    protected String[] treinos = { "a", "b", "c", "d", "e" };
    protected int[] cont = new int[5];

    public void contaTreino() {
        Scanner sc = new Scanner(System.in);
        int escolha;
        System.out.println("INFORME O TREINO DESEJADO: 1, 2, 3, 4 ou 5");
        escolha = sc.nextInt();

        do {
            switch (escolha) {
                case 1:
                    cont[1]++;
                    break;
                case 2:
                    cont[2]++;
                    break;
                case 3:
                    cont[3]++;
                    break;
                case 4:
                    cont[4]++;
                    break;
                case 5:
                    cont[5]++;
                    break;
                case 0:
                    System.out.println("saiu");
                    break;
                default:
                    System.out.println("Treino não aceito, informe novamente: ");

            }
        } while (escolha != 0);
    }

    @Override
    public String toString() {
        return "Treinos /n treino " + treinos[1] + ": " + cont[1] + "\n treino " + treinos[2] + ": " + cont[2]
                + "\n treino " + treinos[3] + ": " + cont[3] + "\n treino " + treinos[4] + ": " + cont[4] + "\n treino "
                + treinos[5] + ": " + cont[5];
    }

}
