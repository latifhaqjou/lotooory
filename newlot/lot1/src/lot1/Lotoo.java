package lot1;
import java.util.*;
public class Lotoo {
	public static void main(String[] args) { 
		
		  Scanner loto=new Scanner(System.in);
		  Random rand=new Random();
		  System.out.println(" "
		  + "\n            WEEL COME TO THE BIGEST LOTTORY GAME IN AFGHANISTAN"); 
		  
		  System.out.println("\nThe game is as follows: You have to enter\n one "
		  +"tow-digits number,"
		  +" the computer also selects a\n number"
		  +" with two digits randomly\n,"
		  +" if the number entered by you is the\n"
		  +" same as the random digit\n,"
		  +" you win $ 10,000, and if the number is\n"
		  +" the same but the order is different,\n"
		  +" you win $ 5,000 and If only one of\n"
		  +" the numbers entered matches the random number,\n"
		  +" you will win $ 1,000. If the given\n "
		  +"digits do not match the random digits,\n"
		  +" you will not get anything.\n");
		  
		  System.out.print("if you wnt to play so enter your  name first: ");
		  String name =loto.nextLine();
		  
		  System.out.print("OK Mr "+name+ " enter a number between 10-99:");
		  int input=loto.nextInt();
		  
		  if (input>99&&input<10) 
		  {System.out.println("pleas try again you entered a wrong number");}
		  
		  int input1=input/10;
		  int input2=input%10;
		  System.out.println("you entered :"+input+" and  ");
		  
		  int cnum=rand.nextInt(89)+10;
		  int cnum1=cnum/10;
		  int cnum2=cnum%10;
		  System.out.print("the random number was :"+cnum);
	
		   if (input1==cnum1&&input2==cnum1)
		   {System.out.println(" so you wine 10000$ Mr "+name);}
		   
		   else if (input1==cnum2&&input2==cnum1)
		   {System.out.println("so you wine 5000$ Mr "+name);}
		   
		   else if (input1==cnum1||input1==cnum2||input2==cnum1||input2==cnum2)
		   {System.out.println(" so you wine 1000$ Mr "+name);}
		   
		   else{System.out.println("  so you lose the lotory Mr "+name);}
	        }
            }
