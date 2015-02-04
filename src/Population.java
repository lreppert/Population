/**
 * Created by Mike on 1/25/2015.// I go by mike "Larry Reppert"
 */

import java.util.Scanner;

public class Population {
    public static double a = 0.1; //A prey birth exceeds natural death.
    public static double b = 0.01; //B the rate of predation.
    public static double c = 0.01; //C predator deaths exceed births without food.
    public static double d = 0.00002; //D predator increase in the presence of food.
    public static int timePeriod = 1; // This will be the time variable.
    public static int one = 1;
    public static int Zero = 0;
    public static double predator = 20.0;
    public static double prey = 1000.0;
    public static double prey1, predator1;
    public static void main(String[] Args) {

        //receiving inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of periods : ");
        timePeriod = input.nextInt();
        System.out.println("Enter the Beginning Prey Population : ");
        prey = input.nextDouble();
        System.out.println("Enter the Beginning Predator Population : ");
        predator = input.nextDouble();

        PopPeriod();
    }
        public static void PopPeriod()
        {

            System.out.printf("Period %10d : " + "Prey Population %10.2f " + "Predator Population %10.2f%n",Zero, prey , predator);
            // I'm printing out the begining values as period 0
            preyPeriod();

        }

                public static void preyPeriod(){
                     int counter = timePeriod + one;//set counter to my time period
                     int loop_Counter = one; //Adding one to counter for the period to be readable for user.
                boolean calculating = true; // using a boolean to escape the loop
                    do
                {

                    prey1 = prey * (one + a - b * predator);//Initial value is evaluated
                    predator1 = predator * (one - c + d * prey);//Initial value is evaluated
                    prey = prey1;//Passing the variable so I can loop through the iterations.
                    predator = predator1;//Passing the variable so I can loop through the iterations.
                    System.out.printf("Period %10d : " + "Prey Population %10.2f " + "Predator Population %10.2f%n",loop_Counter, prey1 , predator1);
                    //Setting some print formating up so the data is neat and easy to read/understand
                    loop_Counter = loop_Counter + 1;//loop_Counter is adding up
                    if (loop_Counter == counter)// check to see if values are same
                    {
                        calculating = false; // This keeps it in the loop.
                    }//else ends looping();
                }while(calculating);//This is the escape when calculating equals true;

                }
                }


