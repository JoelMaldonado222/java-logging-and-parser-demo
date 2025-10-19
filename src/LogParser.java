import java.io.*;
import java.util.*;

public class LogParser {
    public static void main (String[] args){
        String logFile = "app.log";
        int severeCount =0;

        //open a buff reader
        try(BufferedReader reader = new BufferedReader(new FileReader(logFile))){
            String line;
            while((line = reader.readLine()) != null){

                //check if line contains word "server"
                if (line.contains("SEVERE")) {
                    System.out.println(line); //print it
                    severeCount++; //increase count
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("\nTotal SEVERE Entries are : " + severeCount);
    }
}
