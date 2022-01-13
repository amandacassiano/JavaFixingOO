
public class TestaBanco {
	public static void main(String[] args) {
		Cliente amanda = new Cliente();
		amanda.nome = "Amanda Cassiano";
		amanda.cpf = "222.222.222-22";
		amanda.profissao = "programadora";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		//associa o cliente paulo à conta do paulo e associa a conta a conta do paulo no momento de depositar
		contaDoPaulo.titular = amanda;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(amanda);
	}
}
