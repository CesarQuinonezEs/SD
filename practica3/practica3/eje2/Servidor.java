package practica3.eje2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends Conexion {
   public Servidor() throws IOException{super("servidor");}
   public void startServer(){
       try{
           System.out.println("Esperando..."); 
           cs = ss.accept(); 
           System.out.println("Cliente en línea");
           salidaCliente = new DataOutputStream(cs.getOutputStream());
           BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
           while((mensajeServidor = entrada.readLine()) != null){
               System.out.println(mensajeServidor);
           }
           System.out.println("Fin de la conexión");
           ss.close();
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
   }
   public static void main(String[] args) throws IOException{
       Servidor serv = new Servidor(); 
       System.out.println("Iniciando servidor\n");
       serv.startServer(); 
   }
}
