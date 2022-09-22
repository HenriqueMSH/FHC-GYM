package Gym;

public class treino {
    private String[] treinos = { "a", "b", "c", "d", "e" };
    private int[] cont = new int[5];

    public void contaTreino(int escolha) {

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
                default:
                    System.out.println("Treino não aceito");

            }
        } while (escolha < 1 && escolha > 5);
    }
}
