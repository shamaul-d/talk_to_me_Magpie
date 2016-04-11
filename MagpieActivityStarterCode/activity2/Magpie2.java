/*
  Team SAS - Aleksandar Shipetich -- Shariar Kabir -- Shamaul Dil
  APCS2 PD5
  Lab Magpie
  2016-04-06
*/



/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

/*Answers
 * What happens when a keyword is included in another word? Consider statements like “I know
all the state capitals” and “I like vegetables smothered in cheese.” Explain the problem with the
responses to these statements.
 * The problem is that certain keywords appear in both sentences and it would trigger the same response no matter what the actual subject is.
 * The response that is chosen, is done by the first else if statement that is read.
 * 
 *  */
public class Magpie2
{
  /**
   * Get a default greeting  
   * @return a greeting
   */
  public String getGreeting()
  {
    return "Hello, let's talk.";
  }
  
  /**
   * Gives a response to a user statement
   * 
   * @param statement
   *            the user statement
   * @return a response based on the rules given
   */
  public String getResponse(String statement)
  {
    String response = "";
    if (statement.indexOf("no") >= 0)
    {
      response = "Why so negative?";
    }
     else if ((statement.trim()).length() == 0)
    {
      response = "Type something in";
    }
    
    else if (statement.indexOf("cat") >= 0
               || statement.indexOf("dog") >= 0
               || statement.indexOf("fish") >= 0
               || statement.indexOf("bird") >= 0)
    {
      response = "Tell me more about your pets.";
    }
    else if (statement.indexOf("Mr. Brown") >= 0
               || statement.indexOf("Brown") >= 0
               || statement.indexOf("Mr.Brown") >= 0
               || statement.indexOf("mr. brown") >= 0)
    {
      response = "He sounds like a good teacher.";
    }
    
    
    else if (statement.indexOf("mother") >= 0
               || statement.indexOf("father") >= 0
               || statement.indexOf("sister") >= 0
               || statement.indexOf("brother") >= 0)
    {
      response = "Tell me more about your family.";
    }
    else if (statement.indexOf("movie") >= 0)
    {
      response = "My favorite movies are all DC";
    }
    else if (statement.indexOf("music") >= 0)
    {
      response = "What do you like to listen to? I like music.";
    }
    else if (statement.indexOf("mother") >= 0
               || statement.indexOf("father") >= 0
               || statement.indexOf("sister") >= 0
               || statement.indexOf("brother") >= 0)
    {
      response = "Tell me more about your family.";
    }
    else if (statement.indexOf("mother") >= 0
               || statement.indexOf("father") >= 0
               || statement.indexOf("sister") >= 0
               || statement.indexOf("brother") >= 0)
    {
      response = "Tell me more about your family.";
    }
    else
    {
      response = getRandomResponse();
    }
    return response;
  }
  
  /**
   * Pick a default response to use if nothing else fits.
   * @return a non-committal string
   */
  private String getRandomResponse()
  {
    final int NUMBER_OF_RESPONSES = 6;
    double r = Math.random();
    int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";
    
    if (whichResponse == 0)
    {
      response = "Interesting, tell me more.";
    }
    else if (whichResponse == 1)
    {
      response = "Hmmm.";
    }
    else if (whichResponse == 2)
    {
      response = "Do you really think so?";
    }
    else if (whichResponse == 3)
    {
      response = "You don't say.";
    }
    else if (whichResponse == 4)
    {
      response = "nice";
    }
    else if (whichResponse == 5)
    {
      response = "k";
    }
    
    return response;
  }
}
