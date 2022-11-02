/*
The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet:
A <=> Z; B <=> Y; C <=> X; etc.

Create a function that takes a string and applies the Atbash cipher to it.
 */

public class AtbashCipher {

    public static void main(String[] args) {
        AtbashCipher atbashCipher = new AtbashCipher();

        System.out.println(atbashCipher.atbashCipherDecode("Hello world!"));

    }

    public String atbashCipherDecode(String string){

    StringBuilder cipher = new StringBuilder();

    for (char ch : string.toCharArray()) {
        if(! Character.isLetter(ch)){
            cipher.append(ch);
        }
        else if (Character.isUpperCase(ch)) {
            int newChar = ('Z' - ch) + 'A';
            cipher.append((char) newChar);
        }
        else if (Character.isLetter(ch)) {
            int newChar = ('z' - ch) + 'a';
            cipher.append((char) newChar);
        }
    }

    return cipher.toString();
}

}