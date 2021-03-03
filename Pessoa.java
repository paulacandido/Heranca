
public class Pessoa {
	private String nome, endereco, telefone;
	
	Pessoa(){
		
	}
	Pessoa(String telefone, String nome){
		this.telefone = telefone;
		this.nome = nome;
	}
	Pessoa(String endereco, String telefone, String nome){
		this.endereco = endereco;
		this.telefone = telefone;
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
