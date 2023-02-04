package Exn002Calc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log  {
    ShowResult m = new ShowResult();

    void log() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file1.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {

                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("sedgier");
                fileWriter.append(System.lineSeparator());

                fileWriter.write(" new line_write");
//                fileWriter.append(String.valueOf(m.x)).append(" ").append(String.valueOf(m.z)).append(" ").append(String.valueOf(m.y)).append(" = ").append(String.valueOf(m.result()));
                fileWriter.append("append");
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



