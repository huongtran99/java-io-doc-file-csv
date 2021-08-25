package com.codegym;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        readFileCSV("file.csv");
    }

    public static void readFileCSV(String filePath) {
        try {
            File file = new File(filePath);

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.split(",")));
            }
            br.close();
        } catch (IOException ie) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }


    }
}
