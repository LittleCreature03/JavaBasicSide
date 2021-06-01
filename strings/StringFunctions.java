package strings;

public class StringFunctions {

	public static void main(String[] args) {
	
		String str="HelloWorld";
		
		//Returns the character at the specified index
		System.out.println("The Character at the index 2 is"+str.charAt(2));
		//Returns the unicode value of character at the specified index in a string
		System.out.println("The unicode value of the character at index 2 is"+str.codePointAt(2));
		//Returns the unicode value of the character before the specified index in a string
		System.out.println("The unicode value of the character before the index '2' is"+str.codePointBefore(2));
		//returns the number of Unicode value found in a string
		System.out.println("The number of Unicode value in the given string between 0 and 2 is"+str.codePointCount(0, 2));
		//Returns the number of characters that have not matched
		System.out.println("The number of characters that has not matched is"+str.compareTo("HelloWo"));
		//Returns '0' if every thing is matched
		System.out.println("The match value is"+str.compareToIgnoreCase("helloworld"));
		//Concatenates the first and second string
		System.out.println("The Concatenated String is"+str.concat("hello"));
		//Returns the hashcode of a given string
		System.out.println("The hashcode of given string is"+str.hashCode());
		//indents and prints the string
		System.out.println("The indented string  is"+str.indent(4));
		//Returns the index of particular character
		System.out.println("The  index of 'o' is"+str.indexOf("o"));
		
		
		
		

	}

}
