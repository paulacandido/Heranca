
public class Fornecedor extends Pessoa {

private double valorCredito, valorDivida;
Fornecedor(){
	
}
Fornecedor(double valorCredito,double valorDivida,String endereco, String telefone, String nome){
	super(endereco, telefone, nome);
	this.valorCredito = valorCredito;
	this.valorDivida = valorDivida;
	
}

public double getValorDivida() {
	return valorDivida;
}

public void setValorDivida(double valorDivida) {
	this.valorDivida = valorDivida;
}

public double getValorCredito() {
	return valorCredito;
}

public void setValorCredito(double valorCredito) {
	this.valorCredito = valorCredito;
}
public double obterSaldo() {
	return this.valorCredito - this.valorDivida;
}

}
