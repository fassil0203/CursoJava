
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Administrador() {			//Construtor
		this.autenticador = new AutenticacaoUtil();
		
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void setSenha(int senha) { // metodo
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) { // metodo
		return this.autenticador.autentica(senha);

	}

}
