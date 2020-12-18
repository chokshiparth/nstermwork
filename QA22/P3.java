import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class P3{
	public static void main(String args[])throws IOException{
		DatagramSocket ds = new DatagramSocket(2222);
		byte buf[] = new byte[65535];
		
		DatagramPacket dp = null;
		while(true){
			dp = new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			String input = new String(convertString(buf));
			System.out.println(input);
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