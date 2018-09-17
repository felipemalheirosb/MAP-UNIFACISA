

public interface BancoUsuarios {
	public int quantidadeDeUsuarios = (int) (Math.random() * 100);
	public int usuariosConectados = (int) (Math.random() * 10);

	public String getNumeroDeUsuarios();
	
	public String getUsuariosConectados();
	
}