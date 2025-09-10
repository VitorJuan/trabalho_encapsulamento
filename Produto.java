package faculdade.trabalho_encapsulamento;

public class Produto {

	private String name;
	private double price;
	private int  amount;
	
	public static final int REMOVE_OPERATION = 0;
	public static final int ADD_OPERATION = 1;
	
	public void doAmountOperation(int value, int operation) {
		switch (operation) {
			case REMOVE_OPERATION:
				int tempAmount = amount - value;
				
				if (value <= 0) {
					System.out.println("Erro operação invalida, o valor a ser retirado e menor ou igual a zero");
					System.exit(1);
				}
				
				if (tempAmount < 0) {
					System.out.println("Erro operação invalida, a quantidade de itens será negativa após esta operação");
					System.exit(1);
				}
				setAmount(tempAmount);
			break;
			
			case ADD_OPERATION:
				if (value <= 0) {
					System.out.println("Erro operação invalida, o valor a ser adicionado e menor ou igual a zero");
					System.exit(1);
				}				
				setAmount(amount);
			break;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		if (price <= 0) {
			System.out.println("Erro ao tentar modificar o preço do produto pois o valor é zero");
			System.exit(1);
		}
		
		this.price = price;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String getProductInfo() {
		return "Name: " + name + "; Price: " + price + "; Amount: " + amount;
	}
	
}
