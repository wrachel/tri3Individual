# Individual Github Pages

## Navigating Notes and Plans for Each Tech Talk
In each Tech Talk, I will prepare questions and review the Tech Talk material beforehand. I will take notes on important key concepts for each TT. 

After completing the challenges associated with each TT, I will record my progress, struggles & key learnings in this Github Page (or on an alternative Jekyll site). TT challenge code will be executable through Repl.it.

## Test Prep Plans and Participation

I will follow what our Operational Officer has decided to do for our 10-person study team review. I will also be doing my additional own review, which is detailed below.

To prepare for the AP exam, by the AP Exam I will have done the full pracitce MC questions and FRQ questions from 2010 to most recently (or others, as I see fit). I will also be reviewing specific content that I find difficult by re-watching College Board videos or using other resources on the internet to practice more specific topics.

Topics I need to focus on:
* Writing and creating classes
* 2D Arrays (and nested for loops)
* ArrayLists and the special functions they have
* Recursive functions
* Inheritance: parent & child classes, super() keyword
* enhanced for loops
* When to use specific keywords for classes: private/public, static, void, when a return statement is necessary
* Different search algorithms


## Data Structures Work

### TT0: 
#### [Replit link](https://replit.com/@RachelWei1/Data-Structures-Indiv)

Links to Github for Code: [Challenge 1: menu](https://github.com/wrachel/tri3Individual/blob/master/tri3Individual/src/menu.java)
KEY LEARNINGS: using the HashMap to with a **Runnable action** so that the main file of each challenge can be run. This was probably the most important, key part to figuring out this challenge. This also helps keep all the challenges organized so that the menu can iterate through the HashMap.
'''
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
'''
Another interesting thing was the **try and catch** implementation. Essentially, the try & catch helps account for user error (if the user puts an int that is invalid)

'''
catch (Exception e){
            //exception for if user puts something not applicable
            System.out.println("Something went wrong. Please try again. \n");
        }
'''

Links to Github for Code: [Challenge 2: IntByReference (put lower number first)](https://github.com/wrachel/tri3Individual/blob/master/tri3Individual/src/IntByReference.java)


Links to Github for Code: [Challenge 3: Matrix (format Array output)](https://github.com/wrachel/tri3Individual/blob/master/tri3Individual/src/Matrix.java)



