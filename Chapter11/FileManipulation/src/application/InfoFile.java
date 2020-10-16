package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InfoFile {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a folder path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);
    System.out.println("getName: " + path.getName());
    System.out.println("getParent: " + path.getParent());
    System.out.println("getPath: " + path.getPath());
    System.out.println("getAbsPath: " + path.getAbsolutePath());
    try {
      System.out.println("getCanonicalPath: " + path.getCanonicalPath());
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("getTotalSpace: " + path.getTotalSpace());
    System.out.println("getUsableSpace: " + path.getUsableSpace());
    System.out.println("getFreeSpace: " + path.getFreeSpace());
    System.out.println("getClass: " + path.getClass());
    System.out.println("getParentFile: " + path.getParentFile());
    System.out.println("listRoots: " + path.listRoots());
    System.out.println("length: " + path.length());
    System.out.println("lastModified: " + path.lastModified());
    System.out.println("hashCode: " + path.hashCode());
    System.out.println("toString: " + path.toString());
    System.out.println("listFiles: " + path.listFiles());
    
  }
  
}
