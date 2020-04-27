import java.util.Scanner;

public class AnArrayToRemember {
    public static void main(String[] args){
        /*
        1. Initialize String Array with name of last 10 presidents.
        2. Prompt user for word "history" to trigger presidential name printing.
        2. Use for loop to print the most recent backwards.
         */
        Scanner scn = new Scanner(System.in);
        String recent_presidents[] = {"Johnson", "Nixon", "Ford", "Reagan", "Carter", "Bush", "Clinton", "Bush", "Obama", "Trump"};
        System.out.println("Enter the word 'history' to view the most recent presidents: ");
        String history_init = scn.nextLine();
        if (history_init.equalsIgnoreCase("history")){
            for (int i = recent_presidents.length-1; i>=0; i--){
                if (i>0) {
                    System.out.print(recent_presidents[i] + ", ");
                }
                else{
                    System.out.print(recent_presidents[i]);
                }
            }
        }


    }
}
