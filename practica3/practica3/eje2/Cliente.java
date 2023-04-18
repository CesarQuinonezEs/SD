package practica3.eje2;

import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends Conexion{
   public Cliente() throws IOException{super("cliente");}
   public void startClient(){
       try{
           salidaServidor = new DataOutputStream(cs.getOutputStream());
           for (int i = 0; i < 5; i++)
               salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");
           cs.close();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
   }
   public static void main(String[] args) throws IOException{
       Cliente cli = new Cliente(); 
       System.out.println("Iniciando cliente\n");
       cli.startClient(); 
   }
}
