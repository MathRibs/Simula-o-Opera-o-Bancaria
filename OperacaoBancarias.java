import java.util.Scanner;

public class OperacaoBancarias {
	public static void main (String args[]) {
		// Declaração de Variaveis
		Scanner leitor = new Scanner (System.in);
		int opcao = 0;
		double saldoInicial = 0;
		double valor=0;
		double juro=0;
		double saldoFinal =0;
		// entrada de dados
		System.out.print("Informe o saldo inicial da conta");
		saldoInicial = leitor.nextDouble();
		System.out.println("+================+");
		System.out.println("| Menu de Opções |");
		System.out.println("+================+");
		System.out.println("| 1  -> Depósito |");
		System.out.println("| 2  -> Saque    |");
		System.out.println("| 3  -> Juro     |");
		System.out.println("+================+");
		System.out.print("Selecione sua opção:");
		opcao = leitor.nextInt();	
				switch(opcao) {
		case 1 :
			System.out.print("Informe o valor Depositado:");
			valor =leitor.nextDouble();
			saldoFinal = (saldoInicial + valor);
			break;
		case 2 :
			System.out.print("Informe o valor do saque:");
			valor = leitor.nextDouble();
			saldoFinal = (saldoInicial - valor);
			break;
		case 3:
			System.out.print("Informe a taxa de juro:");
			juro = leitor.nextDouble();
			saldoFinal = (saldoInicial + ((saldoInicial * juro)/ 100));
			break;
		default:
			System.out.print("Operação não reconhecida pelo sistema! Tente novamente!");
			saldoFinal = (saldoInicial);

		}
		leitor.close();
		// saida de dados
		System.out.print("O valor do saldo final é: " + saldoFinal);












	}
}