package pure;

import pure.facade.Facade;
import pure.singleton.SingletonEager;
import pure.singleton.SingletonLazy;
import pure.singleton.SingletonLazyHolder;
import pure.strategy.Agressivo;
import pure.strategy.Comportamento;
import pure.strategy.Lento;
import pure.strategy.Normal;
import pure.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getLazy();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getLazy();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getEager();
        System.out.println(eager);
        SingletonEager eager2 = SingletonEager.getEager();
        System.out.println(eager2);

        SingletonLazyHolder holder = SingletonLazyHolder.getHolder();
        System.out.println(holder);
        SingletonLazyHolder holder2 = SingletonLazyHolder.getHolder();
        System.out.println(holder2);

        // Strategy
		
		Comportamento defensivo = new Lento();
		Comportamento normal = new Normal();
		Comportamento agressivo = new Agressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");

    }
}
