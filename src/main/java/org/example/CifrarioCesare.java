package org.example;

public class CifrarioCesare {

    public String cifra(String input, int chiave) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) + chiave > 91) {
                    output += (char)((int)input.charAt(i) - (26 - chiave));
                } else {
                    output += (char)((int)input.charAt(i) +  chiave);
                }
            } else if((int)input.charAt(i) >= 97 && (int)input.charAt(i) <= 122){
                if((int)input.charAt(i) + chiave > 122) {
                    output += (char)((int)input.charAt(i) - (26 - chiave));
                } else {
                    output += (char)((int)input.charAt(i) +  chiave);
                }
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public String decifra(String input, int chiave) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) - chiave < 65) {
                    output += (char)((int)input.charAt(i) + (26 - chiave));
                } else {
                    output += (char)((int)input.charAt(i) -  chiave);
                }
            } else if((int)input.charAt(i) >= 97 && (int)input.charAt(i) <= 122){
                if((int)input.charAt(i) - chiave < 97) {
                    output += (char)((int)input.charAt(i) + (26 - chiave));
                } else {
                    output += (char)((int)input.charAt(i) - chiave);
                }
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }
}
