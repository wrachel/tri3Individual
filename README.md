# Individual Github Pages
[link to Github Pages](https://wrachel.github.io/tri3Individual/)

# GRADING
| Week | Score | Review Ticket with Scoring | 
| ---- | ----- | -------------------------- |
 Week 0 | 2.9/3 | [Review Ticket](https://github.com/wrachel/tri3Individual/issues/1)  

## Navigating Notes and Plans for Each Tech Talk
In each Tech Talk, I will prepare questions and review the Tech Talk material beforehand. I will take notes on important key concepts for each TT. 

After completing the challenges associated with each TT, I will record my progress, struggles & key learnings in this Github Page (or on an alternative Jekyll site). TT challenge code will be executable through Repl.it.

#### TT0:

Data Structures are: method of organizing data. Types of data structures --> primitive (intger, float, String, Boolean) & Non-primitive (Arrays, Lists)
![image](https://user-images.githubusercontent.com/40574565/158223705-2bd7992a-ca34-415a-a161-fdfd26a12b1e.png)

Data Structures and Algorithms go together
* Data structures have the data & the algorithms access the data
* similar to how a for loop iterates through an array to access the data in an array

Imperative Paradigm & Object Oriented Paradigm
* Imperative paradigm -- uses statements to change a program's states
* Procedural Programming is a type of imeprative programming based on procedures 
* Object Oriented programming -- classes and objects (what we've been doing in class) -- defining classes, extending classes, subclass-specific behavior & polymorphism

Structured programming has techniques to improve maintainability (diff from imperative paradigm)

#### TT1:


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

#### [RUN THE CHALLENGES ON Replit link](https://replit.com/@RachelWei1/Data-Structures-Indiv)

### TT0: 

Links to Github for Code: [Challenge 1: menu](https://github.com/wrachel/tri3Individual/blob/master/tri3Individual/src/menu.java)
**KEY LEARNINGS**: using the HashMap to with a **Runnable action** so that the main file of each challenge can be run. This was probably the most important, key part to figuring out this challenge. This also helps keep all the challenges organized so that the menu can iterate through the HashMap.
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

Another interesting thing was the **try and catch** implementation. Essentially, the try & catch helps account for user error (if the user puts an int that is invalid)

        } catch (Exception e){
        
            System.out.println("Something went wrong. Please try again. \n");


Links to Github for Code: [Challenge 2: IntByReference (put lower number first)](https://github.com/wrachel/tri3Individual/blob/master/tri3Individual/src/IntByReference.java)
**Key Learnings**
implementing getters and setters so that in the swapToLowHighOrder function, we can actually use the getters and setters to swap the values

    public void swapToLowHighOrder(IntByReference a){
        //if condition to switch if the 1st value is bigger than the 2nd
        if(this.value > a.getValue()){
            //swapping values of a, b
            int temp = this.value; 
            this.value = a.getValue(); //using getter
            a.setValue(temp); //using setter
        }
    }
    
Also, another interesting thing to mention is that with this method, using a "temp" variable is necessary in order to be able to actually swap the values. 

Links to Github for Code: [Challenge 3: Matrix (format Array output)](https://github.com/wrachel/tri3Individual/blob/master/tri3Individual/src/Matrix.java)

**KEY TAKEAWAYS** : the Matrix challenge was definitely a little harder, but the most **key** takeaways here is understanding the toString method and nested for loops to iterate through a 2D array.

First, for **toString method**, it's key to solving this challenge to understand that toString methods can be used to access data within an Array. So, for each value in the 2D array, I would assign it to a returnStatement variable which I then had to format (through \n statements and spaces, etc.).

        public String toString(){
        ...
           return returnStatement;
        }
        
For the **nested for loops**, I used it to actually access the values within the 2D array and assign them to the return Statement. 

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                //nested for loop to access values in 2D array
                if(matrix[i][j] < 0 ) {
                    returnStatement += "  ";
                }
                else if (matrix[i][j] > 9){
                    returnStatement += Integer.toHexString(matrix[i][j]) + " ";
                }
                else {
                    returnStatement += matrix[i][j] + " ";
                }

            }
            returnStatement += "\n";
        }
        
Notably, I also had to add if statements to deal with certain conditions (e.g., if the number is less than 0 it becomes a space and if the number is greater than 9 it becomes hex. Although technically if its greater than 0 its hex, but it's just easier for my brain to process this way.) The printed statement also needs the values in the 2D array in reverse, so I just did this by having the same nested for loop, but starting from the end of the 2D array and going backwards.

        for(int i = matrix.length - 1; i >= 0; i--){
            for(int j = matrix[i].length - 1; j >= 0; j--){
