import java.util.Scanner;

class coin{
  public static void main(String[] args){
    int Heads = 0;
    int Tails = 0;
    System.out.println("Who are you?");
    
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    
     System.out.println("Hello " + name);
    System.out.println("Tossing a coin...");
 for(int i=1;i<=3;i++){
 int result = new java.util.Random().nextInt(2);
 if(result == 0){
  Heads++;
  System.out.println("Round" + i +": Heads");
 }
 else{
  Tails++;
  System.out.println("Round" + i +": Tails");
 }
}
System.out.println("Heads:" + Heads + ", Tails: " + Tails);
if(Heads > Tails) System.out.println("you won!");
else System.out.println("you lost!");
 }
 System.out.println("Heads:" + Heads + ", Tails: " + Tails);


}
