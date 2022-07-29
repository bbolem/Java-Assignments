package com.btb.Day9;
import java.io.File;
public class ReadingMulFilesEx {
    public static void main(String[] args) {
        File folder = new File("path-to-folder");
        getSubFiles(folder);
    }
    private static void getSubFiles(File folder) {
        File files[] = folder.listFiles();
        for (File file : files){
            if (file.isFile()){
                System.out.println(file);
            }
            else {
                getSubFiles(file);  //recursively call all subfolders until all files are found
                System.out.println("Its folder " + file);
            }
        }
    }
}
