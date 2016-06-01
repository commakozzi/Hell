import java.util.Scanner;

class UserInteraction {
    Scanner scanner = new Scanner(System.in);

    public String nextInput() {
        String userIn = scanner.nextLine();
        return userIn;
    }

    public void getName() {
        String name;
        System.out.println("Hello and welcome! May I have your name please?");
        name = scanner.nextLine();
        System.out.println("Thank you " + name + " I hope you have fun with this game!");
    }

    public int getAge() {
        int age;
        age = scanner.nextInt();
        return age;
    }

    public void getDirection() {
        String direction;
        System.out.println("In which direction would you like to go?");
        direction = scanner.nextLine();
        System.out.println("Ok, you walk 5 paces to the " + direction + ".");
    }

    int calcYearsToRetire(int currentAge) {
        int retireAge = 65 - currentAge;

        return retireAge;
    }

}
