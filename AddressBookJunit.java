import AddressServices.AddressService;

import java.util.Scanner;

public class AddressBookJunit {




        private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String emailId;

	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setAddress(String address)
	{
		this.address=address;
	}

	public String getAddress()
	{
		return address;
	}

	public void setCity(String city)
	{
		this.city=city;
	}

	public String getCity()
	{
		return city;
	}

	public void setState(String state)
	{
		this.state=state;
	}

	public String getState()
	{
		return state;
	}

	public void setZip(String zip)
	{
		this.zip=zip;
	}

	public String getZip()
	{
		return zip;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setEmailId(String emailId)
	{
		this.emailId=emailId;
	}

	public String getEmail()
	{
		return emailId;
	}

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
            switch(userInput)
            {
                case 1:
                    addressService.add();
                    break;
                case 2:
                    addressService.edit();
                    break;
                case 3:
                    addressService.delete();
                    break;
                case 4:
                    addressService.display();
                    break;
                default:System.out.println("Invalid option");
            }

            System.out.println("press 1 to start \n press 0 to disconnect");
            userChoice=scanner.nextInt();
        }while(userChoice==1);

    }


	}

}
