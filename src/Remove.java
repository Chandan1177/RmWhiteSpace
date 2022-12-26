import java.sql.SQLOutput;
import java.util.Scanner;

public class Remove {
    Scanner sc=new Scanner(System.in);
    String str;
    public void removeWhRep(){
            System.out.println("enter a string");
            str=sc.nextLine();
            char [] chars=str.toCharArray();
        StringBuffer stbf = new StringBuffer();
        for (char c:chars) {
            if(c!=' '){
                stbf.append(c);
            }
        }
        System.out.println(stbf.toString());
    }
}
