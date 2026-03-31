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
        logger.info("Doing multiple things");
        System.out.println("Name: " + mike.getName());
        System.out.println("Name: " + sarah.getName());
        System.out.println("Name: " + john.getName());
        logger.info("In Process");
        System.out.println("Job: "+mike.getJob());
        System.out.println("Job: "+sarah.getJob());
        System.out.println("Job: "+john.getJob());
        logger.debug("Debugging");
        logger.info("Finished!!!");

    }
}
