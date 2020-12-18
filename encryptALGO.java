//MD5 Algorithm
import java.security.*;
import java.math.BigInteger;

class encryptALGO{
	private static String original_string;
	public static void main(String args[]) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			MessageDigest sha = MessageDigest.getInstance("SHA");
			original_string="PARTH";
			byte[] encrypted_string=md.digest(original_string.getBytes());
			byte[] encrypted_string_sha = sha.digest(original_string.getBytes());
			BigInteger no_sha = new BigInteger(1,encrypted_string_sha);
			BigInteger no = new BigInteger(1,encrypted_string);
			
			String hashText_sha = no_sha.toString(16);
			String hashText = no.toString(16);
			System.out.println("Encrypted:"+hashText);
			System.out.println("Encrypted:"+hashText_sha);
			
		}catch(NoSuchAlgorithmException NSAE) {
			System.out.println(NSAE);
		}
	}
	
}