
public class Empregado extends Pessoa {
private int codigoSetor;
private double salarioBase, imposto;
Empregado(){
	
}
Empregado(int codigoSetor,double imposto,double salarioBase,String endereco, String telefone, String nome){
	super(endereco, telefone, nome);
	this.salarioBase = salarioBase;
	this.imposto = imposto;
	this.codigoSetor = codigoSetor;
}
public double calcularSalario() {
	return salarioBase* ((100-imposto)/100);
}
public int getCodigoSetor() {
	return codigoSetor;
}
public void setCodigoSetor(int codigoSetor) {
	this.codigoSetor = codigoSetor;
}
public double getImposto() {
	return imposto;
}
public void setImposto(double imposto) {
	this.imposto = imposto;
}
public double getSalarioBase() {
	return salarioBase;
}
public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
} 
}
