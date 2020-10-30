import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Hospede h = new Hospede();

		System.out.println("Digite seu nome: ");
		h.setNomeHospede(ler.nextLine());

		do {
			System.out.println("Digite o tipo de apartamento: ");
			h.setTipoApt(ler.nextLine().charAt(0)); 
		} while (h.getTipoApt() != 'A' && h.getTipoApt() != 'a' && h.getTipoApt() != 'B' && h.getTipoApt() != 'b'&&
				h.getTipoApt() != 'C' && h.getTipoApt() != 'c' && h.getTipoApt() != 'D' && h.getTipoApt() != 'd');



		System.out.println("Digite seu consumo interno: ");
		h.setConsumoInt(ler.nextDouble());

		System.out.println("Digite o numero de diarias: ");
		h.setNumDiarias(ler.nextInt());

		h.totalDiaria();
		h.CalcSubTot();
		h.taxaServ();
		h.totalGeral();
		h.mostrarInfo();
	}
}



