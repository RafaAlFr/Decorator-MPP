package aula;

public class ChantillyDecorator extends BebidaDecorator {
	public ChantillyDecorator(Bebida bebida) {
		super(bebida);
	}
	
	public String obterDescricao() {
		return super.obterDescricao() + ", Chantilly";
	}
	
	public double obterCusto() {
		return super.obterCusto() + 5.0;
	}
}