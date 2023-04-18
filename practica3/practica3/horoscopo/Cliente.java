package practica3.horoscopo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Cliente {
	 static final String HOST = "localhost";
	 static final int PUERTO=8888;
	 Scanner sc = new Scanner(System.in);
public Cliente(){
	try {
		boolean flag = true;
		Socket skCliente = new Socket( HOST , PUERTO);
		DataOutputStream dOut = new DataOutputStream(skCliente.getOutputStream());
		System.out.println("Escribe tu fecha de nacimiento en formato dd/MM/YYYY");
		dOut.writeUTF(sc.nextLine());
		DataInputStream dIn = new DataInputStream(skCliente.getInputStream());
		while(flag) {
			byte typeMsg = dIn.readByte();
			switch (typeMsg) {
			case 1: 
				System.out.println(dIn.readUTF());
			break;
			case 2:
				System.out.println(dIn.readUTF());
			break;
			default:
				flag = false;
			}
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
public static void main(String[] arg) {
	new Cliente();
}
}
