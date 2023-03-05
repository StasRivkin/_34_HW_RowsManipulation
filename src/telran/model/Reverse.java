package telran.model;

import telran.interfaces.Action;

import java.io.*;
import java.util.ArrayList;

public class Reverse implements Action {
    @Override
    public void action(String fileFromName, String fileToName){
        BufferedReader br;
        ArrayList<String> rows = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(fileFromName));
            String row;
            while ((row = br.readLine()) != null) {
                StringBuffer sb = new StringBuffer(row).reverse();
                rows.add(String.valueOf(sb));
            }
            FileWriter fw = new FileWriter(fileToName);
            for (String s : rows) {
                fw.write(s + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
