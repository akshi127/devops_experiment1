package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n= sc.nextInt();
            boolean prime=n>1;
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    prime=false;
                    break;
                }
            }
            System.out.println(prime?"Prime":"Not prime");
            sc.close();

    }
}
