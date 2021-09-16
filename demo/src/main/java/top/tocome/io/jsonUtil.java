package top.tocome.io;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class jsonUtil {
    /*
    *json数据写入文件
     */
    public static void jasonW() {
        // 存放对象
        JSONObject jObject = new JSONObject();
        // 数组
        JSONArray jArray = new JSONArray();
        // 内层json
        JSONObject innerjObject = null;
        // 存放姓名和年龄的数组
        String[] nameArr = { "张三", "李四", "王五" };
        int[] ageArr = { 12, 13, 14 };
        try {
            for (int i = 0; i < ageArr.length; i++) {
                innerjObject = new JSONObject();
                innerjObject.put("name", nameArr[i]);
                innerjObject.put("age", ageArr[i]);
                jArray.put(innerjObject);
            }
            jObject.put("info", jArray);
            PrintStream pStream = new PrintStream(new FileOutputStream("a.json"));
            pStream.print(jObject);
            pStream.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("false");
        }

    }
    /*
     *文件读取json数据，检索账号密码
     */
    public static Boolean jasonR(String namea ,String passworda) {
        System.out.println();
        //先获取文件，该文件为上文写入位置
        java.io.File file = new File("a.json");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(file));
            String infoString = null;
            while (scanner.hasNext()) {
                infoString = scanner.next();
            }
            //测试用，看看字符串是否符合预期
            System.out.println(infoString);
            //开始解析
            JSONObject jOresponse = new JSONObject(infoString);
            JSONArray jsonArray = jOresponse.getJSONArray("info");
            for (int i = 0; i < jsonArray.length(); i++) {
                //里面存放的是对象
                JSONObject innnerOBJ = jsonArray.getJSONObject(i);
                String sname = innnerOBJ.getString("name");
                String iage = innnerOBJ.getString("age");
                if (sname.equals(namea) && iage.equals(passworda)){
                    System.out.println(sname + "============" + iage);
                    return true;
                }
                //打印出来看看

            }


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
            System.out.println("出错");
        } catch (JSONException e) {
            e.printStackTrace();
        } finally {
            //关闭scaner
            scanner.close();
        }
        return false;
    }
    /*
     *文件添加json数据
     */
    public static Boolean jasonA(String namea ,String passworda) {
        //先获取文件，该文件为上文写入位置
       return true;
    }
}
