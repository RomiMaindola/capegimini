package gameselling;

import java.util.ArrayList;

public class User implements IValidate{
    static ArrayList<User> user = new ArrayList<>();

    static {
        User u1= new User();
        User u12= new User();
        u1.userId="romi";
        u12.userId="rakesh";
        u1.password="123";
        u12.password="123";
        user.add(u1);
        user.add(u12);
    }
    String userId;
    String password;




    public void addUser(String userId,String password) {
        this.userId = userId;
        this.password = password;
        user.add(this);

    }
    public String toString() {
        return userId + "  " + password;
    }

    String getUserId() {
        return this.userId;
    }

    String getPassword() {
        return this.password;
    }

    public  boolean IsAuthenticated(String userid, String password) {
        for (User us : user) {
            if (userid.equals(us.getUserId()) &&
                    password.equals(us.getPassword())) {
                return true;
            }
        }
        return false;
    }
}