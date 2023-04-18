package practica3.eje3;

import java.io.* ;
import java.net.* ;

class Servidor2 {
 static final int PUERTO=5000;
 public Servidor2() {
   try {
     ServerSocket skServidor = new ServerSocket( PUERTO );
     System.out.println("Escucho el puerto " + PUERTO );
     for ( int numCli = 0; numCli < 6 ; numCli++) {
       Socket skCliente = skServidor.accept();
       System.out.println("Sirvo al cliente " + numCli);
       OutputStream aux = skCliente.getOutputStream();
       DataOutputStream flujo= new DataOutputStream( aux );
       flujo.writeUTF( "Hola cliente " + numCli );
       skCliente.close();
     }
     System.out.println("Demasiados clientes por hoy");
   } catch( Exception e ) {
     System.out.println( e.getMessage() );
   }
 }

 public static void main( String[] arg ) {
   new Servidor2();
 }
}
