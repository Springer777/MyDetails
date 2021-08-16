import java.util.Scanner;

public class MyDetails
    {
        public static void main (String arg[])
        {
            //Variables
            final String name, hobby;
            int bornyear, age, currentyear=2020;
            boolean older_21 = true;
            double sum=0, prereq_marks, averagescore;
            Scanner s = new Scanner (System.in);

            //Fetching name, hobby, and the year of birth
            System.out.println("What is your name?");
            name = s.nextLine();

            System.out.println("Type one word for your hobby!");
            hobby = s.next();

            System.out.println("Which year were you born?");
            bornyear = s.nextInt();

            //fetching course marks
            for (int i=1; i<=3; i++)
            {
                do
                {
                    System.out.println("Enter mark for course " + i + " - Marks has to be between 50 and 100");
                    prereq_marks = s.nextDouble();
                } while (prereq_marks < 50 || prereq_marks>100);

                sum = sum + prereq_marks;
            }

            //Calculate averaage
            averagescore = sum/3;


            //calculate the age and check if you are older than 18
            age = currentyear - bornyear;
            if (age < 21)
                older_21 = false;

            //Output
            System.out.println("My Details");
            System.out.println("----------------");
            System.out.print("Name: " + name);
            System.out.print(" Hobby: " + hobby);
            System.out.println();
            System.out.println("Year of birth: " + bornyear);
            System.out.printf("Average Marks: %.1f",averagescore);
            System.out.println();

            if (older_21 == true)
                System.out.println("You have been enrolled in the course!");
            else
                System.out.println("You are younger than 21 - Sorry you have not been enrolled in this course.");

        }
    }

