package ge.edu.sangu;

import java.time.LocalDateTime;

public class MyLogger {
    private String name;
    public MyLogger(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void printMethod(String level, String message){
        if(level==null||level.isBlank()){
            throw new IllegalArgumentException("Logging Level cannot have Empty or Null arguments");
        }
        if(message==null||message.isBlank()){
            throw new IllegalArgumentException("Message cannot have Empty or Null arguments");
        }
        System.out.println("["+LocalDateTime.now()+"]["+name+"]["+level+"]: "+message);

    }

    public void info(String message){
        printMethod("INFO", message);
    }

    public void debug(String message){
        printMethod("DEBUG", message);
    }
}
