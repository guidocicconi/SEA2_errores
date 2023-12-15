/*
* CopyFile.java
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
* Reads a file specified by the user and prints it´s content in standard output.
*/
public class CopyFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanFile = null;

        while(true){
            try{
                System.out.print("\nEnter the file name: ");
                String path = scan.nextLine();
                scanFile = new Scanner(new File(path));
                break;
            } catch (FileNotFoundException e){
                System.out.println("Nombre de archivo no válido.");
                continue;
            }
        }
        
        System.out.println();
        while(scanFile.hasNext()){
            System.out.println(scanFile.nextLine());
        }
        System.out.println();
        
        scan.close();
        scanFile.close();
    }
}
