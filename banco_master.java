import java.util.Scanner;

public class banco_master {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome_fundo;
        double taxa_juros;
        double teto_regulatorio = 13.0;
        boolean risco = false;

        System.out.print("Nome do fundo é qual? ");
        nome_fundo = sc.nextLine();

        System.out.print("E agora a taxa de juros do CDI em porcetagem (%) ");
        taxa_juros = sc.nextDouble();

        System.out.println("\n----- RELATÓRIO PRELIMINAR -----");
        System.out.println("Fundo que foi analisado: " + nome_fundo);
        System.out.println("Taxa do CDB foi: " + taxa_juros + "%");
        System.out.println("Teto regulatório calculado foi: " + teto_regulatorio + "%");

        if (taxa_juros > teto_regulatorio) {
            System.out.println("\n(ALERTA CRÍTICO)");
            System.out.println("Captação agressiva identificada. ou seja, vai com calma meu rapaz");
            risco = true;
        } else {
            System.out.println("\n(REGULAR)");
            System.out.println("Ativo dentro do limite regulatório. ou seja, boa mano");
            risco = false;
        }

        System.out.println("\n----- PARECER FINAL -----");

        if (risco) {
            System.out.println("Ativo bloqueado para novas emissões");
        } else {
            System.out.println("Ativo liberado para comercialização");
        }

        sc.close();
    }
}