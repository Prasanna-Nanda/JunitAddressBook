

import AddressService.AddressService;

import java.util.Scanner;

public class JunitAddressBook {

    public static void main(String[] args) {

        int userInput;
        int userChoice;
        System.out.println("Welcome to address book program");
        Scanner scanner = new Scanner(System.in);
        AddressService addressService=new AddressService();

        do {
            System.out.println("1.Add record");
            System.out.println("2.Edit record");
            System.out.println("3.Delete record");
            System.out.println("4.Display record");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1 -> addressService.add();
                case 2 -> addressService.edit();
                case 3 -> addressService.delete();
                case 4 -> addressService.display();
                default -> System.out.println("Invalid option");
            }

            System.out.println("press 1 to start \n press 0 to disconnect");
            userChoice=scanner.nextInt();
        }while(userChoice==1);

    }
}

