
public class Agente {
	
	private Pessoa pessoa;
	private int idAgente;

	public Agente(Pessoa pessoa) {
		this.pessoa = pessoa;
		this.idAgente = idAgente;
	}
	public int getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}
	
	public String getNome() {
		return this.pessoa.getNome();
	}
	
	public void setNome(String nomeAgente) {
		this.pessoa.setNome(nomeAgente);
	}
	
	public String getEndereco(){
		return this.pessoa.getEndereco();
	}
	
	public void setEndereco(String enderecoAgente) {
		this.pessoa.setEndereco(enderecoAgente);
	}
}
