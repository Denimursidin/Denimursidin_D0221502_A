# Denimursidin_D0221502_A



import java.io.*;
import java.util.*;

public class day5_java_output_formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println
("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s",s1);
            System.out.printf("%03d",x);
            System.out.printf("%n");
        }
        System.out.println
("================================");
}
}
