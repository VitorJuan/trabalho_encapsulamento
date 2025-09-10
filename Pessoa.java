package faculdade.trabalho_encapsulamento;

public class Pessoa {


	private String name;
	private int age;
	private String address;

	public Pessoa() {
		name = null;
		age = 0;
		address = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Erro ao tentar informar a idade");
			return;
		}
		
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
}
