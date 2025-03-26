package singletonExample;

import singletonExample.singleThread.DBConnection;
import singletonExample.eagerloading.eagerDBConnection;
import singletonExample.doublechecklog.doublecheckdbconn;

public class client {
    public static void main(String[] args){
        DBConnection one = DBConnection.createInstance();
        DBConnection two = DBConnection.createInstance();

        System.out.println("Object 1    " + one);
        System.out.println("Object 2    " + two);
        System.out.println();

        eagerDBConnection three = eagerDBConnection.createInstance();
        eagerDBConnection four = eagerDBConnection.createInstance();

        System.out.println("Object 3    " + three);
        System.out.println("Object 4    " + four);
        System.out.println();
        doublecheckdbconn five = doublecheckdbconn.createInstance();
        doublecheckdbconn six = doublecheckdbconn.createInstance();

        System.out.println("Object 3    " + five);
        System.out.println("Object 4    " + six);



    }

}
