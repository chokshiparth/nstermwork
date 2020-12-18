/*import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.PrivateKey;
import javax.crypto.Cipher;

public class AlgoAES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
			kpg.initialize(512);
			KeyPair kp = kpg.generateKeyPair();
			PublicKey pk = kp.getPublic();
			PrivateKey pkc = kp.getPrivate();
			
			Cipher ci = Cipher.getInstance("RSA");
			ci.init(Cipher.ENCRYPT_MODE,pk);
			byte[] encrypted = ci.doFinal("Parth".getBytes());
			System.out.println(encrypted.toString());
			Cipher ci1 = Cipher.getInstance("RSA");
			ci1.init(Cipher.DECRYPT_MODE,pkc);
			byte[] decrypted = ci1.doFinal(encrypted);
			System.out.println(decrypted.toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}*/
