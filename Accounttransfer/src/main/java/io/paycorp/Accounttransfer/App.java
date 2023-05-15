package io.paycorp.Accounttransfer;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/test", "root", "password");
    
    }catch (Exception e) {
        e.printStackTrace();

    }
}
}