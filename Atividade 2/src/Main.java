
public class Main {
	
	public static void main(String args[]) {
		Pessoa a = new Pessoa("Malheiros", "185, Jose Vitorino Street");
		Pessoa b = new Pessoa("Santos", "Serrotão Neighborhood");
		Pessoa c = new Pessoa("Silva", "Rondônia State");
		Pessoa d = new Pessoa("Nascimento", "Serra Redonda City");
		
		Tripulacao tripA = new Tripulacao(a);
		tripA.setIdTripulacao(1623);
		Tripulacao tripB = new Tripulacao(b);
		tripB.setIdTripulacao(1825);
		
		Agente agenteC = new Agente(c);
		agenteC.setIdAgente(007);
		
		Passageiro passD = new Passageiro(d);
		passD.setNumeroSmiles(9999);
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("  The crew member, Mr. "+tripA.getNome()+", ID: "+tripA.getIdTripulacao()+", "+"lives at"+" "+tripA.getEndereco());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("  The crew member, Mr. "+tripB.getNome()+", ID: "+tripB.getIdTripulacao()+", "+"lives on"+" "+tripB.getEndereco());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("  The agent, Mr. "+agenteC.getNome()+", ID: "+agenteC.getIdAgente()+", "+"lives in"+" "+agenteC.getEndereco());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("  The passenger, Mr. "+passD.getNome()+", Smiles: "+passD.getNumeroSmiles()+", "+"lives in"+" "+passD.getEndereco());
		System.out.println("--------------------------------------------------------------------------------");
	}

}
