import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
//process P1
public class P1{
	public static void main(String args[])throws IOException{
		Scanner sc = new Scanner(System.in);
		//read user line
		String user_input = sc.nextLine();
		
		DatagramSocket ds = new DatagramSocket();
		InetAddress ipAddress = InetAddress.getLocalHost();
		byte buf []= user_input.getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,ipAddress,1111);
		ds.send(dp);
	}
}