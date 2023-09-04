import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
 PromptBank promptClass = new PromptBank(); //initialize promptClass
  Scanner input = new Scanner (System.in); //initialize input
  
  String userInput;
  
  Boolean remote = true;

    
  
 while (remote) {
    
   System.out.println("Hello, my name is Eliza. What is your name?");
  String name = input.next();
System.out.println("Hello, " + name +" . Tell me what is on your mind today in 1 sentence.");
     
   while(true) {
   userInput = input.next();
    userInput = userInput + input.nextLine();

    String [] wordBank = userInput.split(" ");
    //String sentence;
    if (userInput.endsWith("?")) //if user inputs a question 
    {
      String sentence =  promptClass.getPerfectStatement(wordBank, '?');
      System.out.println(sentence);
      
    }
    
    else if(userInput.endsWith("!")) 
    {
      String sentence = promptClass.getPerfectStatement(wordBank, '!');
      System.out.println("WOW! Dramatic! " + sentence);
    }

    else if(userInput.endsWith("."))  {
      String sentence =  promptClass.getPerfectStatement(wordBank, '.');
      System.out.println(sentence);
    }
    
     else {
       break;
     }
   } //end inner loop
   
  System.out.println("Do you want to run the session again?");
   userInput = input.next();
   if (userInput.equalsIgnoreCase("no")) {
     System.out.println("Goodbye, until next time");
     remote = false;
   }
   
    
  }  //end while loop
  
   // System.out.println(promptClass.getRandomQuestionTrunk());
    
  
  }
  



/*
public static String getPerfectStatement (String [] wordBankMain , char sign) {
	String result = "";
  if (sign == '?')// if statement ends with question 
{
  result = promptClass.getRandomQuestionTrunk();
  }
  
  else if (sign == '!') {
    result = promptClass.getRandomStatementTrunk(); // if statement ends with anything else
  }
    
  result = result.replace("BLANK1" ,wordBankMain [0] ); //replace with first word from the user inputs
  result = result.replace("BLANK2" ,wordBankMain [wordBankMain.length - 1] ); //replace with last word from the user inputs
  
     return result;

  */
  }


  