package figuras;
public abstract class FiguraGeometrica {
	private String nombre;
	private Double base, altura;

	public void setBase(double base) {
		this.base = base;
	 }	
	/*public*/ public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	 }
	/*public*/ public double getAltura() {
		return altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
	public String getNombre() {
		return nombre;
	}
	
	/*protected*/ public abstract double area();
	public abstract double perimetro();
	
	public void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}