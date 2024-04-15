import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        boolean continuar = true;
        double saldo=2000;
        String cliente="Joana D'arc";
        String tipoConta="Corrente";
        System.out.println("********************************* \n Dados iniciais do Cliente: \n");
        System.out.println("Nome: " + cliente +"\n");
        System.out.println("Tipo de Conta: "+ tipoConta+"\n");
        System.out.println("Saldo Inicial: " + saldo +"\n*********************************");

        while(continuar){
            System.out.println("Selecione alguma das opções abaixo\n 1-Ver Saldo Atual\n 2-Realizar Depósito \n 3-Realizar transferência \n 4-sair");
            i=sc.nextInt();

            switch(i){
                case 1:{
                    System.out.println("O saldo atual do cliente é : R$"+ saldo);
                    break;
                }
                case 2:{
                    System.out.println("Insira o valor desejado: ");
                    saldo= saldo + sc.nextDouble();
                    System.out.println("O novo saldo é R$"+saldo);
                    break;
                }
                case 3:{
                    System.out.println("Insira o valor da transferência: ");
                    saldo= saldo - sc.nextDouble();
                    System.out.println("O novo saldo é R$"+saldo);
                    break;
                }
                case 4:{
                    System.out.println("Programa Finalizado com sucesso!");
                    continuar = false;
                    break;
                }
            }
        };
    }
}
