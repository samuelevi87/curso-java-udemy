package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a folder path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);
    File[] folders = path.listFiles(File::isDirectory);

    System.out.println("\nFolders: \n");
    for (File folder : folders) {
      System.out.println(folder);
    }

    File[] files = path.listFiles(File::isFile);
    System.out.println("\nFiles: \n");
    for (File file : files) {
      System.out.println(file);
    }

    File[] hiddens = path.listFiles(File::isHidden);
    System.out.println("\nHidden Files: \n");
    for (File hidden : hiddens) {
      System.out.println(hidden);
    }

    File[] absos = path.listFiles(File::isAbsolute);
    System.out.println("\nAbsolute Files: \n");
    for (File absolute : absos) {
      System.out.println(absolute);
    }

    boolean success = new File(strPath + "subdir").mkdir();
    System.out.println("Directory created successfully: " + success);


    sc.close();
  }
  
}
