package pure.strategy;

public class Agressivo implements Comportamento{
    @Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}

}
