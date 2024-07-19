package Utilities;

public class SelUtils {
    public static void waitForSeconds(int seconds){

        System.out.println("This util will help us to sinch our java and web application");
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }
    }
}
