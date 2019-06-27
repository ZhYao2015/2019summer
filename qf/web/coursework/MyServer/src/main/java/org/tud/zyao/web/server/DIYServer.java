package org.tud.zyao.web.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DIYServer {
	public static void main(String[] args) {

		try {
			//create socket
			ServerSocket listener=new ServerSocket(10086);
			//receive requests
			System.out.println("Starting the client...");
			Socket socket=listener.accept();
			//get outputstream
			OutputStream os=socket.getOutputStream();
		    
			//
			FileInputStream fis=new FileInputStream(DIYServer.class.getClassLoader()
					.getResource("hello.html").getFile());
			
			byte[] buf=new byte[1024*4];
			int len=0;
			while((len=fis.read(buf))!=-1){
				os.write(buf,0,len);
				os.flush();
			}
			
			System.out.println("Server completed execution.");
			
			fis.close();
			os.close();
			socket.close();
			listener.close();
			
			System.out.println("Server is closed.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
