import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.ReverbType;

public class MorseCode {
	
	public static void main(String[] args)
	{
		String input = "eta";
		
		Map<String, String> morseCode = new HashMap<String, String>();
		
		morseCode.put("a", ".-");
		morseCode.put("b", "-…");
		morseCode.put("c", "-.-.");
		morseCode.put("d", "-..");
		morseCode.put("e", ".");
		morseCode.put("f", "..-.");
		morseCode.put("g", "--.");
		morseCode.put("h", "….");
		morseCode.put("i", "..");
		morseCode.put("j", ".---");
		morseCode.put("k", "-.-");
		morseCode.put("l", ".-..");
		morseCode.put("m", "--");
		morseCode.put("n", "-.");
		morseCode.put("o", "---");
		morseCode.put("p", ".--.");
		morseCode.put("q", "--.-");
		morseCode.put("r", ".-.");
		morseCode.put("s", "…");
		morseCode.put("t", "-");
		morseCode.put("u", "..-");
		morseCode.put("v", "…-");
		morseCode.put("w", ".--");
		morseCode.put("x", "-..-");
		morseCode.put("y", "-.--");
		morseCode.put("z", "--..");
		
Map<String, String> reverseMorseCode = new HashMap<String, String>();
		
reverseMorseCode.put(".-","a");
reverseMorseCode.put( "-…","b");
reverseMorseCode.put("-.-.","c");
reverseMorseCode.put( "-..","d");
reverseMorseCode.put(".","e");
reverseMorseCode.put( "..-.","f");
reverseMorseCode.put( "--.","g");
reverseMorseCode.put( "….","h");
reverseMorseCode.put("..","i");
reverseMorseCode.put(".---","j");
reverseMorseCode.put("-.-","k");
reverseMorseCode.put(".-..","l");
reverseMorseCode.put( "--","m");
reverseMorseCode.put("-.","n");
reverseMorseCode.put("---","o");
reverseMorseCode.put( ".--.","p");
reverseMorseCode.put( "--.-","q");
reverseMorseCode.put(".-.","r");
reverseMorseCode.put("…","s");
reverseMorseCode.put( "-","t");
reverseMorseCode.put("..-","u");
reverseMorseCode.put("…-","v");
reverseMorseCode.put(".--","w");
reverseMorseCode.put("-..-","x");
reverseMorseCode.put("-.--","y");
reverseMorseCode.put("--..","z");
		
		int length = input.length();
		
		char[] array = input.toCharArray();
		
		String translatedCode="";
		for(int i=0;i<array.length;i++){
			
			//System.out.println(array[i]);
			
			translatedCode += morseCode.get(""+array[i]);
		}
		
		//System.out.println(translatedCode);
		
		
		
		permutation("", translatedCode,reverseMorseCode);
		
		
		
	}
	private static void permutation(String perm, String word,Map<String, String> reverseMorseCode) {
		if (word.isEmpty()) 
		{ 
			System.err.println("word is  "+perm + word);
			String code = perm + word;
			
			char[] arr = code.toCharArray();
			String translation = "";
			for(int i=0;i<arr.length;i++){
				
				translation += reverseMorseCode.get(""+arr[i]);
			}
			System.out.println("translation "+translation);
		} 
		else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()),reverseMorseCode);
				}
			} 
		}

	

}
