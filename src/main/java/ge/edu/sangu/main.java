package ge.edu.sangu;


public class main {

    private static final MyLogger logger = new MyLogger("launcher 1");
    public static void main(String[] args){
        Person mike = new Person("john",24,"accountant");
        System.out.println(mike.toString());
        logger.info("Doing something");
        logger.info("In Process");
        logger.debug("Debugging");
        logger.info("Finished");

    }
}
