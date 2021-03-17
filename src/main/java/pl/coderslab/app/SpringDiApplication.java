package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.bean.*;

public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.hello();

        Ship ship = context.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();

        ScopeSingleton singleton = context.getBean(ScopeSingleton.class);
        System.out.println(singleton);
        ScopeSingleton singleton1 = context.getBean(ScopeSingleton.class);
        System.out.println(singleton1);

        ScopePrototype scopePrototype = context.getBean(ScopePrototype.class);
        ScopePrototype scopePrototype1 = context.getBean(ScopePrototype.class);
        System.out.println(scopePrototype);
        System.out.println(scopePrototype1);



        context.close();

    }
}
