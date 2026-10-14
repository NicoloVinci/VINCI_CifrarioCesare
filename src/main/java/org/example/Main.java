import org.example.CifrarioCesare;

import static java.lang.IO.println;

void main() {
    CifrarioCesare cifrario =  new CifrarioCesare();
    String output = cifrario.cifra("ciao grandissimo zozzone", 3);
    println(output);
    output = cifrario.decifra(output, 3);
    println(output);
}