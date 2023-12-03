package Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Vai Corinthians! \nSalve o Corinthians, o campeão dos campeões, eternamente dentro dos nossos corações");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
