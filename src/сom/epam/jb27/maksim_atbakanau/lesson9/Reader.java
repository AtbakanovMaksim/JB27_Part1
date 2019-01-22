package сom.epam.jb27.maksim_atbakanau.lesson9;

import сom.epam.jb27.maksim_atbakanau.lesson9.Books.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    String filePath = "D:\\Java\\JB27\\lesson2\\src\\сom\\epam\\jb27\\maksim_atbakanau\\lesson9\\books.txt";

    public List<Book> readLibraryListFromFile() {
        List<Book> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] mass = line.split(";", 6);
                if (mass[0].equals("Fantastic")) {
                    result.add(new FantasticBook(mass[1].trim(), mass[2].trim(), Integer.parseInt(mass[3].trim()),
                            Integer.parseInt(mass[4].trim()), mass[5].trim()));
                } else if (mass[0].equals("Children")) {
                    result.add(new ChildrenBook(mass[1].trim(), mass[2].trim(), Integer.parseInt(mass[3].trim()),
                            Integer.parseInt(mass[4].trim()), Integer.parseInt(mass[5].trim())));
                } else if (mass[0].equals("Learn")) {
                    result.add(new LearnBook(mass[1].trim(), mass[2].trim(), Integer.parseInt(mass[3].trim()),
                            Integer.parseInt(mass[4].trim()), (mass[5].trim())));
                } else if (mass[0].equals("Student")) {
                    result.add(new StudentBook(mass[1].trim(), mass[2].trim(), Integer.parseInt(mass[3].trim()),
                            Integer.parseInt(mass[4].trim()), Integer.parseInt(mass[5].trim())));
                } else {
                    result.add(new Book(mass[1].trim(), mass[2].trim(), Integer.parseInt(mass[3].trim()),
                            Integer.parseInt(mass[4].trim())));
                }
            }
        } catch (IOException e) {
            System.out.println("Can't read file!");
            e.printStackTrace();
        }
        return result;
    }
}
