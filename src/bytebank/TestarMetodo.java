package bytebank;

public class TestarMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(20);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(50);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaAmanda = new Conta();
		contaDaAmanda.deposita(2000);
		
		boolean sucessoTransferencia = contaDaAmanda.transfere(500, contaDaAmanda); {
			if(sucessoTransferencia) {
				System.out.println("transf com sucesso");
			} else {
				System.out.println("faltou dinheiro ");
			}
		};
		
		System.out.println(contaDaAmanda.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Amanda Cassiano";
		System.out.println(contaDoPaulo.titular);
		
	}

}
