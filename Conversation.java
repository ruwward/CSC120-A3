import java.util.Scanner;
import java.util.Random;


class Conversation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome! How many rounds?");

    int rounds = sc.nextInt(); //saves number of rounds
    System.out.println("What can I do for you?");
    sc.nextLine();//prevents reply to this line
    for (int i = 0; i < rounds; i ++) {
      String reply = sc.nextLine(); //saves user input
      
      if (reply.contains(" I ")){
        String output = (reply.replace(" I ", " you "));
        System.out.println(output);
      }
      else {
        Conversation.reply();
      }
      //i had many more of these conditional statements but they are conflicting
      //with each other so i am working on a method to fix it i just needed to get
      //up early tomorrow

    }
    System.out.println("ok byeeeee!");
    sc.close();
  }

  public static void reply(){ //generates random reply
    Random rand = new Random();
    int num = rand.nextInt(6); //number between 0 and 5
    if (num == 0){
      System.out.println("I never thought of that.");}
    else if (num == 1){
      System.out.println("Word.");}
    else if (num == 2){
      System.out.println("We should get pizza.");}
    else if (num == 3){
      System.out.println("We would be friends.");}
    else if (num == 4){
      System.out.println("I agree");}
    else if (num == 5){
      System.out.println("I can't believe that!");}
  }
}
