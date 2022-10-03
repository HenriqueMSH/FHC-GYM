package Gym;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        cliente c1 = new cliente("caio", "123", 22, 3251);
        treino t1 = new treino();

        treino.contaTreino();

    }
}