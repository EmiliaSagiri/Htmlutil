package top.tocome.io;

import java.util.Objects;

public class Account {
    String id;
    String password;
    Boolean Authority ;
    public  Account(String id,String password){
        this.id =id;
        this.password=password;
    }
    public boolean login(String id,String password){
        if(Objects.equals(this.id, id) &&this.password.equals(password)){
            Authority =true;
            return true;
        }
        return false;

    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
