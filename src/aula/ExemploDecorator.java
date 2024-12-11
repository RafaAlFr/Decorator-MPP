package aula;

public class ExemploDecorator {
	public static void main(String[] args) {
		Bebida cafe = new Cafe();
		Bebida cafe2 = new Cafe();
		Bebida chocolate = new Chocolate();
		Bebida chocolate2 = new Chocolate();
		
		cafe = new LeiteDecorator(cafe);
		cafe = new AcucarDecorator(cafe);
		
		System.out.println("Bebida: "+ cafe.obterDescricao());
		System.out.println("Custo Total: R$"+ cafe.obterCusto() + "\n");
		
		cafe2 = new ChantillyDecorator(cafe2);
		cafe2 = new ChocolateDecorator(cafe2);
		
		System.out.println("Bebida: "+ cafe2.obterDescricao());
		System.out.println("Custo Total: R$"+ cafe2.obterCusto() + "\n");
		
		chocolate = new ChantillyDecorator(chocolate);
		chocolate = new LeiteDecorator(chocolate);
		
		System.out.println("Bebida: "+ chocolate.obterDescricao());
		System.out.println("Custo Total: R$"+ chocolate.obterCusto() + "\n");
		
		chocolate2 = new ChantillyDecorator(chocolate);
		chocolate2 = new LeiteDecorator(chocolate);
		chocolate2 = new AcucarDecorator(chocolate);
		
		System.out.println("Bebida: "+ chocolate2.obterDescricao());
		System.out.println("Custo Total: R$"+ chocolate2.obterCusto() + "\n");
	}
}
