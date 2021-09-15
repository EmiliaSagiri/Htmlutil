package top.tocome.api;

import top.tocome.io.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaTest {
    public static final ArrayList<String> sum =new ArrayList<>();
    public static final ArrayList<String> sum2 =new ArrayList<>();
    public static void main(String[] args) {
            Boolean x = jsonUtil.jasonR("王五","14");
            String y = File.read("a.txt");
            System.out.println(x);
            System.out.println(y);

        System.out.println(getName(y));
        System.out.println(getAge(y));

    }
    public static ArrayList<String> getAge(String x){
        String pattern = " (\\d+)+(\\d+)+(\\d+) " ;
        String y = null ;
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(x);
        while (m.find()) {
            sum2.add(m.group());
        }
        return sum2;
    }
    public static ArrayList<String> getName(String x){
        String pattern = "(\\d+)+(\\d+)?" ;
        String y = null ;
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(x);
        while (m.find()) {
            sum.add(m.group());
        }
        return sum;
    }
}
