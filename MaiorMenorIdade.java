import java.util.Scanner;
public class MaiorMenorIdade {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int i, anoAtual, anoNasc, idade, resposta;
	i = 1;
	do {
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		System.out.println("Digite o ano de seu nascimento: ");
		anoNasc = in.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println("Voc� tem " + idade + " anos.");
		if (idade>=18) {
			System.out.println("Voc� � maior de idade!");
		}else {
			System.out.println("Voc� n�o � maior de idade!");
		}
		System.out.println("Deseja continuar? 1- SIM 2- N�o");
		resposta = in.nextInt();
		i++;
		}while(resposta!=2);
	}

}
