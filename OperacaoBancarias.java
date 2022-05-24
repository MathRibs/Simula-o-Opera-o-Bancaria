import java.util.Scanner;

public class OperacaoBancarias {
	public static void main (String args[]) {
		// Declara��o de Variaveis
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
		System.out.println("| Menu de Op��es |");
		System.out.println("+================+");
		System.out.println("| 1  -> Dep�sito |");
		System.out.println("| 2  -> Saque    |");
		System.out.println("| 3  -> Juro     |");
		System.out.println("+================+");
		System.out.print("Selecione sua op��o:");
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
			System.out.print("Opera��o n�o reconhecida pelo sistema! Tente novamente!");
			saldoFinal = (saldoInicial);

		}
		leitor.close();
		// saida de dados
		System.out.print("O valor do saldo final �: " + saldoFinal);












	}
}