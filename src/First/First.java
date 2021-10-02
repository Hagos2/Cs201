package First;
import java.util.Scanner;

public class First {
    public static void main(String[]args){
        String Fname;
        String Mname;
        String Lname;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter name");
        Fname =keyboard.next();
        Mname =keyboard.next();
        Lname =keyboard.next();


        System.out.print(Fname +" " + Mname.charAt(0)+"." + Lname);
    }

    }

