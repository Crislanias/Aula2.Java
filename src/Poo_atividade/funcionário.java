package Poo_atividade;


public class funcionário {
	// declaração dos atributos da classe
	
	private String Nomefuncionario;
	private String cargo;
	private float salario;
	private int idade;
	private boolean clienteAtivo=true;
	private Object ativo;
	
	public funcionário (String Nomefuncionario, String cargo, float salario, int idade, boolean clienteAtivo) {
		super();
		this.Nomefuncionario = Nomefuncionario;
		this.cargo = cargo;
		this.salario = salario;
		this.idade = idade;
		this.clienteAtivo = clienteAtivo;
	}
		
	public String getNome() {
		return Nomefuncionario;
	}
	
	
	public void setNome(String Nomefuncionario) {
	this.Nomefuncionario= Nomefuncionario;
	}
	
	
	public String getcargo() {
		return getcargo();
	}
	
	public void setcargo(String cargo) {
		 this.cargo=cargo;
	}
	
	public float getsalario() {
		return salario;
	}
	
	public void setsalario(float salario) {
		this.salario=salario;
	}
	
	
	public int  getidade() {
		return idade;
	}
	
	public void setidade(int idade) {
		this.idade= idade;
	}
	
	public boolean getativo(boolean ativo) {
		return ativo;
	}
	
	public void setativo(Object ativo) {
		this.ativo=ativo;
	}
	
	

	public void visualizar() {
		System.out.println("O(a) funcionario " + Nomefuncionario + " possui a idade de: " + idade + " no cargo " + cargo +", seu salário é de: " + salario + " e seu status de trabalho é ativo= " + clienteAtivo);
	}
}