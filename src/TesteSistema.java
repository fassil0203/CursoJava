
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente();
		g.getSenha(2222);
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		
		
		

	}

}
