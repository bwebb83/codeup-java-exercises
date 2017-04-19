package countries;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Brian on 1/23/17.
 */
public class CountriesTextFile {
    String directory = "src/countries";
    String file = "countries.txt";
    Path filePath= Paths.get(directory, file);
    String[] countries={"USA", "Russia", "China", "Japan", "Canada", "Mexico", "Venezuela"};


    //create countries.txt
    public void create() throws IOException {
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        FileWriter fileWriter = new FileWriter(filePath.toFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        for (String country : countries) {
            printWriter.println(country);
        }
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
        }

    public void read() throws IOException{
        FileReader fileReader= new FileReader(filePath.toFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while(null != line){
            System.out.println(line);
            line=bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();
    }

    public void write() throws IOException{
        FileWriter fileWriter = new FileWriter(filePath.toFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);


    }
}




