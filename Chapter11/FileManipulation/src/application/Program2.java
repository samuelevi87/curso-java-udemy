package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {//Solução para o erro do BufferedReader não identificar a quebra de linha

  public static void main(String[] args) {

    String path = "/home/sl3v1/eclipse-workspace/curso-java-udemy/Chapter11/FileManipulation/nameFile.txt";
    
        // https://jsparrow.github.io/rules/buffered-reader-lines.html#description
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
          br.lines().forEach(line -> {
              System.out.println(line);
          });}
          catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
          }
      }
    }

