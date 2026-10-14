import org.example.CifrarioCesare;

import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {
    CifrarioCesare cifrario =  new CifrarioCesare();
    String input = readln("Inserisci la frase: ");
    String scelta = readln("Vuoi cifrare o decifrare la frase che inserirai (C/D)? ").toUpperCase();
    String output;
    int chiave;
    if(scelta.equals("C")) {
        chiave = Integer.parseInt(readln("Ora inserisci la chiave numerica (0-25): "));
        if(chiave < 0 || chiave > 25) {
            println("Chiave non valida, termino il programma...");
            return;
        }
        output = cifrario.cifra(input, chiave);
        println("Ecco qui la frase cifrata: " + output);
    } else if(scelta.equals("D")) {
        chiave = Integer.parseInt(readln("Ora inserisci la chiave numerica (0-25): "));
        if(chiave < 0 || chiave > 25) {
            println("Chiave non valida, termino il programma...");
            return;
        }
        output = cifrario.decifra(input, chiave);
        println("Ecco qui la frase decifrata: " + output);
    } else {
        println("Scelta non valida, termino il programma...");
    }
}