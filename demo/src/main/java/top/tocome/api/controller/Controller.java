package top.tocome.api.controller;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.tocome.io.AccountManger;
import top.tocome.io.CMDUtil;
import top.tocome.io.File;
import top.tocome.io.jsonUtil;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class Controller {
    public static ArrayList<java.io.File> allFile = new ArrayList<>();
    @ResponseBody
    @PostMapping("/upload")
    public boolean upload(@RequestParam("file") MultipartFile file) {
        if (file != null)
            try {
                return File.write("/var/www/html/files/" + file.getOriginalFilename(), file.getBytes(), false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        return false;
    }
    @GetMapping("/run")
    public String run(String message){
//        java.io.File file = new java.io.File(message);
//        readFile(file);
//        System.out.println("sb1");
          String [] s={"/bin/sh","-c", "java -jar "+message};
          CMDUtil.excuteCMDCommand(s);
//        System.out.println("sb2");
//        CMDUtil.excuteCMDCommand("java -jar "+allFile.get(0).getAbsolutePath());
        return message;
    }
   @PostMapping("/save")
   @CrossOrigin
    public Boolean Save(String username ,String password) {
         return  AccountManger.ljj.Login(username, password);
    }
    @PostMapping("/register")
    @CrossOrigin
    public Boolean Register(String username ,String password) {
        try {
            AccountManger.ljj.register2(username,password);
            AccountManger.ljj.register(username,password);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return  true;
    }


    public static void readFile(java.io.File directory) {
        if(directory.listFiles()!=null)
            for (java.io.File file : directory.listFiles()) {
                if (file.isDirectory())
                    readFile(file);
                else if(file.getName().endsWith("jar"))
                    allFile.add(file);//将文件夹数据写入集合中
            }
    }//读值到集合
}
