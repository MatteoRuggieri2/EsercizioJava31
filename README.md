# PrintStream

## PrintOutputStreamDemo

L'obiettivo di questo esercizio è l'utilizzo delle classi **FileOutputStream** e **PrintStream**.

Creare la classe `PrintOutputStreamDemo` con all'interno il metodo `main()` dove istanzieremo la classe e lanceremo il metodo `run()` con le operazioni di scrittura.
Questo esercizio non richiede test JUnit.

> **Nota:** Non è necessario intercettare l’eventuale I/O error, deve essere verificato con il metodo `output.checkError()`.

```java
class PrintOutputStreamDemo {

    public static void main(String[] args) {}

    private void run() {}
}
```

### Output

Scrivere una stringa all'interno del file di testo `dataPrint.txt` utilizzando la classe `PrintStream`.

### Consigli

Istanzia la classe `PrintStream` utilizzando il costruttore con `FileOutputStream` e scegli se utilizzare l'auto flush.

```java
PrintStream output = new PrintStream(file, true);
```

## Files

**dataPrint.txt**
