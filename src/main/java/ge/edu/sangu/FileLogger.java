package ge.edu.sangu;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class FileLogger extends MyLogger {

    private String fileName;

    public FileLogger(String name, String fileName) {
        super(name);
        this.fileName = fileName;
    }

    public void filemethod(String level, String message) {
        super.printMethod(level, message);
        String text = "[" + LocalDateTime.now() + "][" + super.getName() + "][" + level + "]: " + message + '\n';
        try {
            Files.writeString(Paths.get(this.fileName), text, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void info(String message) {
        filemethod("INFO", message);
    }

    @Override
    public void debug(String message) {
        filemethod("DEBUG", message);
    }
}
