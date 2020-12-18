import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server{
	private final static int KEY = 3; 
	public static String decryptData(String data){
		String answer = "";
		for(int i=0;i<data.length();i++){
			int value = data.charAt(i);
			char newChar = (char)(value - KEY);
			answer += newChar;
		}
		return answer;
	}
	public static void main (String args[])throws IOException{
		DatagramSocket ds = new DatagramSocket(1111);
		byte buf[] = new byte[65535];
		DatagramPacket dp = null;
		while(true){
			dp = new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			String encryptedData = new String(convertString(buf));
			System.out.println("Encrypted String: "+encryptedData);
			String original_input = decryptData(encryptedData);
			System.out.println("Original String: "+original_input);
			byte reply[] = "Authenticated".getBytes();
			
		}
	}
	public static StringBuilder convertString(byte[] buf){
		if(buf == null)
			return null;
		StringBuilder ans = new StringBuilder();
		for(int i=0;buf[i]!=0;i++){
			ans.append((char)buf[i]);
		}
		return ans;
		
	}
}