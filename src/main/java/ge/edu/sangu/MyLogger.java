package ge.edu.sangu;

import java.time.LocalDateTime;

/**
 * the logger itself
 * has a name
 * skeleton loggig program
 * and two summonable loggers
 * for info logging
 * and
 * debug logging
 * */
public class MyLogger {

    private String name;
    public MyLogger(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public void printMethod(Level level, String message){
        if(level==null){
            throw new IllegalArgumentException("Logging Level cannot have Empty or Null arguments");
        }
        if(message==null||message.isBlank()){
            throw new IllegalArgumentException("Message cannot have Empty or Null arguments");
        }
        System.out.println("["+LocalDateTime.now()+"]["+name+"]["+level+"]: "+message);

    }

    public void info(String message){
        printMethod(Level.INFO, message);
    }

    public void debug(String message){
        printMethod(Level.DEBUG, message);
    }
}
