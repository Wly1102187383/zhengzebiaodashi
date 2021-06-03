package zhengzebiaodashi;


public class Validate {
public static boolean isUserName(String userName){
String regex = "[a-zA-Z][a-zA-Z0-9_]{4,15}";
if(userName.matches(regex))
return true;
else
return false;
}
public static boolean isPassword(String password){
String regex = "\\w{8,16}";
if(password.matches(regex))
return true;
else
return false;
}
public static boolean isMobile(String mobile){
String regex = "1[358]\\d{9}";
if(mobile.matches(regex))
return true;
else
return false;
}
public static boolean isPhone(String phone){
String regex = "(0\\d{2,3}-?)[1-9]\\d{7}";
if(phone.matches(regex))
return true;
else
return false;
}
public static boolean isQQ(String qq){
String regex = "[1-9][0-9]{4,}";
if(qq.matches(regex))
return true;
else
return false;
}
public static boolean isIDNumber(String idNumber){
String regex = "([1-9]\\d{5})((18|19|20)\\d{2})((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)(\\d{3})([0-9xX])";
if(idNumber.matches(regex))
return true;
else
return false;
}
public static boolean isPostCode(String postCode){
String regex = "[1-9]\\d{5}";
if(postCode.matches(regex))
return true;
else
return false;
}
public static boolean isMail(String mail){
String regex = "\\w{1,}@(\\w{1,}.){1,}\\w{1,}";
if(mail.matches(regex))
return true;
else
return false;
}
public static boolean isWebsite(String website){
String regex = "http://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?";
if(website.matches(regex))
return true;
else
return false;
}
public static boolean isBirth(String birth){
String regex = "\\d{4}-\\d{2}-\\d{2}";
if(birth.matches(regex))
return true;
else
return false;
}
public static boolean ChineseName(String name){
String regex = "[\\u4e00-\\u9fa5]{2,}";
if(name.matches(regex))
return true;
else
return false;
}

}