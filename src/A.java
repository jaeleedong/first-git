import java.util.*;
public class A {
    public static void main(String[] args) {
    int input = 0, answer =0;
    answer = (int)(Math.random()*100);
    Scanner scanner = new Scanner(System.in);
       do {
           System.out.print("ddd : ");
           input = scanner.nextInt();

           if (input >answer){
               System.out.println("down");
           } else if(input <answer){
               System.out.println("up");
           }
       }
       while (input!=answer);
        System.out.println("done");

    }
}
