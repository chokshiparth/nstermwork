//client side
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class Client{
	private final static int KEY = 3; 
	public static String encryptData(String data){
		String answer = "";
		for(int i=0;i<data.length();i++){
			int value = data.charAt(i);
			char newChar = (char)(value + KEY);
			answer += newChar;
		}
		return answer;
	}
	public static void main(String args[])throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String user_input = sc.nextLine();
		DatagramSocket ds = new DatagramSocket();
		InetAddress ipAddress = InetAddress.getLocalHost();
		System.out.println("Original Data:"+ user_input); 
		String encrypted_data = encryptData(user_input);
		System.out.println("Encrypted Data: "+encrypted_data);
		byte buf[] = encrypted_data.getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,ipAddress,1111);
		ds.send(dp);
	}
}