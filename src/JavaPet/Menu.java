package JavaPet;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int opcao;
		
		do{

		System.out.println("                                                                         ");
		System.out.println("                             JavaPet                                     ");
		System.out.println("                                                                         ");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                                                                         ");
		System.out.println("               1-Adicionar Produtos                                       ");
		System.out.println("               2-Listar Produtos                                       ");
		System.out.println("               3-Atualizar Carrinho                           ");
		System.out.println("               4-Remover Produto do Carrinho                  ");
		System.out.println("               5-Encerrar                                                ");
		System.out.println("                                                                         ");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("               Entre com a Opção Desejada:                               ");
	
		opcao= scanner.nextInt();
		scanner.nextLine();
		
		processarOpcao(opcao);
		
		}while(opcao!=5);
		
		scanner.close();
	}
	private static void processarOpcao(int opcao) {
		
		switch(opcao) {
		
		case 1:
			System.out.println("Adicionar Produtos..");
			break;
			
		case 2:
			System.out.println("Listar Produtos: ");
			break;
			
		case 3:
			System.out.println("Atualizar o Carrinho..");
			break;
			
		case 4:
			System.out.println("Remover Produto do Carrinho");
			break;
			
		case 5:
			System.out.println("Compra finalizada com sucesso, Até a Próxima!!");
			break;
			
			default:
				System.out.println("Opção inválida, Tente Novamente!");
}
		}
}
