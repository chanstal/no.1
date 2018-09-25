
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        if (v1+v3 >= v2 && v2+v1 >= v3 && v2+v3>=v1)
        {System.out.println("True");
        }
        else{System.out.println("False");



    }}}