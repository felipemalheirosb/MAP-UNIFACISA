
public class Passageiro {
	
	private Pessoa pessoa;
	private int numeroSmiles;
	
	public Passageiro(Pessoa pessoa) {
		this.pessoa = pessoa;
		this.numeroSmiles = numeroSmiles;
	}

	public int getNumeroSmiles() {
		return numeroSmiles;
	}

	public void setNumeroSmiles(int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
	}
	
	public String getNome() {
		return this.pessoa.getNome();
	}
	
	public void setNome(String nomePassageiro) {
		this.pessoa.setNome(nomePassageiro);
	}
	
	public String getEndereco(){
		return this.pessoa.getEndereco();
	}
	
	public void setEndereco(String enderecoPassageiro) {
		this.pessoa.setEndereco(enderecoPassageiro);
	}
	

}
