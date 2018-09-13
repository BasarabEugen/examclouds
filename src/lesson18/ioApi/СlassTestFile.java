package lesson18.ioApi;

import java.io.File;
import java.io.IOException;

class СlassTestFile {
    public static void main(String[] args) {
        /*Path*/
        String path = "D:\\javaproject\\git\\examclouds\\src\\io\\sample.txt";
        String pathTest = "D:\\javaproject\\git\\examclouds\\src\\io\\sampleTest.txt";
        /*Instance file with path*/
        File file = new File(path);
        File file1 = new File(pathTest);


        /*Create new instance file*/
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File "+ (file.exists() ? "Exist": "Not exist"));
        System.out.println("File name: " + file.getName());
        System.out.println("Rename file " + file.renameTo(file1));
        System.out.println("File length :" + file.length() + "(byte)");
        System.out.println("Relative path: " + file.getPath() + "\n");

        System.out.println("Absolutely path: " + file.getAbsolutePath());
        System.out.println("Location in map " + file.getParent()+ "\n");

        System.out.println("File " + (file.canWrite() ? "writable" : "not writable"));
        System.out.println("File " + (file.canRead() ? "readable" : "not readable"));
        System.out.println("File " + (file.isDirectory() ? "is directory" : "is not directory"));
        System.out.println("File " + (file.isFile() ? "is file" : "is not file"));
        System.out.println("File " + (file.isHidden() ? "is hidden" : "is not hidden"));

        System.out.println("Total space of the source " + (double)file.getTotalSpace()/Math.pow(10,9) + " Gb");
        System.out.println("Total free space of the source " + (double)file.getFreeSpace()/Math.pow(10,9) + " Gb");
        System.out.println("Total used space of the source " + (double)file.getUsableSpace()/Math.pow(10,9) + " Gb");

        System.out.println("Delete file " + file1.delete());







    }
}