package practica3.horoscopo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servidor {
	static final int PUERTO = 8888;

	public String setHoro(String fecha) {
		String pro = "";
		Date fechita = new Date();
		Date fechaNac = null;
		try {
			fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int mes = fechaNac.getMonth() + 1;
		int dia = fechaNac.getDate();
	//	System.out.println("mes: " + mes);
		//System.out.println("dia: " + dia);
		// Aries 21 de marzo al 19 de abril
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			// Aries
			switch (fechita.getDay()) {

			case 0:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 2:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 3:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 4:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 5:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 6:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 1:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Aries: "+pro;
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {

			// Tauro
			switch (fechita.getDay()) {

			case 1:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 6:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 2:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 5:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 4:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 3:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 0:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Taruo: "+pro;
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			// cancer
			switch (fechita.getDay()) {

			case 2:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 6:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 1:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 3:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 4:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 5:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 0:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Cancer: "+pro;
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			switch (fechita.getDay()) {

			case 6:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 0:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 1:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 2:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 3:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 4:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 5:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			// geminis
			pro = "Geminis: "+pro;
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {

			// leo
			switch (fechita.getDay()) {

			case 5:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 6:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 0:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 1:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 2:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 3:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 4:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Leo: "+pro;
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			switch (fechita.getDay()) {

			case 4:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 5:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 6:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 0:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 1:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 2:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 3:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			// virgo
			pro = "Virgo: "+pro;
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			switch (fechita.getDay()) {

			case 3:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 4:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 5:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 6:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 0:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 1:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 2:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			// Libra
			pro = "Libra: "+pro;
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			// escorpio
			switch (fechita.getDay()) {

			case 2:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 3:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 4:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 5:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 6:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 1:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 0:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Escorpio: "+pro;
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			// sagitario
			switch (fechita.getDay()) {

			case 1:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 4:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 5:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 2:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 3:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 6:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 0:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Sagitario: "+pro;
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			// Capricornio
			switch (fechita.getDay()) {

			case 4:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 6:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 1:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 5:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 2:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 3:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 0:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Capricornio: "+pro;
		} else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			switch (fechita.getDay()) {

			case 5:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 0:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 6:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 2:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 3:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 4:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 1:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			pro = "Acuario: "+pro;
		} else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
			switch (fechita.getDay()) {

			case 0:
				pro = "No debes fiarte demasiado de las promesas que te hagan tus jefes o superiores, porque te dirán una cosa y luego quizás no cumplan tus expectativas.";
				break;
			case 6:
				pro = "En el trabajo " + "puedes mejorar con un poco más de esfuerzo. "
						+ "Aprovecha el buen momento que llega a tu vida gracias a "
						+ "la influencia del Sol. El número seis y el color rojo te darán " + "suerte en los juegos.";
				break;
			case 1:
				pro = "Gracias a la influencia de Marte vas a tener mucha suerte en todo lo relacionado con los negocios o inversiones. El cuatro te dará suerte.";
				break;
			case 5:
				pro = "La influencia negativa de Marte en tu signo hará que tengas que tener cuidado con el dinero, ya que podrías ser víctima de una estafa.";
				break;
			case 2:
				pro = "Si trabajas con tu familia, habrá un problema económico que tendrás que solucionar, evita enfrentamientos porque no servirán de nada. El blanco y el dos te darán suerte.";
				break;
			case 4:
				pro = "El Cuatro de Oros me indica que tu economía va a mejorar gracias a un dinero extra por un trabajo eventual. No trabajes gratis para nadie y aprende a valorarte.";
				break;
			case 3:
				pro = "Te puedes llevar una gran alegría por la firma de un contrato de trabajo. Ahora es el momento perfecto para mejorar.";
				break;
			}
			// Picis
			pro = "Picis: "+pro;
		} else {
			pro = "no entendi";
		}
		return pro;
	}

	public Servidor() {
		int numClnt = 0;

		try {
			ServerSocket skServidor = new ServerSocket(PUERTO);
			System.out.println("Escucho el puerto " + PUERTO);
			// TODO: handle exception
			while (true) {
				numClnt++;
				Socket skClnt = skServidor.accept();
				DataInputStream input = new DataInputStream(skClnt.getInputStream());
				String fecha = input.readUTF();
				DataOutputStream stream = new DataOutputStream(skClnt.getOutputStream());
				try {

					Thread.sleep((int) Math.floor(Math.random() * (20 - 1) + 5) * 1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				stream.writeByte(1);
				stream.writeUTF("Hola cliente " + numClnt);
				stream.flush();
				stream.writeByte(2);
				stream.writeUTF("Tu horoscopo para el dia "+new SimpleDateFormat("dd-MM-yyyy").format(new Date())+" es: "+setHoro(fecha));
				stream.flush();
				skClnt.close();
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

	public static void main(String[] arg) {
		new Servidor();
	}
}
