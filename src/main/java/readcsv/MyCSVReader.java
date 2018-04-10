package readcsv;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyCSVReader {

    private static void showColumns(String columns[]) {
        for (String column : columns) {
            System.out.print(column + ", ");
        }
        System.out.println();
    }

    public static List<User> method1(String csvFile, String cvsSplitBy) throws IOException {
        BufferedReader br;
        int totalRows = 0;

        String line;
        FileReader fr = new FileReader(csvFile);
        br = new BufferedReader(fr);

        List<User> rows = new ArrayList<>(); // Jorik dream
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(cvsSplitBy);
            User user = new User(columns);
            rows.add(user);
            showColumns(columns);
            totalRows++;
        }

        return rows;
    }

    public static int method2(String pathToFile) throws IOException {
        CSVReader reader;
        int total = 0;

            reader = new CSVReader(new FileReader(pathToFile));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                showColumns(nextLine);
                total++;
            }

        return total;
    }

    public static int method3(String pathToFile, char separate) throws IOException {
        int wrote = 0;

            CSVWriter writer = new CSVWriter(new FileWriter(pathToFile));

            for (int i = 1; i <= 5; i++) {
                String[] entries = "first#second#third".split("#");
                writer.writeNext(entries);
                wrote++;
            }


            writer.close();

        return wrote;
    }
}

class User {
    String name;
    String phone;

    public User(String[] columns) {
        setName(columns[0]);
        setPhone(columns[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class Admin {

}

class Kuharka {

}