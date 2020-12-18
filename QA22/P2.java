import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//Here P2 works as firewall
public class P2{
	public static void main(String args[])throws IOException{
		DatagramSocket ds = new DatagramSocket(1111);
		InetAddress ipAddress = InetAddress.getLocalHost();
		byte buf[] = new byte[65535];
		
		DatagramPacket dp = null;
		
		while(true){
			dp = new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			String input = new String(convertString(buf));
			if(input.indexOf("terrorist")==-1){
				DatagramPacket dp2 = new DatagramPacket(input.getBytes(),input.getBytes().length,ipAddress,2222);
				DatagramSocket ds2 = new DatagramSocket();
				ds2.send(dp2);
				System.out.println("Successfully Forwarder to User");
			}else{
				System.out.println("Can't Send !!! It contains malicious word");
			}
			buf = new byte[65535];
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