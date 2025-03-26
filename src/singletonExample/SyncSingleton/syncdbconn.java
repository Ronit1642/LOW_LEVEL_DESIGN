package singletonExample.SyncSingleton;

public class syncdbconn {
    private syncdbconn(){

    }
    public static syncdbconn syncdb = null;
    public static synchronized syncdbconn createInstance(){
        if (syncdb == null){
            syncdb = new syncdbconn();
        }
        return syncdb;
    }

}
