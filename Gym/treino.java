package Gym;

import java.util.Arrays;
import java.util.Scanner;

public class treino {
    private String id;
    private String autor;
    private double valor;
    private int estoque;

    protected String[] treinos = { "a", "b", "c", "d", "e" };
    protected static int[] cont = new int[5];

    public static void contaTreino() throws RuntimeException{
        Scanner sc = new Scanner(System.in);
        int escolha;

        if (cont[0] > 100 || cont[1] > 100 || cont[2] > 100 || cont[3] > 100 || cont[4] > 100) {
            throw new RuntimeException("Mais de 100 pessoas nesse treino");
        } else {
            do {
                System.out.println(
                        "INFORME O TREINO DESEJADO: \n 1 'A - Peito, \n 2 'B - Costas, \n 3 'C - Abdômen, \n 4 'D - Perna \n 5 'E - Ombro");
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        cont[0]++;
                        break;
                    case 2:
                        cont[1]++;
                        break;
                    case 3:
                        cont[2]++;
                        break;
                    case 4:
                        cont[3]++;
                        break;
                    case 5:
                        cont[4]++;
                        break;
                    case 0:
                        System.out.println("saiu");
                        break;
                    default:
                        System.out.println("Treino não aceito, informe novamente: ");

                }
            } while (escolha != 0);
        }
    }

    @Override
    public String toString() {
        return "Treinos: \n treino " + treinos[1] + ": " + cont[1] + "\n treino " + treinos[2] + ": " + cont[2]
                + "\n treino " + treinos[3] + ": " + cont[3] + "\n treino " + treinos[4] + ": " + cont[4] + "\n treino "
                + treinos[5] + ": " + cont[5];
    }

}
