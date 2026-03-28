/**
 * O objetivo deste exercício é praticar a criação e utilização de classes abstratas e a implementação de métodos abstratos em Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 28/03/2026
 */
abstract class AFiguraGeometrica
{
	public abstract int calcularArea();
	public abstract int calcularPerimetro();
}

class Retangulo extends AFiguraGeometrica
{
	private int base;
	private int altura;

	public Retangulo(int base, int altura)
	{
		this.base = base;
		this.altura = altura;
	}

	@Override
	public int calcularArea()
	{
		return base * altura;
	}

	@Override
	public int calcularPerimetro()
	{
		return (base * 2) + (altura * 2);
	}
}

public class FiguraGeometrica
{
	public static void main(String[] args)
	{
		var r = new Retangulo(3, 5);

		System.out.println("Area = " + r.calcularArea());
		System.out.println("Perimetro = " + r.calcularPerimetro());
	}
}