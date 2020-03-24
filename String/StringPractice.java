
public class StringPractice {
	
	public static void main(String args[])
	{
		// immutable string
		String s = "its a IMMUTABLE STRING";
		String newStr = s.concat(" concat");
		System.out.println(s);  					// output => its a IMMUTABLE STRING
		System.out.println(newStr); 				// output => its a IMMUTABLE STRING concat
		
		//string buffer and some random practice
		StringBuffer buffer = new StringBuffer();
		buffer.append("muhammad kiyani");
		System.out.println(buffer);  				// output => muhammad kiyani
		int index = buffer.indexOf(" ");
		buffer.insert(index + 1, "ali ");			 
		System.out.println(buffer);					// output => muhammad ali kiyani
		System.out.println("capacity: " + buffer.capacity());	// output => capacity: 34
	}
}
