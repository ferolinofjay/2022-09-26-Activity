import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> human = new ArrayList<String>();

        Person<String> personFirst = new Person<String>();
        personFirst.setMyName("F Jay Ferolino");
        personFirst.setMyDetails("Hardworking and Handsome");
        personFirst.setMyVehicle("I love driving BigBikes and SportCars.");
        human.add("\"" + personFirst.getMyName() + "\"" + " I am " + personFirst.getMyDetails() + " and "
                + personFirst.getMyVehicle());

        Person<String> personSecond = new Person<String>();
        personSecond.setMyName("Seth Obenita");
        personSecond.setMyDetails("Beautiful and Gorgeuos");
        personSecond.setMyVehicle("I love driving fjay.");
        human.add("\"" + personSecond.getMyName() + "\"" + " I am " + personSecond.getMyDetails() + " and "
                + personSecond.getMyVehicle());

        Person<String> personThird = new Person<String>();
        personThird.setMyName("Jomel Calungsod");
        personThird.setMyDetails("Mature and Caring");
        personThird.setMyVehicle("I love driving Cars.");
        human.add("\"" + personThird.getMyName() + "\"" + " I am " + personThird.getMyDetails() + " and "
                + personThird.getMyVehicle());

        Person<String> personFourth = new Person<String>();
        personFourth.setMyName("Jordan Jorolan");
        personFourth.setMyDetails("Handsome and Humble");
        personFourth.setMyVehicle("I love driving motorcycle.");
        human.add("\"" + personFourth.getMyName() + "\"" + " I am " + personFourth.getMyDetails() + " and "
                + personFourth.getMyVehicle());

        Person<String> personFifth = new Person<String>();
        personFifth.setMyName("Threazia Mae Lebosada");
        personFifth.setMyDetails("Spoiled Brat");
        personFifth.setMyVehicle("I love riding feriswheel.");
        human.add("\"" + personFifth.getMyName() + "\"" + " I am " + personFifth.getMyDetails() + " and "
                + personFifth.getMyVehicle());

        System.out.print("     [0,1,2,3,4]");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();

        try {
            if (input < 0) {
                sc.close();
                throw new PersonException("Your input is negative. Please input positive index.");
            }
            if (input > 5) {
                sc.close();
                throw new PersonException("Your input exceeds the size of the arraarray.");
            }

            System.out.println("Index number: " + input);
            System.out.println(human.get(input));

        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}