package pure.strategy;

public class Lento implements Comportamento {
    @Override
	public void mover() {
		System.out.println("Movendo-se lentamente...");
	}

}
