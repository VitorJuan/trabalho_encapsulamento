package faculdade.trabalho_encapsulamento;

public class Retangulo {

	private double width;
	private double height;
	
	public String getInfo() {
		return "Width: " + getWidth() + "; Height: " + getHeight();
	}
	
	public double getPerimeter(double width, double height) {
		return (getWidth() * 2) + (getHeight() * 2);
	}
	
	public void setWidth(double width) {
		if (width <= 0) {
			System.out.println("Erro, valor menor ou igual a zero");
			System.exit(1);
		}
		
		this.width = width;
	}
	
	public void setHeight(double height) {
		if (height <= 0) {
			System.out.println("Erro, valor menor ou igual a zero");
			System.exit(1);
		}
		
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
}
