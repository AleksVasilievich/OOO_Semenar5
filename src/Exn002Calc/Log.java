package Exn002Calc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static Exn002Calc.CalcModel.*;

public class Log {
    ShowResult m = new ShowResult();

    void log() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file1.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {

                System.out.println("Log in file1.txt");
                FileWriter fileWriter = new FileWriter(file, true);

                fileWriter.write("Task -> № command - 1 number - 2 number - result\n");
                fileWriter.write(String.valueOf(z) + "  ");
                fileWriter.write(String.valueOf(x) + "  ");
                fileWriter.write(String.valueOf(y) + "  ");
                fileWriter.write(String.valueOf(m.result()));
                fileWriter.append(System.lineSeparator());

                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



