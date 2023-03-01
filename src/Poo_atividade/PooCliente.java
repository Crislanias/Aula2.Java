package Poo_atividade;

public class PooCliente {

	

	public static void main(String[] args) {
		//instanciando um objeto da classe Cliente
	
	
		funcionário f1 = new funcionário ("amanda", "secretária", 2500, 22, false);
		funcionário f2 = new funcionário ("arthur", "gerente", 4000, 33, true);

		
		f1.visualizar(); 
		f2.visualizar();
	}

}