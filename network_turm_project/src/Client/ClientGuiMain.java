package Client;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClientGuiMain {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			String ip_str = ia.toString();
			String ip = ip_str.substring(ip_str.indexOf("/") + 1);
			new MainFrame(ip, 9647);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
 