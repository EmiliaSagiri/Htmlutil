package top.tocome.io;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class AccountManger {
    public static final AccountManger ljj = new AccountManger();

    ArrayList<Account> accounts = new ArrayList<>();

    AccountManger() {
        accounts.add(new Account("1", "a"));
        accounts.add(new Account("2", "b"));
    }

    public boolean Login(String id, String password) {
        for (Account x : accounts) {
            boolean a=x.login(id, password);
            System.out.println(a);
            if (a)
                return true;
        }
        return false;
    }


    public String register(String id, String password) {
        Account a = new Account(id, password);
        accounts.add(a);
        return File.read("a.txt");
    }

    public static void save(String id, String password) {

    }
}
