package sample;

import java.util.Date;

public interface IModel {
    void Create(String userName,String password,String firstName,String lastName,Date bithday,String city);
     User Read(String userName);
     void Update(String userName,String password,String firstName,String lastName,Date bithday,String city);
     void Delete(String userName);

}
