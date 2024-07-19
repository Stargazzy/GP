package Utilities;

public class SelUtils {
    public static void waitForSeconds(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){

        }
    }
}
