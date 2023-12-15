package String;

public class stringconcept1 
{

	public static void main(String[] args) 
	{
		//variable value  enclosed with single quotes called as char.
		//It is holds a single elemet
		
		//Number         -0 to 9  -48 to 57
		//Captital Letter- A to Z  -65 to 90
		//Small Letter   -  a to z -97 to 122

		
		char ch1='i';
		System.out.println(ch1);//i
		char ch2='9';
		System.out.println(ch2);//9
		char ch3='a';
		System.out.println(ch3);//a
		char ch4=100;
		System.out.println(ch4);//98 poiting to b
		

		
		//variable value  enclosed with double quotes called as String.
		//It is holds a multiple element.
		//collection (sequence) of character
		
		/*******************
		String
		========
		1.It is Represents Sequence of character
		2.Immutable
		There is a two way's of declaring a String
		==================================================
		   1.String literals
		   2.new String or called as (new String Instantiation)
		   
		   //String literals
		String s1="Latha G";
		//new String
		String s2=new String("Latha G");
		
		
		
		*************************/
		
		/*****************
		 * 
		 * Entire Area considered as Heap area.
		 * inside there is a string pool area.
		 String literals stored inside String pool area
		 new String stored ouside of area like ( outside of String pool area)
		 String literals it is used to avoid the duplicate values inside pool area.
		 //It is used to avoid memory duplication below is best example is :
		  *.h1 and h2 both are String literals - storing inside String pool area and contains with same name 
		  *So both will poiting to same memory location.//It is used  to avoid memory duplication
		  *h3 is new String --new String stroring  outside of String pool area
		 **************************/
		//primitive data type does not validate the address,
		//It is going to compare the  value for ( ==)operator
		//for below exampale
		
		int i =10;
		int j=10;
		boolean store = i==j;
		System.out.println("store:"+store);
		//===========================================
	
		String h1="Latha G";
		System.out.println(h1);//Latha G
		h1="Rama G";//always it will create new string lirerals hence called as immutable.
		System.out.println(h1);//Rama G

		h1="Kuti G";//always it will create new string lirerals
		System.out.println(h1);//Kuti G

		String h2="Latha G";
		System.out.println(h2);//Latha G

        String h3=new String("Latha G");//It is always create an new Instantiation
		System.out.println(h3);//Latha G

        String h4=new String("Latha G");//It is always create an new Instantiation
		System.out.println(h4);//Latha G
        h4="Kutti G";
 		System.out.println(h4);//Kutti G

        
      //String is non primitive data type 
      //It is going to compare the value .equal()
        
        boolean b1=h3.equals(h4);//It is going to compare the value of h1 and h3
        System.out.println(b1);
        
        boolean b3=h1.equals(h2);
        System.out.println(b3);
        

		//String is non primitive data type 
		//It is going to compare the address ( ==)operator
        boolean b2=h3==h4;////It is going to compare the addres of h1 and h3
        System.out.println(b2);
        
        boolean b4=h1==h2;
        System.out.println(b4);
        

        
        
		
		char[] name1= {'l','a','t','h','a'};
		for (char k : name1) {
			System.out.print(k);
		}
		

	}

}
