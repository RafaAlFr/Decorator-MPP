package aula;

public class ChocolateDecorator extends BebidaDecorator{
	public ChocolateDecorator(Bebida bebida) {
		super(bebida);
	}
	
	public String obterDescricao() {
		return super.obterDescricao() + ", Chocolate";
	}
	
	public double obterCusto() {
		return super.obterCusto() + 3.0;
	}
}