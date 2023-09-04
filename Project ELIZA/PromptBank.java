  import java.util.Random;
  
  public class PromptBank {
  
  	String [] questions;
  	String [] statements;
  	Random selectRand = new Random();
  	
  	public PromptBank(){
  		questions = new String[3]; //initialize question array
  		statements = new String[3]; //initialize statement array 
  		this.populateStatementsArray(); //populate the statement array
  		this.populateQuestionsArray(); //populate the question array
  
  		
  	}
  
  	public void populateStatementsArray(){
  		questions[0] = "Tell me more about BLANK1 and BLANK2";
  		questions[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
  		questions[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
  		
  	}
  	public void populateQuestionsArray(){
  		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
  		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
  		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
  		
  	}
  	
  	public String getRandomStatementTrunk(){
  		
  		return statements[selectRand.nextInt(3)]; //Select a random statement
  		
  	}
  	
  	
  	public String getRandomQuestionTrunk(){
  		
  		return questions[selectRand.nextInt(3)]; //Select a random question
  		
  	}
  
    public String getPerfectStatement (String [] wordBankMain , char sign) {
  	String result = "";
    if (sign == '?')// if statement ends with question 
  {
    result = getRandomQuestionTrunk();
    }
    
    else {
      result = getRandomStatementTrunk(); // if statement ends with anything else
    }
      
    result = result.replace("BLANK1" ,wordBankMain [0] ); //replace with first word from the user inputs
    result = result.replace("BLANK2" ,wordBankMain [wordBankMain.length - 1] ); //replace with last word from the user inputs
    
       return result;
  
    }
  /*
    public String getPerfectStatement1 (String [] wordBankMain , char sign) {
     String result = "";
      if (sign == '!') {
        result = getRandomQuestionTrunk();
      }
         result = result.replace("BLANK1" ,wordBankMain [0] ); //replace with first word from the user inputs
    result = result.replace("BLANK2" ,wordBankMain [wordBankMain.length - 1] ); //replace with last word from the user inputs
    return result;
  */
      
    }
    
  
  
  
  
  
  
  