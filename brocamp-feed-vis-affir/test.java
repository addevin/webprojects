import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test{
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        String[] commands = {"system.exe", "cmd /c start cmd.exe /K \"adb connect 172.16.10.10:5555\""};
        Process proc = rt.exec(commands);
        
        BufferedReader stdInput = new BufferedReader(new 
             InputStreamReader(proc.getInputStream()));
        
        BufferedReader stdError = new BufferedReader(new 
             InputStreamReader(proc.getErrorStream()));
        
        // Read the output from the command
        System.out.println("Here is the standard output of the command:\n");
        String s = null;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
        // try
        // {
        //     // Just one line and you are done ! 
        //     // We have given a command to start cmd
        //     // /K : Carries out command specified by string
        //    //Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"});
        //    //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && ping localhost\"");
        //    //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"adb connect 172.16.10.10:5555\"");
        //    for (int i = 100; i < 130; i++) {
        //     Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"adb connect 172.16.5."+i+":5555\"");
            
        //    }
  
        // }
        // catch (Exception e)
        // {
        //     System.out.println("HEY Buddy ! U r Doing Something Wrong ");
        //     e.printStackTrace();
        // }
    }
}