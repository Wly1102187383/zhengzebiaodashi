package zhengzebiaodashi;

import java.util.Scanner;

public class Driver {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
String userName = "";
System.out.println("��������Ч���û�����");
while(true){
userName = scan.next();
if(Validate.isUserName(userName))
break;
else
System.out.println("�û��������ʽ�������������룡");
}
String password = "";
System.out.println("��������Ч�����룺");
while(true){
password = scan.next();
if(Validate.isPassword(password))
break;
else
System.out.println("���������ʽ�������������룡");
}
String mobile = "";
System.out.println("��������Ч���ֻ��ţ�");
while(true){
mobile = scan.next();
if(Validate.isMobile(mobile))
break;
else
System.out.println("�ֻ��������ʽ�������������룡");
}
String phone = "";
System.out.println("��������Ч�ĵ绰�ţ�");
while(true){
phone = scan.next();
if(Validate.isPhone(phone))
break;
else
System.out.println("�绰�������ʽ�������������룡");
}
String qq = "";
System.out.println("��������Ч��qq�ţ�");
while(true){
qq = scan.next();
if(Validate.isQQ(qq))
break;
else
System.out.println("qq�������ʽ�������������룡");
}
String idNumber = "";
System.out.println("��������Ч�����֤�ţ�");
while(true){
idNumber = scan.next();
if(Validate.isIDNumber(idNumber))
break;
else
System.out.println("���֤�������ʽ�������������룡");
}
String postCode = "";
System.out.println("��������Ч���������룺");
while(true){
postCode = scan.next();
if(Validate.isPostCode(postCode))
break;
else
System.out.println("�������������ʽ�������������룡");
}
String mail = "";
System.out.println("��������Ч������ţ�");
while(true){
mail = scan.next();
if(Validate.isMail(mail))
break;
else
System.out.println("���������ʽ�������������룡");
}
String website = "";
System.out.println("��������Ч����վ��");
while(true){
website = scan.next();
if(Validate.isWebsite(website))
break;
else
System.out.println("��վ�����ʽ�������������룡");
}
String birth = "";
System.out.println("��������Ч�ĳ������ڣ�");
while(true){
birth = scan.next();
if(Validate.isBirth(birth))
break;
else
System.out.println("�������������ʽ�������������룡");
}
String name = "";
System.out.println("��������Ч���������֣�");
while(true){
name = scan.next();
if(Validate.ChineseName(name))
break;
else
System.out.println("�������������ʽ�������������룡");
}
System.out.println("��ӭ�´�ʹ�ã�");

}
}
