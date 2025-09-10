package faculdade.trabalho_encapsulamento;

public class Carro {

	private String make;
	private String model;
	private int velocity;
	
	private static final int MAX_VELOCITY = 160;
	private static final int MIN_VELOCITY = 0;
	
	public Carro(String make, String model, int velocity) {
		setMake(make);
		setModel(model);
		setVelocity(velocity);
	}
	
	public Carro (String make, String model) {
		setMake(make);
		setModel(model);
	}
	
	public void speedUp(int velocity) {
		if (getVelocity() >= MAX_VELOCITY) {
			System.out.println("Erro ao tentar acelerar o tanto, ele não aguenta mais");
			System.exit(1);
		}
		
		if (velocity <= 0) {
			System.out.println("Erro ao tentar acelerar o veiculo, valor de velocidade negativo");
			System.exit(1);
		}
		
		setVelocity(getVelocity() + velocity);
		if(getVelocity() > MAX_VELOCITY) {
			int excedVelocity = MAX_VELOCITY - getVelocity();
			setVelocity(MAX_VELOCITY);
			
			System.out.println("Velocidade maxima atingida, não é possível acelerar mais. Velocidade excedia: " + excedVelocity);
		}
	}

	public void speedDown(int velocity) {
		if (getVelocity() <= MIN_VELOCITY) {
			System.out.println("Erro o carro esta com aceleração negativa");
			System.exit(1);
		}
		
		if (velocity <= 0) {
			System.out.println("Erro ao tentar diminuir a aceleração do carro. Velocidade abaixo de zero");
			System.exit(1);
		}
		
		setVelocity(getVelocity() - velocity);
		if (getVelocity() < MIN_VELOCITY) {
			int excedVelocity = MAX_VELOCITY - getVelocity();
			setVelocity(MAX_VELOCITY);
			
			System.out.println("Velocidade minima atingida, não é possível reduzir. Velocidade excedida: " + excedVelocity);
		}
	}
	
	public String getCarInfo() {
		return "Make:" + getMake() + "; Model: " + getModel() + "; Current Velocity: " + getVelocity();
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getVelocity() {
		return velocity;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
}
