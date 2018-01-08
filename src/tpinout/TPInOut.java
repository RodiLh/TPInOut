package tpinout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dmr
 */
public class TPInOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File f = new File("file.txt");

        try {
            // On écrit dans le fichier file.txt
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
//            bw.write("Salut mec !");
//            bw.newLine();
//            bw.write("J'écris dans mon fichier");
//            bw.newLine();
            
            // On récupère la saisie de l'utilsateur que l'on écrit dans notre fichier
            // On se permet de tout de même de l'afficher directement dans la console (test)
            System.out.println("Entrez une ligne : ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
            String line = in.readLine();
            
            System.out.println("System.out.println(line => \"" + line + "\")");
                      
            bw.write(line);
            bw.newLine();
            
            bw.close();
            
            // on lit notre fichier
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);       
            
            String str = br.readLine();
            
            while (str != null)  {
                System.out.println(str);
                str = br.readLine();
            }
            
            br.close();

        } catch (IOException e) {
            System.err.println("Erreur : " + e);
            e.printStackTrace();
        }

    }
}
