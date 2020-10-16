package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

  public static void main(String[] args) {
    
    String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
    String path = "/home/sl3v1/eclipse-workspace/curso-java-udemy/Chapter11/FileManipulation/output.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for(String line:lines) {
        bw.write(line);
        bw.newLine();
      }
    }
     catch (IOException e) {
      e.printStackTrace();
    }
  }
}
