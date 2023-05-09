import java.util.ArrayList;
import java.util.List;

public class User  {

    String username;
    String password;
    static List<User> userList = new ArrayList<>();
    
    //For the permission admin is equals to true and employee is equal to false

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void add(User user){
        userList.add(user);
    }
    @Override
    public String toString(){
        return("User name is " +username + "and the pssword is " + password);
    }
}
