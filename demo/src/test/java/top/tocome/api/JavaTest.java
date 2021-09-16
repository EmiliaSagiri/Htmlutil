package top.tocome.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.json.JSONException;
import top.tocome.io.*;

import java.util.List;

public class JavaTest {

    public static void main(String[] args) throws JSONException {
       Boolean x =AccountManger.ljj.Login("11","11");
        System.out.println(x);




    }
    public static void find(String key){
        String a = File.read("a.json");
//        AccountManger.ljj.register("1","2");

        JSONArray x = JSON.parseArray(a);
        for (int i=0 ;i< x.size();i++){
            System.out.println( x.getJSONObject(i).getString(key)+x.getJSONObject(i).getString("password"));
        }
    }


}
