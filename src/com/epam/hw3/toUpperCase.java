package com.epam.hw3;
import java.io.*;

public class toUpperCase {

    public void toUpperCase(String path) {
        try {
            FileInputStream fs = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            String line;

            while ((line=br.readLine()) != null){
                String[] inputLineWords = line.split(" ");

                for (int i=0; i<inputLineWords.length; i++){
                    String uppercasedLetter = inputLineWords[i].substring(0, 1).toUpperCase();
                    String uppercasedWord = uppercasedLetter + inputLineWords[i].substring(1);
                    System.out.print(uppercasedWord + " ");
                }
                System.out.print("\n");
            }

        }catch (IOException e){
            System.out.println("Ошибка");
        }

    }
}
