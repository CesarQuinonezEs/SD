package practica3.clima;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {
	 static final int PUERTO=8666;
	 public  String getWhterWeak(){
		 int climaOpc = (int)Math.floor(Math.random() *(3 - 1) + 1);
		 String clima = "";
		 switch(climaOpc) {
		 case 1:
			 clima = "Soleado";
			 
		 break;
		 case 2:
			 clima = "Nublado";
	     break;
		 case 3:
			 clima = "Con lluvia";
		 break;
		 }
		 return clima;
	 }
	public Servidor() {
		int numClnt = 0;
		
		try {
			ServerSocket skServidor = new ServerSocket( PUERTO );
			 System.out.println("Escucho el puerto " + PUERTO );
				// TODO: handle exception
		 while(true) {
			 numClnt++;
			 Socket skClnt = skServidor.accept();
			 DataInputStream input = new DataInputStream(skClnt.getInputStream());
			 String estado = input.readUTF(); 
			 DataOutputStream stream = new DataOutputStream(skClnt.getOutputStream());
			 try {
				 
				 Thread.sleep((int)Math.floor(Math.random() *(20 - 1) + 5) * 1000);
			 }catch (Exception e) {
				 System.out.println(e);
			 }
			 stream.writeByte(1);
			 stream.writeUTF("Hola cliente " + numClnt);
			 stream.flush();
			 stream.writeByte(2);
			 stream.writeUTF("El clima de " +estado+" sera: "+ getWhterWeak());
			 stream.flush();
			 skClnt.close();
		 }
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	 public static void main( String[] arg ) { 
		 new Servidor();
	 }
}
