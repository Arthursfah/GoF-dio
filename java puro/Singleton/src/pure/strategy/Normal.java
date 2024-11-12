package pure.strategy;

public class Normal implements Comportamento{
    @Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}

}
