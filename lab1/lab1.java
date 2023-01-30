import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();

        System.out.print("Enter employee gender (m/f): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter employee state: ");
        sc.nextLine();
        String state = sc.nextLine();

        System.out.print("Enter employee company name: ");
        String company = sc.nextLine();

        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (gender == 'm') {
            System.out.println("Gender: MALE");
        } else if (gender == 'f') {
            System.out.println("Gender: FEMALE");
        }

        if (state.equalsIgnoreCase("Andhra Pradesh") ||
            state.equalsIgnoreCase("Karnataka") ||
            state.equalsIgnoreCase("Kerala") ||
            state.equalsIgnoreCase("Tamil Nadu")) {

            System.out.println("The Employee is from the southern states of India");

            switch (state) {
                case "Andhra Pradesh":
                    System.out.println("Preferable work location is in Andhra Pradesh");
                    break;
                case "Karnataka":
                    System.out.println("Preferable work location is in Karnataka");
                    break;
                case "Kerala":
                    System.out.println("Preferable work location is in Kerala");
                    break;
                case "Tamil Nadu":
                    System.out.println("Preferable work location is in Tamil Nadu");
                    break;
            }
        }

        if (company.equalsIgnoreCase("Facebook") ||
            company.equalsIgnoreCase("Google") ||
            company.equalsIgnoreCase("Microsoft") ||
            company.equalsIgnoreCase("Samsung") ||
            company.equalsIgnoreCase("IBM") ||
            company.equalsIgnoreCase("Apple")) {
            System.out.println("The employee is working in Top MNC Companies");
        }
    }
} 
