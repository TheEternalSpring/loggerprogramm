package ge.edu.sangu;


public class main {

    private static final MyLogger logger = new MyLogger("launcher 1");
    public static void main(String[] args){
        Person mike = new Person("mike",24,"accountant");
        Person sarah = new Person("sarah",23,"HR");
        Person john = new Person("john",26,"IT");
        logger.info(mike.toString());
        logger.info(sarah.toString());
        logger.info(john.toString());
        logger.info("Doing something");
        logger.info("Doing something");
        logger.info("Doing something");
        logger.info("Doing multiple things");
        logger.info("Doing multiple things");
        logger.info("Name: " + mike.getName());
        logger.info("In Process");
        logger.info("Name: " + sarah.getName());
        logger.info("In Process");
        logger.info("Name: " + john.getName());
        logger.info("In Process");
        logger.info("Job: "+mike.getJob());
        logger.info("In Process");
        logger.info("Job: "+sarah.getJob());
        logger.info("In Process");
        logger.info("Job: "+john.getJob());
        logger.debug("Debugging");
        logger.debug("Debugging");
        logger.debug("Debugging");
        logger.info("Finished!!!");

    }
}
