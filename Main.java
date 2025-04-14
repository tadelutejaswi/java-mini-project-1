import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int UserNumber=0;
        do {
            System.out.println("Guess my number(1-100): ");
            UserNumber = sc.nextInt();
            if(UserNumber == myNum) {
                System.out.println("You guessed it!");
                break;
            } else if(UserNumber > myNum) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }  while(UserNumber>=0);

        System.out.println("My number was: ");
        System.out.println(myNum);
    }
}