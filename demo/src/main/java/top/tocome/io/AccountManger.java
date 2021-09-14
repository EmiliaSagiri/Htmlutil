package top.tocome.io;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.util.ArrayList;

public class AccountManger {
    public static final ArrayList<Account> ljj=new ArrayList<>();
    public static boolean testAccount(long id,String password){
        ArrayList<Account>test=new ArrayList<>();
        for(Account a:test){
            if(a.login(id, password))
                return true;
        }
        return false;
    }
    public static void register(long id,String password){
        File.write("a.txt", ljj.getClass(),false);
    }
    public static void save (long id,String password){

    }
}
