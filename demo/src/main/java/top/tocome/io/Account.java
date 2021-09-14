package top.tocome.io;

public class Account {
    long id;
    String password;
    public  Account(long id,String password){
        this.id =id;
        this.password=password;
    }
    public boolean login(long id,String password){
        return this.id==id&&this.password.equals(password);
    }
}
