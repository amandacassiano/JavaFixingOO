
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta ();
		
		conta.setNumero(144);
		System.out.println(conta.getNumero());
		
		
		
		Cliente amanda = new Cliente();
		amanda.setNome("amanda cassiano");
		
		conta.setTitular(amanda);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("desenvolvedora");
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("desenvolvedora");
		
		System.out.println(titularDaConta); 
        System.out.println(amanda);
        System.out.println(conta.getTitular());
		
		
	}

}
