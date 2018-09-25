import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        if( v1 % 4==0&& v1%100!=0||v1%400 ==0 )
        {System.out.println("Ture");}
        else{System.out.println("False");}
        if( v2 % 4==0&& v2%100!=0||v2%400 ==0 )
        {System.out.println("Ture");}
        else{System.out.println("False");}

        if( v3 % 4==0&& v3%100!=0||v3%400 ==0 )
        {System.out.println("Ture");}
        else{System.out.println("False");}



    }}
