package aula;

public class BebidaDecorator implements Bebida{
	protected Bebida bebida;
	
	public BebidaDecorator(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String obterDescricao() {
		return bebida.obterDescricao();
	}
	
	@Override
	public double obterCusto() {
		return bebida.obterCusto();
	}

}
