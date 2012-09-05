import java.util.Random;


public class Generator
{
	private static final String DEFAULTLETTERS = "qwertyuioplkjhgfdsazxcvbnm";
	private static final String CAPITALS = "QWERTYUIOPLKJHGFDSAZXCVBNM";
	private static final String NUMBS = "1234567890";
	private static final String SYMBS = "!@#$%^&*()=+,./?";
	
	public static String generate(boolean caps, boolean numbers, boolean symbols, int length) {
		Random number = new Random();
		String password = "";
		int stringpos;
		for(int count = 0; count < length; count++) {
			int q = number.nextInt(3);
			q++;
			switch(q) {
				case 1:
					if(caps == true) {
						stringpos = number.nextInt(25);
						stringpos++;
						password += CAPITALS.charAt(stringpos);
					}
					
					else {
						stringpos = number.nextInt(25);
						stringpos++;
						password += DEFAULTLETTERS.charAt(stringpos);
					}
					
				break;
				
				case 2:
					if(numbers == true) {
						stringpos = number.nextInt(9);
						stringpos++;
						password += NUMBS.charAt(stringpos);
					}
					else {
						stringpos = number.nextInt(25);
						stringpos++;
						password += DEFAULTLETTERS.charAt(stringpos);
					}
				break;
				
				case 3:
					if(symbols == true) {
						stringpos = number.nextInt(15);
						stringpos++;
						password += SYMBS.charAt(stringpos);
					}
					else {
						stringpos = number.nextInt(25);
						stringpos++;
						password += DEFAULTLETTERS.charAt(stringpos);
					}
				break;
				
				default:
					stringpos = number.nextInt(25);
					stringpos++;
					password += DEFAULTLETTERS.charAt(stringpos);
			}
		}	
		return password;
	}
}
