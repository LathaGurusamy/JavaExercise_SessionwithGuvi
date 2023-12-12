package operand;

public class Operand {

	public static void main(String[] args) {


		//Three type of operand
				//Unary(++,--)   =One operand called as unary
				//Binary (a+b,a-b,a*b,a/b,a%b) =two operand called as binary
				//Ternary (?:)=Three operand Called as Ternary
			//	a++;//It ia an post Incremental Operator--after this particular statement (a)then only increment will happen (++)
			//	++a;//It ia an pre Incremental Operator--First increment will happen (++)then only that statemnet will excute(a)
				//Exact meaning of above one is  a=a+1;
				
				int a=19;
                System.out.println(a);
                System.out.println(a++);
                System.out.println(a);
                
                int b=26;
                System.out.println(b);
                System.out.println(++b);
                System.out.println(b);

              int c=a+b;
              System.out.println(c); 
              
             
              // Excution from left to right
              String output =c % 2 == 0 ? "even": "odd";
              System.out.println(output);
              
             //  value divide by  2,if remainder 0 then even,
            //    value divide by  2,if remainder not 0 then odd
                
    
                //Division=/               ----10/2 =5
               //Modulus =%  (Remainder)-------10%5 =0
              
             //Arithmetic operator
             //Assignment Operator
             //Comparison Operator
             //Bitwise Operator
             //Logical Operator
         
              //Arithmetic operator

              int f1=10/2;
              int f2=10%2;

              System.out.println(f1);
              System.out.println(f2);

         ///Assignment operator will assign right to left value
            
              int var1=10;
              System.out.println(var1);
              var1+=5;//var1=var1+5;
              System.out.println(var1);
              System.out.println(var1);
              //Comparison Operator

            
              System.out.println(var1>20);
              System.out.println(var1>=15);
              System.out.println(var1>=15);


              
              int var2=10;
              System.out.println(var2);
              var2-=5;//var2=var2-5;
              System.out.println(var2);
              System.out.println(var2);
               boolean compare=  var1 ==var2;
              System.out.println(compare);




          
                

                
               

				
	}

}
