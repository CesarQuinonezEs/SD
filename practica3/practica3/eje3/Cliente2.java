package practica3.eje3;

import java.io.*;
import java.net.*;

class Cliente2{
 static final String HOST = "localhost";
 static final int PUERTO=5000;
  public Cliente2() {
   try{
     Socket skCliente = new Socket( HOST , PUERTO);
     InputStream aux = skCliente.getInputStream();
     DataInputStream flujo = new DataInputStream( aux );
     System.out.println( flujo.readUTF() );
     skCliente.close();
   } catch( Exception e ) {
     System.out.println( e.getMessage() );
   }
 }

 public static void main( String[] arg ) {
   new Cliente2();
 }
}
