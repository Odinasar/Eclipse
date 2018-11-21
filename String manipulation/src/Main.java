
public class Main {

	public static void main(String[] args) {
		
		//charAt(index)returns value for the particular index
String str="    JavaScript";
System.out.println(str.charAt(3));


//length()-returns string length;
System.out.println(str.length());

//substring(int beginIndex)-returns substring for given begin index
System.out.println(str.substring(5));


//substring(int beginIndex,int endIndex)-returns substring for given begin index
System.out.println(str.substring(2,6));


// contains()- returns true or false after matching the sequence of char value
System.out.println(str.contains("va"));

//equals(Object another)-checks the equality of string with the given object

System.out.println(str.equals("JavScript"));

//isEmpty()-checks if string is empty;
System.out.println(str.isEmpty());

//concat (string str)-concatenates the specified string
System.out.println(str.concat("batch9"));

//replace(char old,char new )-replace all occurences of the specified char value
System.out.println(str.replace("Script", "Not script"));

//eqaulsIgnoreCase(string another)-compares another string .it does not check case
System.out.println(str.equalsIgnoreCase("javascript"));

//split(String delimeter)-returns a split matching delimeter
String str2="JavaScript is the best batch ever";

String [] myArray =str2.split("");
for (String word:myArray) {
	System.out.println(word);
}

//indexOF()-returns the specified char value index
System.out.println(str.indexOf("v"));


// indexOF(String substring,int fromIndex)-returns the specified substring index starting with given index

System.out.println(str.indexOf('a',1));

// toLowerCase()-returnsa string in lowercase
System.out.println(str.toLowerCase());


//toUpperCase()-returnsa string in Uppercase
System.out.println(str.toUpperCase());

// trim()-removes begining and ending spaces of this string
System.out.println(str.trim());

	}

}
