package caesars.cipher;

public class Main {

	public static void main(String[] args) {
		String message = "how are you doing today";
		String cipheredMessage = "tai mdq kag pauzs fapmk";
		
		int offset = 12;
		
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		
		caesarsCipher.cipher(message, offset);
		caesarsCipher.cipher(cipheredMessage, -offset);
		
		
		
		
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + caesarsCipher.cipher(message, offset));
//		
//		System.out.println("Message: " + cipheredMessage);
//		System.out.println("Offset: " + -offset);
//		System.out.println("Ciphered message: " + caesarsCipher.cipher(cipheredMessage, -offset));
		
	}

}
