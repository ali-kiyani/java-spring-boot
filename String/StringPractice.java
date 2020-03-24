
public class StringPractice 
{
	public void ImmutableStirng()
	{
		// immutable string
		String s = "its a IMMUTABLE STRING";
		String newStr = s.concat(" concat");
		System.out.println(s);  					// output => its a IMMUTABLE STRING
		System.out.println(newStr); 				// output => its a IMMUTABLE STRING concat
	}
	
	public void StringBuffer()
	{
		//string buffer and some random practice
		StringBuffer buffer = new StringBuffer();
		buffer.append("muhammad kiyani");
		System.out.println(buffer);  				// output => muhammad kiyani
		int index = buffer.indexOf(" ");
		buffer.insert(index + 1, "ali ");			 
		System.out.println(buffer);					// output => muhammad ali kiyani
		System.out.println("capacity: " + buffer.capacity());	// output => capacity: 34
	}
	
	public void StringBufferVSStringBuilder()
	{
		 long startTime = System.currentTimeMillis();  
	        StringBuffer stringBuffer = new StringBuffer("muhammad");  
	        for (int i=0; i<100000; i++){  
	        	stringBuffer.append("ali");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  // output => 4ms
	        startTime = System.currentTimeMillis();  
	        StringBuilder stringBuilder = new StringBuilder("muhammad");  
	        for (int i=0; i<100000; i++){  
	        	stringBuilder.append("ali");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  // output => 1ms
	}
	
	public static void main(String args[])
	{
		StringPractice sp = new StringPractice();
		System.out.println("=> Strings (Immutable):");
		sp.ImmutableStirng();
		System.out.println("=> Strings (Immutable) Ended\n");
		System.out.println("=> Strings Buffer:");
		sp.StringBuffer();
		System.out.println("=> Strings Buffer Ended\n");
		System.out.println("=> String Buffer VS String Builder:");
		sp.StringBufferVSStringBuilder();
		System.out.println("=> Strings Buffer VS String Builder Ended\n");
	}
}
