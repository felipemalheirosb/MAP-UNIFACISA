
public class Cliente {
	
	public static void main(String args[]) {
		ImagemTarget imagem = new ImagemAdapter();
		imagem.carregarImagem((Imagem) imagem);
		imagem.desenharImagem((Imagem) imagem);
	}

}
