package randomquotes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

/**
 * @title RandomQuotes
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 10-Mar-2015 10:47:35 AM
 * @purpose The purpose of this program is to provide a random quote from a text
 * file
 */
public class RandomQuotes {

    public static void main(String[] args) {
        String quotes[] = new String[50], line;//initalize varibles for quotes
        int test = 0, next;
        try {//start buffered reader and catch file not found and io exceptions
            BufferedReader br = new BufferedReader(
                    new FileReader("quotes.txt"));

            while ((line = br.readLine()) != null) {
                quotes[test] = line;
                test++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            System.exit(0);

        } catch (IOException ex) {
            System.out.println("An error has occured");
            System.exit(1);
        }
        do {
            //select a random number between 0 and 49 then display the quote at that index
            test = (int) (Math.random() * 50);
            JOptionPane.showMessageDialog(null, quotes[test]);
            //ask if they want to see the next quote
            next = JOptionPane.showConfirmDialog(null, "Do you want to see the next quote?");
        } while (next == 0);
        System.exit(2);
    }

}
