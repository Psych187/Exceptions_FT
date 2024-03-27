import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user data format 'surname name patronymic dd.mm.yyyy pnoneNum gender':");
        String userData = scanner.nextLine();

        UserDataParser.parseAndSaveUserData(userData);

        scanner.close();
    }
}