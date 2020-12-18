//AES ALGORITHM
import java.security.*;
import java.util.Base64;

import javax.crypto.*;
import javax.crypto.spec.*;
public class aseAlgo {
	private final static String key="1234567812345678";
	private final static String initVector="1234567812345678";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"),"AES");
			
			Cipher ci = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			ci.init(Cipher.ENCRYPT_MODE, skeySpec,iv);
			byte[] encrypted = ci.doFinal("Keshav".getBytes());
			ci.init(Cipher.DECRYPT_MODE,skeySpec,iv);
			byte[] decrypte = ci.doFinal(Base64.getDecoder().decode(Base64.getEncoder().encode(encrypted)));
			System.out.println(decrypte.toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
