import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        String nome, sexo;

        while (true)  {
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("sair")) {
                System.out.print("Digite o sexo (M/F): ");
                sexo = scanner.nextLine();

                if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Masculino")) {
                    masculino.add(nome);
                } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Feminino")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo não reconhecido. Digite M ou F.");
                }
            } else {
                break;
            }

        }

        scanner.close();

        System.out.println("Nomes do sexo masculino: " + masculino);
        System.out.println("Nomes do sexo feminino: " + feminino);
        {

        }
    }
}