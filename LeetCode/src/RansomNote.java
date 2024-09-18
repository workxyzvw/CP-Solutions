import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	public static void main(String[] args) {
		System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		int rnLength = ransomNote.length();
		int mLength = magazine.length();
		int totalLength = Math.abs(mLength-rnLength);
		int flag = 0;
		boolean result;
		Map<String, Integer> rnMap = new HashMap<>();
		rnMap = addToMap(ransomNote);
		
		char[] temp = magazine.toCharArray();
		Arrays.sort(temp);
		magazine = String.valueOf(temp);
		
//		for (int iterate = 0; iterate < mLength; iterate++) {
//			for (int index = 0; index < rnLength; index++) {
//				if ()
//			}
//		}
		
//		if (rnLength < mLength) {
//			if (!ransomNote.contains(magazine.substring(0, mLength - 2))) return false;
//		} else {
		if (rnLength < mLength) {
			result = (ransomNote.contains(magazine.substring(0, totalLength))) ? true : false;
		} else {
			result = (ransomNote.contains(magazine)) ? true : false;
		}
//		}
		
		return result;
	}
	
	public static HashMap<String, Integer> addToMap(String str) {
		HashMap<String, Integer> result = new HashMap<>();
		int count = 0;
		
		for (char c: str.toCharArray()) {
//			if (result.)
//			result.put(String.valueOf(c), );
		}
		
		return result;
	}
}
