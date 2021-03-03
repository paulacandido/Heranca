
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor fornece = new Fornecedor(678.90,567.89,"3457-8643","Rua do Final","Carla");
		
		System.out.println(fornece.obterSaldo());
		Empregado emprega = new Empregado(45,15,567.86,"5678-6798","Rua dos Limões","Alexandre");
		System.out.println(emprega.calcularSalario());
		
		

	}

}
