package firstjavaintroconcept;



/**************

 II.Loop Statement
 Loop means in general keep on execute same things again and again
 ====================================================================
 *     1.while loop
 *     2.do while loop
 *     3.for loop
 *     4.for each loop
 *     
 
     while loop
     ============
     Until the condition is true I will be executing  set of statement.
   while loop the condition is true,I will be continue to execute given statement until condition is true
   while loop part not execute the statement at once 
   
   while(condition)
   {
   
   }
   
   do while loop
   ==============
   first i will not validate the condition since after the statement.
   first i will be executing the given statement at once  and then checking the condition and keep on executing
    until condition is true
    if the condition is false,i will just exit from the loop.
    eventhough condition is false,do while will execute once.
    
    do
    {
    
    }while(condition);
   
   for loop
   ============
   for loop have an three block(Three kind of paramenter/Argument) and  can perform and keep on executing the statement 
   until condition is true.
   
   for (first-statement;condition;last-statement)
   {
   
   }
   another way of for loop
   ========================
   for (;condition;)
   {
   
  
   
   }
   
   first statement will excute only once at the beginning of loop
   condition will exceute untill condition is true,
   once the condition is true,then last statemnt will get  excuted and then will check for the condition.
 */
public class loopstatementwhileloop1 {
	public static void main(String[] args)
	{
		//below one output ,It will keep on executng and program wont get stop.excuting output infinitely
		//This is because condition is always true
		//we need to click on Terminate(Red colour rectangle) in console page --To terminate the program in console page.
		//when the loop will be end ?When the condition is false.
		while(true)
		{
			System.out.println("printing");
		}
	}

}
