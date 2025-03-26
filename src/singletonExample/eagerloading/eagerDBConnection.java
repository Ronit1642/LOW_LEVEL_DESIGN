package singletonExample.eagerloading;

public class eagerDBConnection {
    private static eagerDBConnection eagerdb = new eagerDBConnection();
    private eagerDBConnection(){

    }
    public static eagerDBConnection createInstance(){
        return eagerdb;
    }
}
