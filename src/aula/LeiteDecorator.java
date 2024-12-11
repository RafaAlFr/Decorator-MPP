package aula;

public class LeiteDecorator extends BebidaDecorator{
	public LeiteDecorator(Bebida bebida) {
		super(bebida);
	}
	
	public String obterDescricao() {
		return super.obterDescricao() + ", Leite";
	}
	
	public double obterCusto() {
		return super.obterCusto() + 1.5;
	}
}