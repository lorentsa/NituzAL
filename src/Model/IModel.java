package Model;


public interface IModel {
    boolean Create(String userName,String password,String firstName,String lastName,String birthday,String city);
     String Read(String userName);
     void Update(String userName,String password,String firstName,String lastName,String birthday,String city);
     void Delete(String userName, String Password);

}
