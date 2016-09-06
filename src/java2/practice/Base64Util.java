package java2.practice;
//base64编码，通过cmd命令行的telnet实现SMTP协议发送邮件时用户名密码需编码
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
import sun.misc.BASE64Encoder;  
  
public class Base64Util {  
  
    public static void main(String[] args) throws IOException {  
        BASE64Encoder encoder = new BASE64Encoder();  
        System.out.println("请输入用户名:");  
        String username = new BufferedReader(new InputStreamReader(System.in)).readLine();  
        System.out.println(encoder.encode(username.getBytes()));  
        System.out.println("请输入密码:");  
        String password = new BufferedReader(  
                new InputStreamReader(System.in))  
                .readLine();          
        System.out.println(encoder.encode(password.getBytes()));  
    }  
}  



