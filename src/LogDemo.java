import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogDemo {
    private static final Logger logger = Logger.getLogger(LogDemo.class.getName());

    public static void main(String[] args){
        try{
            //create a fileHandler tha writes to "app.log" and appends if already exist
            // aka don't erase entries
            FileHandler fh = new FileHandler("app.log", true);



            // Use a simple, haman - readable text formater
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            //Attach the file Handler to our logger
            logger.addHandler(fh);

            //Ensure all Levels are captured
            logger.setLevel(Level.ALL);

            logger.info("App Started");
            logger.warning("This is a warning");
            logger.severe("This is a severe");


            //Loop for 100 entries 
            for (int i = 1; i <= 100; i++){
                if (i % 20== 0){
                    logger.severe("Critical Error" +i);
                } else if (i % 10 == 0) {
                    logger.warning("Potential Issue" +i);

                } else {
                    logger.info ("Processing Info" +i ) ;
                }
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
