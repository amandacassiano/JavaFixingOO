
public class Testesaquenegativo {
	
	public static void main(String[] args) {
		Conta contaDaRafa = new Conta();
		contaDaRafa.deposita(200);
		System.out.println(contaDaRafa.saca(100));
		
		
	//toda conta nao pode ter valor negativo 
		contaDaRafa.saca(50);
		
		System.out.println(contaDaRafa.getSaldo());
	}

}
