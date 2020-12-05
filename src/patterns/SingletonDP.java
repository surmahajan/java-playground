package patterns;

import java.util.logging.Logger;

public class SingletonDP {
    private final static Logger LOGGER = Logger.getLogger(SingletonDP.class.getName()); 
    
    // Define private instance
    private static SingletonDP instance = new SingletonDP();

    // private constructor
    private SingletonDP() {}

    public static SingletonDP getInstance() {
        return instance;
    }

    public static void main(String str[]){
        //Eager Initialization
        SingletonDP dp = SingletonDP.getInstance();
        LOGGER.info(dp.toString());

        Singleton s= Singleton.getInstance();
        LOGGER.info(s.toString());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}