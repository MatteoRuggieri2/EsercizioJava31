package esercizi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintOutputStreamDemo {

	public static void main(String[] args) {
		new PrintOutputStreamDemo().run();
	}

	private void run() {
		// Creates a FileOutputStream
		FileOutputStream file = null;
		
		try {
			file = new FileOutputStream("src/text_files/dataPrint.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Creates a PrintStream
		PrintStream output = new PrintStream(file, true);
		
		/* Alla fine controllo se ci sono stati errori (chechError ritorna true se sono stati riscontrati errori
		 * altrimenti torna false) nell'oggetto PrintStream*/
		if (output.checkError()) {
			System.out.println("C'è stato un errore!");
		} else {
			System.out.println("Operazioni completate correttamente : )");
		}
	}

}
