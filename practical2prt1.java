import java.util.Scanner;

public class practical2prt1
{
public static void main(String [] args)
{



Scanner scanner=new Scanner(System.in);
StringBuilder stringBuilder = new StringBuilder();


System.out.println("Enter your first name");
String str1=scanner.nextLine();

System.out.println("Enter your middle name");
String str2=scanner.nextLine();

System.out.println("Enter your middle name");
String str3=scanner.nextLine();


stringBuilder.append(str1); 
stringBuilder.append(" " + str2); 
stringBuilder.append(" " + str3); 

String result = stringBuilder.toString(); 

System.out.println("StringBuilder result: " + result);

}




}