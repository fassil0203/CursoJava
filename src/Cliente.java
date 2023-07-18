
public class Cliente implements Autenticavel {

	
	private AutenticacaoUtil  autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {			//metodo
		this.autenticador.setSenha(senha); 

	}

	@Override
	public boolean autentica(int senha) {		//metodo
		return this.autenticador.autentica(senha);
		
	}

}


