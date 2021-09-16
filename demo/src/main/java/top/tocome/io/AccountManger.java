package top.tocome.io;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONException;

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
        String a = File.read("a.json");
        JSONArray x = JSON.parseArray(a);
        for (int i=0 ;i< x.size();i++){
            accounts.add(new Account(x.getJSONObject(i).getString("id"),
                    x.getJSONObject(i).getString("password")));
        }
    }

    public boolean Login(String id, String password) {
        for (Account x : accounts) {
            boolean a=x.login(id, password);
            if (a)
                return true;
        }
        return false;
    }


    public String register(String id, String password) throws JSONException {
        Account a = new Account(id, password);
        accounts.add(a);
        return File.read("a.json");
    }

    public  void register2(String id, String password ) throws JSONException {
        String x =File.read("a.json");
        JSONArray jsonArray = JSON.parseArray(x);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", id);
            jsonObject.put("password", password );
            jsonArray.add(jsonObject);
        String jsonOutput2 = jsonArray.toJSONString();
      File.write("a.json",jsonOutput2.getBytes(),false);
    }

}
