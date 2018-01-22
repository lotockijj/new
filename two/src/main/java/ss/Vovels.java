package ss;

public class Vovels {

	public String getVovels(String str) {
		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'a'|| c == 'o' || c == 'i' || c == 'e' || c == 'u') {
				sB.append(Character.toString(c));
			}
		}
		return sB.toString();
	}
	
	public int getNumberVovels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'a'|| c == 'o' || c == 'i' || c == 'e' || c == 'u') {
				count++;
			}
		}
		return count;
	}
}
