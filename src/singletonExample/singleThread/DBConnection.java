package singletonExample.singleThread;

public class  DBConnection{
    private static DBConnection dbconn = null;

    private DBConnection(){

    }
    public static DBConnection createInstance(){
        if(dbconn == null){
            dbconn=new DBConnection();

        }
        return dbconn;

    }
}

