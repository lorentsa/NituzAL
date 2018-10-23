package sample;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Model implements IModel{

    public Model() {

    }

    @Override
    public void Create(String userName, String password, String firstName, String lastName, Date bithday, String city) {

    }

    @Override
    public User Read(String userName) {
        return null;
    }

    @Override
    public void Update(String userName, String password, String firstName, String lastName, Date bithday, String city) {

    }

    @Override
    public void Delete(String userName) {

    }
}
