package zhengzebiaodashi;

import java.util.Scanner;

public class Driver {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String userName = "";
System.out.println("请输入有效的用户名：");
while(true){
userName = scan.next();
if(Validate.isUserName(userName))
break;
else
System.out.println("用户名输入格式有误，请重新输入！");
}
String password = "";
System.out.println("请输入有效的密码：");
while(true){
password = scan.next();
if(Validate.isPassword(password))
break;
else
System.out.println("密码输入格式有误，请重新输入！");
}
String mobile = "";
System.out.println("请输入有效的手机号：");
while(true){
mobile = scan.next();
if(Validate.isMobile(mobile))
break;
else
System.out.println("手机号输入格式有误，请重新输入！");
}
String phone = "";
System.out.println("请输入有效的电话号：");
while(true){
phone = scan.next();
if(Validate.isPhone(phone))
break;
else
System.out.println("电话号输入格式有误，请重新输入！");
}
String qq = "";
System.out.println("请输入有效的qq号：");
while(true){
qq = scan.next();
if(Validate.isQQ(qq))
break;
else
System.out.println("qq号输入格式有误，请重新输入！");
}
String idNumber = "";
System.out.println("请输入有效的身份证号：");
while(true){
idNumber = scan.next();
if(Validate.isIDNumber(idNumber))
break;
else
System.out.println("身份证号输入格式有误，请重新输入！");
}
String postCode = "";
System.out.println("请输入有效的邮政编码：");
while(true){
postCode = scan.next();
if(Validate.isPostCode(postCode))
break;
else
System.out.println("邮政编码输入格式有误，请重新输入！");
}
String mail = "";
System.out.println("请输入有效的邮箱号：");
while(true){
mail = scan.next();
if(Validate.isMail(mail))
break;
else
System.out.println("邮箱输入格式有误，请重新输入！");
}
String website = "";
System.out.println("请输入有效的网站：");
while(true){
website = scan.next();
if(Validate.isWebsite(website))
break;
else
System.out.println("网站输入格式有误，请重新输入！");
}
String birth = "";
System.out.println("请输入有效的出生日期：");
while(true){
birth = scan.next();
if(Validate.isBirth(birth))
break;
else
System.out.println("出生日期输入格式有误，请重新输入！");
}
String name = "";
System.out.println("请输入有效的中文名字：");
while(true){
name = scan.next();
if(Validate.ChineseName(name))
break;
else
System.out.println("中文名字输入格式有误，请重新输入！");
}
System.out.println("欢迎下次使用！");

}
}
