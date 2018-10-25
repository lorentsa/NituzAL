package sample;

import java.util.Date;

public interface IModel {
    boolean Create(String userName,String password,String firstName,String lastName,String bithday,String city);
     User Read(String userName);
     void Update(String userName,String password,String firstName,String lastName,Date bithday,String city);
     void Delete(String userName, String Password);

}
