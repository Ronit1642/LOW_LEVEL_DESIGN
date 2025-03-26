package singletonExample.doublechecklog;

public class doublecheckdbconn {
    private static doublecheckdbconn dbconn= null;

    private doublecheckdbconn(){
    }

    public static doublecheckdbconn createInstance(){
        if (dbconn == null){
            //lock
            synchronized (doublecheckdbconn.class) {
                if (dbconn == null) {
                    dbconn = new doublecheckdbconn();

                }
            }
            //unlock;


        }
        return dbconn;
    }

}
