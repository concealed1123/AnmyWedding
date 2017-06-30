package com.org.iii.mywedding;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * Created by iii on 2017/6/29.
 */

public class ConnenctToMSSQL extends Application{

    Connection connection = null;
    Statement statement;
    ResultSet resultSet;

    public void open(){

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");//.newInstance();

            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.56:1433/myWedding","sa","as");
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Error",e.getMessage());
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    ArrayList<String >stores = new ArrayList<>();
    public void getdata(String sql){
        stores.clear();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                stores.add(resultSet.getString("fName"));
            }
            resultSet.close();
        } catch (SQLException e) {
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    ArrayList<String >stores1 = new ArrayList<>();
    public void getdata1(String sql){
        stores.clear();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                stores1.add(resultSet.getString("fName"));
                stores1.add(resultSet.getString("fPhone"));
                stores1.add(resultSet.getString("fEmail"));
                stores1.add(resultSet.getString("fAddress"));

            }
            resultSet.close();
        } catch (SQLException e) {
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
}
