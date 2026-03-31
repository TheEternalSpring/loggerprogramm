package ge.edu.sangu;


public class main {

    private static final MyLogger logger = new MyLogger("launcher 1");
    public static void main(String[] args){
        Person mike = new Person("mike",24,"accountant");
        Person sarah = new Person("sarah",23,"HR");
        Person john = new Person("john",26,"IT");
        System.out.println(mike.toString());
        System.out.println(sarah.toString());
        System.out.println(john.toString());
        logger.info("Doing something");
        logger.info("Doing something");
        logger.info("Doing something");
        logger.info("Doing multiple things");
        logger.info("Doing multiple things");
        System.out.println("Name: " + mike.getName());
        logger.info("In Process");
        System.out.println("Name: " + sarah.getName());
        logger.info("In Process");
        System.out.println("Name: " + john.getName());
        logger.info("In Process");
        System.out.println("Job: "+mike.getJob());
        logger.info("In Process");
        System.out.println("Job: "+sarah.getJob());
        logger.info("In Process");
        System.out.println("Job: "+john.getJob());
        logger.debug("Debugging");
        logger.debug("Debugging");
        logger.debug("Debugging");
        logger.info("Finished!!!");

    }
}
