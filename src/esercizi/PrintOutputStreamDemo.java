package esercizi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintOutputStreamDemo {
	
	String stringToWrite = "La pizza è molto buona.\r\n"
			+ "I tortellini mi piacciono ma li preferisco freddi.\r\n"
			+ "Gli HotDog sono fantastici, non può mancare la maionese.\r\n"
			+ "L'insalata anche è buona, ma preferisco le polpette della nonna.\r\n"
			+ "Le patate al forno sono sempre buone, meglio se con un po' di sale.\r\n";

	public static void main(String[] args) {
		new PrintOutputStreamDemo().run();
	}

	private void run() {
		// Creates a FileOutputStream
		FileOutputStream file = null;
		
		try {
			file = new FileOutputStream("src/text_files/dataPrint.txt", true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Creates a PrintStream
		PrintStream output = new PrintStream(file, true);
		
		// Stampo nel file la stringa
		output.print(stringToWrite);
		
		/* Alla fine controllo se ci sono stati errori (chechError ritorna true se sono stati riscontrati errori
		 * altrimenti torna false) nell'oggetto PrintStream*/
		if (output.checkError()) {
			System.out.println("C'è stato un errore!");
		} else {
			System.out.println("Operazioni completate correttamente : )");
		}
	}

}
