import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrainersCircuit implements ActionListener {
    
    
    
    private JButton buttonA;
    
    
    
    public void TrainersCircuit() {
        
    } // end of TrainersCircuit constructor method
    
    
    
    public void outputGUI() {
        
        
        System.out.println("Press 'start' to open app:");
        
        JFrame frame = new JFrame("Start Up");
        JPanel content = new JPanel();
        frame.add(content);
        
        buttonA = new JButton("Start");
        
        buttonA.addActionListener(this);
        
        content.add(buttonA);
        
        frame.setSize(300, 10);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    } // end of outputGUI method
    
    
    
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource() == buttonA) {
            System.out.println("Starting program...\n\n\n\n\n");
            intro();
        } // end of if statement
        
        
    } // end of actionPerformed method
    
    
    
    public static void intro() {
        
        
        Trainee user = new Trainee();
        int burn = 0;
        int pushCount = 0;
        int pullCount = 0;
        int legCount = 0;
        int runCount = 0;
        int cycleCount = 0;
        int sportsCount = 0;
        String firstTime = "";
        
        try {
            firstTime = startUp(user, firstTime);
        }
        catch (Exception e) {
            
        }
        
        try {
            menu(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        }
        catch (Exception e) {
            
        }
        
        
    } // end of main
    
    
    
    // start up menu
    public static String startUp(Trainee user, String firstTime) throws IOException {
        
        
        Scanner input = new Scanner(System.in);
        
        String name = "";
        String sex = "";
        double weight = 0;
        double height = 0;
        int age = 0;
        String fG = "";
        String dP = "";
        String date = "";
        int counter = 0;
        boolean correctInput = false;
        
        // requests for personal and fitness info
        System.out.println("████████╗██████╗░░█████╗░██╗███╗░░██╗███████╗██████╗░██╗░██████╗\n" +
                            "╚══██╔══╝██╔══██╗██╔══██╗██║████╗░██║██╔════╝██╔══██╗╚█║██╔════╝\n" +
                            "░░░██║░░░██████╔╝███████║██║██╔██╗██║█████╗░░██████╔╝░╚╝╚█████╗░\n" +
                            "░░░██║░░░██╔══██╗██╔══██║██║██║╚████║██╔══╝░░██╔══██╗░░░░╚═══██╗\n" +
                            "░░░██║░░░██║░░██║██║░░██║██║██║░╚███║███████╗██║░░██║░░░██████╔╝\n" +
                            "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░╚══╝╚══════╝╚═╝░░╚═╝░░░╚═════╝░");
        System.out.println("                          ❚█══█❚                                 ");
        System.out.println("         ░█████╗░██╗██████╗░░█████╗░██╗░░░██╗██╗████████╗\n" +
                           "         ██╔══██╗██║██╔══██╗██╔══██╗██║░░░██║██║╚══██╔══╝\n" +
                           "         ██║░░╚═╝██║██████╔╝██║░░╚═╝██║░░░██║██║░░░██║░░░\n" +
                           "         ██║░░██╗██║██╔══██╗██║░░██╗██║░░░██║██║░░░██║░░░\n" +
                           "         ╚█████╔╝██║██║░░██║╚█████╔╝╚██████╔╝██║░░░██║░░░\n" +
                           "         ░╚════╝░╚═╝╚═╝░░╚═╝░╚════╝░░╚═════╝░╚═╝░░░╚═╝░░░");
        System.out.println();
        System.out.println("Hello! Welcome to the Trainer's Circuit!");
        System.out.println();
        System.out.println("What is your first name?:");
        name = input.nextLine();
        System.out.println();
        System.out.println("What is the date today?");
        date = input.nextLine();
        System.out.println();
        
        while (true) {
            System.out.println("Enter sex:");
            sex = input.nextLine();
            
            if (sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female")) {
                break;
            }
            else {
                System.out.println("Invalid entry. Enter 'male' or 'female'.");
                System.out.println();
            } // end of if statement
        } // end of while loop
        
        System.out.println();
        
        while (!correctInput) {
            try {
                System.out.println("What is your weight (in pounds)?:");
                weight = input.nextDouble();
                System.out.println();
                correctInput = true;
                if (weight < 1) {
                    System.out.println("Invalid entry. Weight must be above 0.");
                    System.out.println();
                    correctInput = false;
                } // end of if statement
            }
            catch (Exception e) {
                input.nextLine();
                System.out.println("Invalid entry. Enter a number.");
                System.out.println();
            }
        } // end of while loop
        
        correctInput = false;
        
        while (!correctInput) {
            try {
                System.out.println("How tall are you (in inches)?:");
                height = input.nextDouble();
                System.out.println();
                correctInput = true;
                if (height < 1) {
                    System.out.println("Invalid entry. Height must be above 0.");
                    System.out.println();
                    correctInput = false;
                } // end of if statement
            }
            catch (Exception e) {
                input.nextLine();
                System.out.println("Invalid entry. Enter a number.");
                System.out.println();
            }
        } // end of while loop
        
        correctInput = false;
        
        while (!correctInput) {
            try {
                System.out.println("How old are you?:");
                age = input.nextInt();
                System.out.println();
                correctInput = true;
                if (age < 18 && age > 0) {
                    System.out.println("Invalid entry. You must be at least 18 to use this app.");
                    System.out.println("Closing app...");
                    System.exit(0);
                }
                else if (age < 1) {
                    System.out.println("Invalid entry. age must be above 0.");
                    System.out.println();
                    correctInput = false;
                } // end of if statement
            }
            catch (Exception e) {
                input.nextLine();
                System.out.println("Invalid entry. Enter a number.");
                System.out.println();
            }
        } // end of while loop
        
        while (true) {
            if (counter == 0) {
                input.nextLine();
                counter = 1;
            } // end of if statement
            
            System.out.println("What is your fitness goal (cutting, toning, bulking)?");
            fG = input.nextLine();
            System.out.println();
                        
            if (fG.equalsIgnoreCase("cutting") || fG.equalsIgnoreCase("toning") || fG.equalsIgnoreCase("bulking")) {
                break;
            }
            else {
                System.out.println("Invalid entry. Enter one of the following options.");
                System.out.println();
            } // end of if statement
        } // end of while loop
        
        while (true) {
            System.out.println("Choose your diet plan intensity (relaxed, moderate, intense):");
            dP = input.nextLine();
            System.out.println();
            System.out.println();
            
            if (dP.equalsIgnoreCase("relaxed") || dP.equalsIgnoreCase("moderate") || dP.equalsIgnoreCase("intense")) {
                break;
            }
            else {
                System.out.println("Invalid entry. Enter one of the following options.");
                System.out.println();
            } // end of if statement
        } // end of while loop
        
        // saves values to respective categories
        user.setName(name);
        user.setSex(sex);
        user.setWeight(weight);
        user.setHeight(height);
        user.setAge(age);
        user.setFitnessGoal(fG);
        user.setDietPlan(dP);
        user.setDate(date);
        
        while (true) {
            System.out.println("Is this your first time using this app (enter 'yes' or 'no')?:");
            System.out.println();
            System.out.println("*Entering 'yes' will create a new blank workout log for you.*");
            System.out.println("*Entering 'no' will update your current workout log.*");
            firstTime = input.nextLine();
            System.out.println();
            
            if (firstTime.equalsIgnoreCase("yes") || firstTime.equalsIgnoreCase("no")) {
                break;
            }
            else {
                System.out.println("Invalid entry. Enter one of the following options.");
                System.out.println();
            } // end of if statement
        } // end of while loop
        
        if (firstTime.equalsIgnoreCase("yes")) {
            PrintWriter writer = new PrintWriter(new File(user.getName()+"_workout_log.txt"));
            writer.println(user.getName()+"'S WORKOUT LOG");
            writer.println("==================================================");
            writer.close();
        } // end of if statement
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        
        return firstTime;
        
        
    } // end of startUp method
    
    
    
    // app's main menu
    public static void menu(Trainee user, int burn, int pushCount, int pullCount, int legCount, int runCount, int cycleCount, int sportsCount, String firstTime) throws IOException {
        
        
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        boolean correctInput = false;
        
        System.out.println("███╗░░░███╗░█████╗░██╗███╗░░██╗  ███╗░░░███╗███████╗███╗░░██╗██╗░░░██╗\n" +
                           "████╗░████║██╔══██╗██║████╗░██║  ████╗░████║██╔════╝████╗░██║██║░░░██║\n" +
                           "██╔████╔██║███████║██║██╔██╗██║  ██╔████╔██║█████╗░░██╔██╗██║██║░░░██║\n" +
                           "██║╚██╔╝██║██╔══██║██║██║╚████║  ██║╚██╔╝██║██╔══╝░░██║╚████║██║░░░██║\n" +
                           "██║░╚═╝░██║██║░░██║██║██║░╚███║  ██║░╚═╝░██║███████╗██║░╚███║╚██████╔╝\n" +
                           "╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░╚══╝  ╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░╚═════╝░");
        System.out.println("=======================================================================");
        
        while (!correctInput) {
            try {
                System.out.println("Calories Burned Today: " + burn);
                System.out.println();
                System.out.println("Select one of the following:");
                System.out.println("1 - Start Workout");
                System.out.println("2 - Check Workout Log");
                System.out.println("3 - Prepare Meal");
                System.out.println("4 - Check Today's Workout Summary");
                System.out.println("5 - Close App");
                num = input.nextInt();
                System.out.println();
                correctInput = true;
                if (num < 1 || num > 5) {
                    System.out.println("Invalid entry. Enter one of the following options:");
                    System.out.println();
                    correctInput = false;
                } // end of if statement
            }
            catch (Exception e) {
                input.nextLine();
                System.out.println("Invalid entry. Input must be an integer.");
                System.out.println();
                correctInput = false;
            }
        } // end of while loop
        
        if (num == 1) { // if user wants to start workout
            workout(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        }
        else if (num == 2) { // if user wants to check workout log
            checkLog(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        }     
        else if (num == 3) { // if user wants to meal prep
            mealPrep(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        }
        else if (num == 4) { // if user wants to check today's workout summary
            summary(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        }
        else { // if user wants to close app
            saveLog(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
            System.out.println("Workout log updated.");
            System.out.println();
            System.out.println("Great work today! Have a good night!");
            System.out.println("Closing app..");
            System.exit(0);
        } // end of if statement
        
        
    } // end of menu method
    
    
    
    // option to start a workout
    public static void workout(Trainee user, int burn, int pushCount, int pullCount, int legCount, int runCount, int cycleCount, int sportsCount, String firstTime) throws IOException {
        
        
        Scanner input = new Scanner(System.in);
        
        String exercise = "";
        int weightSelect = 0;
        int returnSelect = 0;
        int index = 0;
        boolean correctInput = false;
        String[][] workoutDay = new String[3][6];
        String[] options = new String[2];
        
        // initializes workouts in 2D array and options in array
        workoutDay[0][0] = "Bench press: 55%x5x1, 65%x4x1, 75%x4x1, 85%x4x4";
        workoutDay[0][1] = "Cable flys (3x10)";
        workoutDay[0][2] = "Incline smith-machine press (3x10)";
        workoutDay[0][3] = "Side lateral raises (3x10)";
        workoutDay[0][4] = "Tricep press downs (3x10)";
        workoutDay[0][5] = "Side lateral raises (3x10)";
        
        workoutDay[1][0] = "Deadlift: 55%x5x1, 65%x4x1, 75%x4x1, 85%x4x4";
        workoutDay[1][1] = "Wide grip pull down (3x10)";
        workoutDay[1][2] = "Single arm kneeling lat pull down (3x10)";
        workoutDay[1][3] = "Cable rear-delt flys (3x10)";
        workoutDay[1][4] = "Preacher curl (3x10)";
        workoutDay[1][5] = "Hammer curls (3x10)";
        
        workoutDay[2][0] = "Back squat: 55%x5x1, 65%x4x1, 75%x4x1, 85%x4x4";
        workoutDay[2][1] = "Leg press (3x10)";
        workoutDay[2][2] = "Dumbbell single lunges (3x10)";
        workoutDay[2][3] = "Standing calf raise (3x10)";
        workoutDay[2][4] = "Lying leg curls (3x10)";
        workoutDay[2][5] = "Leg extension (3x10)";
        
        options[0] = "weightlifting";
        options[1] = "cardio";
        
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals("cardio")) {
                index = i;
            } // end of if statement
        } // end of for loop
        
        index = getWord(options);
        
        
        selectionSort(options);
        
        // requests type of workout and date
        while (true) {
            System.out.println("Enter the type of workout you would like to perform (" + options[0] + " or " + options[1] + "):");
            exercise = input.nextLine();
            System.out.println();
            
            if (exercise.equalsIgnoreCase("weightlifting") || exercise.equalsIgnoreCase("cardio")) {
                break;
            }
            else {
                System.out.println("Invalid entry. Enter one of the following options.");
                System.out.println();
            } // end of if statement
        } // end of while loop
        
        if (exercise.equalsIgnoreCase("weightlifting")) { // if user selects weightlifting
            while (!correctInput) {
                try {
                    System.out.println("The following options are workout categories that focus on certain muscles. Select one of the following options.");
                    System.out.println("1 - Push (chest and triceps)");
                    System.out.println("2 - Pull (back and biceps)");
                    System.out.println("3 - Legs");
                    weightSelect = input.nextInt();
                    System.out.println();
                    correctInput = true;
                    
                    if (weightSelect < 1 || weightSelect > 3) {
                        System.out.println("Invalid entry. Enter one of the following options.");
                        System.out.println();
                        correctInput = false;
                    } // end of if statement
                }
                catch (Exception e) {
                    input.nextLine();
                    System.out.println("Invalid entry. Enter the corresponding integer.");
                    System.out.println();
                    correctInput = false;
                }
            } // end of while loop
            
            correctInput = false;
            
            if (weightSelect == 1) { // push day routine
                System.out.println("PUSH DAY WORKOUT");
                System.out.println("-----------------------------------------");
                for (int i = 0; i < workoutDay[0].length; i++) {
                    System.out.println(workoutDay[0][i]);
                } // end of for loop
                System.out.println();
                
                
                while (!correctInput) {
                    try {
                        System.out.println("Enter '1' once you're done your workout to go back to main menu:");
                        returnSelect = input.nextInt();
                        correctInput = true;
                        
                        if (returnSelect != 1) {
                            System.out.println("Invalid entry. Enter '1' once workout is completed.");
                            System.out.println();
                            correctInput = false;
                        } // end of if statement
                    }
                    catch (Exception e) {
                        input.nextLine();
                        System.out.println("Invalid entry. Enter '1' once workout is completed.");
                        System.out.println();
                        correctInput = false;
                    }
                } // end of while loop
                
                pushCount++;
            }
            else if (weightSelect == 2) { // pull day routine
                System.out.println("PULL DAY WORKOUT");
                System.out.println("-----------------------------------------");
                for (int i = 0; i < workoutDay[1].length; i++) {
                    System.out.println(workoutDay[1][i]);
                } // end of for loop
                System.out.println();
                
                
                while (!correctInput) {
                    try {
                        System.out.println("Enter '1' once you're done your workout to go back to main menu:");
                        returnSelect = input.nextInt();
                        correctInput = true;
                        
                        if (returnSelect != 1) {
                            System.out.println("Invalid entry. Enter '1' once workout is completed.");
                            System.out.println();
                            correctInput = false;
                        } // end of if statement
                    }
                    catch (Exception e) {
                        input.nextLine();
                        System.out.println("Invalid entry. Enter '1' once workout is completed.");
                        System.out.println();
                        correctInput = false;
                    }
                } // end of while loop
                
                pullCount++;
            }
            else { // leg day routine
                System.out.println("LEG DAY WORKOUT");
                System.out.println("-----------------------------------------");
                for (int i = 0; i < workoutDay[2].length; i++) {
                    System.out.println(workoutDay[2][i]);
                } // end of for loop
                System.out.println();
                
                while (!correctInput) {
                    try {
                        System.out.println("Enter '1' once you're done your workout to go back to main menu:");
                        returnSelect = input.nextInt();
                        correctInput = true;
                        
                        if (returnSelect != 1) {
                            System.out.println("Invalid entry. Enter '1' once workout is completed.");
                            System.out.println();
                            correctInput = false;
                        } // end of if statement
                    }
                    catch (Exception e) {
                        input.nextLine();
                        System.out.println("Invalid entry. Enter '1' once workout is completed.");
                        System.out.println();
                        correctInput = false;
                    }
                } // end of while loop
                
                legCount++;
            } // end of if statement
            
            burn = burn + 480;
        }
        else { // if user selects cardio
            while (!correctInput) {
                try {
                    System.out.println("Select one of the following options");
                    System.out.println("1 - Running");
                    System.out.println("2 - Cycling");
                    System.out.println("3 - Sports Activity");
                    weightSelect = input.nextInt();
                    System.out.println();
                    correctInput = true;
                    
                    if (weightSelect < 1 || weightSelect > 3) {
                        System.out.println("Invalid entry. Enter one of the following options.");
                        System.out.println();
                        correctInput = false;
                    } // end of if statement
                }
                catch (Exception e) {
                    System.out.println("Invalid entry. Enter the corresponding integer.");
                    System.out.println();
                    correctInput = false;
                }
            } // end of while loop
            
            correctInput = false;
            
            if (weightSelect == 1) {
                System.out.println("RUNNING WORKOUT");
                System.out.println("-----------------------------------------");
                System.out.println("Warm up: Moderate pace (5 min)");
                System.out.println("Jogging speed (20 min)");
                System.out.println("Cool down: Relaxed pace (5 min)");
                System.out.println();
                
                while (!correctInput) {
                    try {
                        System.out.println("Enter '1' once you're done your workout to go back to main menu:");
                        returnSelect = input.nextInt();
                        correctInput = true;
                        
                        if (returnSelect != 1) {
                            System.out.println("Invalid entry. Enter '1' once workout is completed.");
                            System.out.println();
                            correctInput = false;
                        } // end of if statement
                    }
                    catch (Exception e) {
                        input.nextLine();
                        System.out.println("Invalid entry. Enter '1' once workout is completed.");
                        System.out.println();
                        correctInput = false;
                    }
                } // end of while loop
                
                burn = burn + 410;
                runCount++;
            }
            else if (weightSelect == 2) {
                System.out.println("CYCLING WORKOUT");
                System.out.println("-----------------------------------------");
                System.out.println("Warm up: Moderate pace (5 min)");
                System.out.println("Fast speed (20 min)");
                System.out.println("Cool down: Relaxed pace (5 min)");
                System.out.println();
                
                while (!correctInput) {
                    try {
                        System.out.println("Enter '1' once you're done your workout to go back to main menu:");
                        returnSelect = input.nextInt();
                        correctInput = true;
                        
                        if (returnSelect != 1) {
                            System.out.println("Invalid entry. Enter '1' once workout is completed.");
                            System.out.println();
                            correctInput = false;
                        } // end of if statement
                    }
                    catch (Exception e) {
                        input.nextLine();
                        System.out.println("Invalid entry. Enter '1' once workout is completed.");
                        System.out.println();
                        correctInput = false;
                    }
                } // end of while loop
                
                burn = burn + 400;
                cycleCount++;
            }
            else {
                System.out.println("SPORTS ACTIVITY");
                System.out.println("-----------------------------------------");
                System.out.println("Complete 2 hours of moderate to vigorous physical sports activity");
                System.out.println();
                
                while (!correctInput) {
                    try {
                        System.out.println("Enter '1' once you're done your workout to go back to main menu:");
                        returnSelect = input.nextInt();
                        correctInput = true;
                        
                        if (returnSelect != 1) {
                            System.out.println("Invalid entry. Enter '1' once workout is completed.");
                            System.out.println();
                            correctInput = false;
                        } // end of if statement
                    }
                    catch (Exception e) {
                        input.nextLine();
                        System.out.println("Invalid entry. Enter '1' once workout is completed.");
                        System.out.println();
                        correctInput = false;
                    }
                    
                    burn = burn + 1100;
                    sportsCount++;
                } // end of while loop
            } // end of if statement
        } // end of if statement
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        menu(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        
        
    } // end of workout method
    
    
    
    // option to start meal prep
    public static void mealPrep(Trainee user, int burn, int pushCount, int pullCount, int legCount, int runCount, int cycleCount, int sportsCount, String firstTime) throws IOException {
        
        
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        
        ArrayList<String> meal = new ArrayList<String>();
        String temp = "";
        String answer = "";
        int ranNum = generator.nextInt(2)+1;
        Scanner reader;
        boolean correctInput = false;
        int decision = 0;
        
        // provides breakfast, lunch or dinner based upon time of day
        while (true) {
            System.out.println("What time of the day is it (morning, afternoon, evening)?");
            answer = input.nextLine();
            System.out.println();
            
            if (answer.equalsIgnoreCase("morning") || answer.equalsIgnoreCase("afternoon") || answer.equalsIgnoreCase("evening")) {
                break;
            }
            else {
                System.out.println("Invalid entry. Enter one of the following options.");
                System.out.println();
            } // end of if statement
        } // end of while loop
        
        // randomly selects from a group of 2 meals for each time of day
        if (answer.equalsIgnoreCase("morning")) {
            reader = new Scanner(new File("breakfast"+ranNum+".txt"));
        }
        else if (answer.equalsIgnoreCase("afternoon")) {
            reader = new Scanner(new File("lunch"+ranNum+".txt"));
        }
        else {
            reader = new Scanner(new File("dinner"+ranNum+".txt"));
        } // end of if statement
        
        while (reader.hasNext()) {
            temp = reader.nextLine();
            meal.add(temp);
        } // end of while loop
        
        for (int i = 0; i < meal.size(); i++) {
            System.out.println(meal.get(i));
        } // end of for loop
        System.out.println();
        
        while (!correctInput) {
            try {
                System.out.println("Enter '1' to return to menu:");
                decision = input.nextInt();
                System.out.println();
                correctInput = true;
                
                if (decision != 1) {
                    System.out.println("Invalid entry. Enter '1'.");
                    System.out.println();
                    correctInput = false;
                } // end of if statement
            }
            catch (Exception e) {
                input.nextLine();
                System.out.println("Invalid entry. Enter '1'.");
                System.out.println();
                correctInput = false;
            }
        } // end of while loop
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        menu(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        
        
    } // end of mealPrep method
    
    
    
    // shows the day's workout summary
    public static void summary(Trainee user, int burn, int pushCount, int pullCount, int legCount, int runCount, int cycleCount, int sportsCount, String firstTime) throws IOException {
        
        
        Scanner input = new Scanner(System.in);
        
        int decision = 0;
        boolean correctInput = false;
        
        System.out.println("Date: " + user.getDate());
        System.out.println("--------------------------------------------------");
        System.out.println("Total Cal. Burned: " + burn);
        System.out.println();
        System.out.println("Activities:");
        
        if (pushCount > 0) { // lists push day workouts
            System.out.println("- Push day (chest and triceps): approx. 2 hours");
            System.out.println("Cal. Burned: 480");
            System.out.println();
        } // end of if statement
        
        if (pullCount > 0) { // lists pull day workouts
            System.out.println("- Pull day (back and biceps): approx. 2 hours");
            System.out.println("Cal. Burned: 480");
            System.out.println();
        } // end of if statement
        
        if (legCount > 0) { // lists leg day workouts
            System.out.println("- Leg Day: approx. 2 hours");
            System.out.println("Cal. Burned: 480");
            System.out.println();
        } // end of if statement
        
        if (runCount > 0) { // lists running activities
            System.out.println("- Running: approx. 30 min");
            System.out.println("Cal. Burned: 410");
            System.out.println();
        } // end of if statement
        
        if (cycleCount > 0) { // lists cycling activities
            System.out.println("- Cycling: approx. 30 min");
            System.out.println("Cal. Burned: 400");
            System.out.println();
        } // end of if statement
        
        if (sportsCount > 0) { // lists sports activities
            System.out.println("- Sports: approx. 2 hours");
            System.out.println("Cal. Burned: 1100");
            System.out.println();
        } // end of if statement
        
        if (pushCount == 0 && pullCount == 0 && legCount == 0 && runCount == 0 && cycleCount == 0 && sportsCount == 0){ // if no workouts have been completed
            System.out.println("No workouts completed.");
            System.out.println();
        } // end of if statement
        
        while (!correctInput) {
            try {
                System.out.println("Enter '1' to return to menu:");
                decision = input.nextInt();
                System.out.println();
                correctInput = true;
                
                if (decision != 1) {
                    System.out.println("Invalid entry. Enter '1'.");
                    System.out.println();
                    correctInput = false;
                } // end of if statement
            }
            catch (Exception e) {
                input.nextLine();
                System.out.println("Invalid entry. Enter '1'.");
                System.out.println();
                correctInput = false;
            }
        } // end of while loop
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        menu(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        
        
    } // end of summary method
    
    
    
    // updates entire workout log
    public static void saveLog(Trainee user, int burn, int pushCount, int pullCount, int legCount, int runCount, int cycleCount, int sportsCount, String firstTime) throws IOException {
        
        
        ArrayList<String> list = new ArrayList<String>();
        savePrevLog(list, user);
        
        PrintWriter writer = new PrintWriter(new File(user.getName()+"_workout_log.txt"));
        
        writer.println(user.getName()+"'S WORKOUT LOG");
        writer.println("==================================================");
        
        for (int i = 0; i < list.size(); i++) {
            writer.println(list.get(i));
        } // end of for loop
        writer.println();
        writer.println();
        
        writer.println("Date: " + user.getDate());
        writer.println("--------------------------------------------------");
        writer.println("Total Cal. Burned: " + burn);
        writer.println();
        writer.println("Activities:");
        
        if (pushCount > 0) { // lists push day workouts
            writer.println("- Push day (chest and triceps): approx. 2 hours");
            writer.println("Cal. Burned: 480");
            writer.println();
        } // end of if statement
        
        if (pullCount > 0) { // lists pull day workouts
            writer.println("- Pull day (back and biceps): approx. 2 hours");
            writer.println("Cal. Burned: 480");
            writer.println();
        } // end of if statement
        
        if (legCount > 0) { // lists leg day workouts
            writer.println("- Leg Day: approx. 2 hours");
            writer.println("Cal. Burned: 480");
            writer.println();
        } // end of if statement
        
        if (runCount > 0) { // lists running activities
            writer.println("- Running: approx. 30 min");
            writer.println("Cal. Burned: 410");
            writer.println();
        } // end of if statement
        
        if (cycleCount > 0) { // lists cycling activities
            writer.println("- Cycling: approx. 30 min");
            writer.println("Cal. Burned: 400");
            writer.println();
        } // end of if statement
        
        if (sportsCount > 0) { // lists sports activities
            writer.println("- Sports: approx. 2 hours");
            writer.println("Cal. Burned: 1100");
            writer.println();
        } // end of if statement
        
        if (pushCount == 0 && pullCount == 0 && legCount == 0 && runCount == 0 && cycleCount == 0 && sportsCount == 0){ // if no workouts have been completed
            writer.println("No workouts completed.");
            writer.println();
        } // end of if statement
        
        writer.close();
        
        
    } // end of saveLog method
    
    
    
    // saves previous workout log
    public static void savePrevLog(ArrayList<String> list, Trainee user) throws IOException {
        
        
        Scanner reader = new Scanner(new File(user.getName()+"_workout_log.txt"));
        
        String temp = "";
        
        while (reader.hasNext()) {
            temp = reader.nextLine();
            list.add(temp);
        } // end of while loop
        
        list.remove(0);
        list.remove(0);
        
        
    } // end of saveLog method
    
    
    
    // if user wants to check current workout log
    public static void checkLog(Trainee user, int burn, int pushCount, int pullCount, int legCount, int runCount, int cycleCount, int sportsCount, String firstTime) throws IOException {
        
        
        Scanner reader = new Scanner(new File(user.getName()+"_workout_log.txt"));
        Scanner input = new Scanner(System.in);
        
        String temp = "";
        int decision = 0;
        boolean correctInput = false;
        
        if (firstTime.equalsIgnoreCase("no")) {
            while (reader.hasNext()) {
                temp = reader.nextLine();
                System.out.println(temp);
            } // end of while loop
            System.out.println();
            System.out.println();
        }
        else {
            System.out.println("Your workout log is empty! Keep working out everyday to update your workout log!");
            System.out.println();
        } // end of if statement
        
        while (!correctInput) {
            try {
                System.out.println("Enter '1' to return to menu:");
                decision = input.nextInt();
                System.out.println();
                correctInput = true;
                
                if (decision != 1) {
                    System.out.println("Invalid entry. Enter '1'.");
                    System.out.println();
                    correctInput = false;
                } // end of if statement
            }
            catch (Exception e) {
                input.nextLine();
                System.out.println("Invalid entry. Enter '1'.");
                System.out.println();
                correctInput = false;
            }
        } // end of while loop
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        menu(user, burn, pushCount, pullCount, legCount, runCount, cycleCount, sportsCount, firstTime);
        
        
    } // end of checkLog method
    
    
    
    // method which applied the selection sort algorithm
    public static void selectionSort(String[] a) {
        
        
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) {
                swap(a, i, minIndex);
            } // end of if statement
        } // end of for loop
        
        
    } // end of selectionSort method
    
    
    
    // method which finds the minimum value in an array
    public static int findMinimum(String[] a, int first) {
        
        
        int minIndex = first;
        
        for (int i = first + 1; i < a.length; i++) {
            if (a[i].compareTo(a[minIndex]) < 0) {
                minIndex = i;
            } // end of if statement
        } // end of for loop
        return minIndex;
        
        
    } // end of findMinimum method
    
    
    
    // method which swaps 2 elements in an array
    public static void swap(String[] a, int x, int y) {
        
        
        String temp = a[x];
        
        a[x] = a[y];
        a[y] = temp;
        
        
    } // end of swap method
    
    
    
    // searches array
    public static int getWord(String[] list) {
        
        
        String word = "cardio";
        int left = 0;
        int right = list.length - 1;
        
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = list[midpoint].compareTo(word);
            if (result == 0) {
                return midpoint;
            }
            else if (result < 0) {
                left = midpoint + 1;
            }
            else {
                right = midpoint - 1;
            } // end of if statement
        } // end of while loop
        
        return -1;
        
        
    } // end of getWord method
    
    
    
} // end of Final Project
