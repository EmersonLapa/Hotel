
public class Hospede {

	private char tipoApt;
	private String nomeHospede;
	private int numDiarias;
	private double consumoInt, valorTotal, subTotal,taxaServico,valorTotalDiarias;

	public Hospede() {
		tipoApt = ' ';
		nomeHospede = null;
		numDiarias = 0;
		consumoInt = 0;
		valorTotal = 0;
		subTotal = 0;
		taxaServico = 0;
		valorTotal = 0;
	}
	
	public char getTipoApt() {
		return tipoApt;
	}

	public void setTipoApt(char tipoApt) {
		this.tipoApt = tipoApt;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public int getNumDiarias() {
		return numDiarias;
	}

	public void setNumDiarias(int numDiarias) {
		this.numDiarias = numDiarias;
	}

	public double getConsumoInt() {
		return consumoInt;
	}

	public void setConsumoInt(double consumoInt) {
		this.consumoInt = consumoInt;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(double taxaServico) {
		this.taxaServico = taxaServico;
	}

	public double getValorTotalDiarias() {
		return valorTotalDiarias;
	}

	public void setValorTotalDiarias(double valorTotalDiarias) {
		this.valorTotalDiarias = valorTotalDiarias;
	}

	public void totalDiaria() {

		if (tipoApt == 'A' ||tipoApt == 'a') {
			valorTotalDiarias = numDiarias * 150;
		} else {
			if (tipoApt == 'B' || tipoApt == 'b') {
				valorTotalDiarias = numDiarias * 100;
			} else {
				if (tipoApt == 'C' || tipoApt == 'c' ) {
					valorTotalDiarias = numDiarias * 75;
				} else {
					if (tipoApt == 'D' || tipoApt == 'd') {
						valorTotalDiarias = numDiarias * 50;
					}
				}
			}
		}

	}

	public void CalcSubTot (){

		subTotal = consumoInt +  valorTotalDiarias;
	}

	public void taxaServ () {

		taxaServico = subTotal * 0.1;
	}

	public void totalGeral () {

		valorTotal = taxaServico + subTotal;
	}

	public void mostrarInfo () {

		System.out.println("Nome Do Hoposde: " + nomeHospede);
		System.out.println("Tipo De Apartamento: " + tipoApt);
		System.out.println("Numero de Diarias: " + numDiarias);

		if (tipoApt == 'A' || tipoApt == 'a' ) {

			System.out.println("Valor unitario: R$ 150");
		} else {
			if (tipoApt == 'B' || tipoApt == 'b') {
				System.out.println("Valor unitario: R$ 100");
			} else {
				if (tipoApt == 'C' || tipoApt == 'c') {
					System.out.println("Valor unitario: R$ 75");
				} else {
					if (tipoApt == 'D' || tipoApt == 'd')
					{
						System.out.println("Valor unitario: R$ 50");
					}
				}
			}

		}
		System.out.println("Valor Total das diárias: " + valorTotalDiarias);
		System.out.println("Valor Do Consumo interno: " + consumoInt);
		System.out.println("SubTotal: " + subTotal);
		System.out.println("Valor da taxa de serviço: " + taxaServico);
		System.out.println("Valor Total: " + valorTotal);


	}

}