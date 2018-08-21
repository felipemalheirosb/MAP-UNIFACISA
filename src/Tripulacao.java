
public class Tripulacao {
	
	private Pessoa pessoa;
	private int idTripulacao;
	
	public Tripulacao(Pessoa pessoa) {
		this.pessoa = pessoa;
		this.idTripulacao = idTripulacao;
	}

	public int getIdTripulacao() {
		return idTripulacao;
	}

	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}
	
	public String getNome() {
		return this.pessoa.getNome();
	}
	
	public void setNome(String nomeTrip) {
		this.pessoa.setNome(nomeTrip);
	}
	
	public String getEndereco(){
		return this.pessoa.getEndereco();
	}
	
	public void setEndereco(String enderecoTrip) {
		this.pessoa.setEndereco(enderecoTrip);
	}
	
}
