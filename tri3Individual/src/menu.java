import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; //java library for user input
import java.util.ArrayList;

public class menu {
    String title;
    Runnable action;

    public menu(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }

    public Runnable getAction() {
        return this.action;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Hash map to put the different options for the menu
        Map<Integer, menu> Menu = new HashMap<>();

        Menu.put(1, new menu("IntByReference", () -> IntByReference.main(null) ) );
        Menu.put(2, new menu("Matrix", () -> Matrix.main(null) ) );
        //print the menu
        System.out.println("Menu:");

        for (Map.Entry<Integer, menu> pair : Menu.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue().getTitle());
        }

        //scanner gets user input for menu selection
        int input = sc.nextInt();

        try {
            //according to user input, return the method at the Map's index
            menu m = Menu.get(input);
            //run action
            m.getAction().run();
            System.out.println("");

        } catch (Exception e){
            //exception for if user puts something not applicable
            System.out.println("Something went wrong. Please try again. \n");
        }

        //recursive statement to get menu to run again
        menu.main(null);
    }

}

