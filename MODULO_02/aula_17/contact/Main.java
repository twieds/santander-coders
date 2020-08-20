package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	static Scanner input = new Scanner(System.in);
	static List<Contact> contactList = new ArrayList<>();

	public static void main(String[] args) {

		int op = -1;
		
		do {
			System.out.printf("**** Menu Principal *****\n");
			System.out.printf("[ 1 ] Incluir Contato\n");
			System.out.printf("[ 2 ] Excluir Contato\n");
			System.out.printf("[ 3 ] Listar Contatos\n");
			System.out.printf("[ 4 ] Pesquisar Contato\n");
			System.out.printf("[ 0 ] Encerrar o Programa\n");
			System.out.printf("\nOpção Desejada: ");
			op = input.nextInt();
			
			switch (op) {
				case 1:
					addContact();
					break;
				case 2:
					deleteContact();
					break;
				case 3:
					listContacts();
					break;
				case 4:
					searchForContact();
					break;	
				default:
					break;
			}
			
		} while (op != 0);
	}
	
	public static void addContact() {
		int id, age, houseNumber;
		String phone, name, street, state, district, city;
		
		System.out.println("ID: ");
		id = input.nextInt();
		input.nextLine();
		
		System.out.println("Name: ");
		name = input.nextLine();
				
		System.out.println("Age: ");
		age = input.nextInt();
		input.nextLine();
		
		System.out.println("Phone: ");
		phone = input.nextLine();
		
		System.out.println("Street: ");
		street = input.nextLine();
				
		System.out.println("House Number: ");
		houseNumber = input.nextInt();
		input.nextLine();
		
		System.out.println("District: ");
		district = input.nextLine();
		
		System.out.println("State: ");
		state = input.nextLine();
		
		System.out.println("City: ");
		city = input.nextLine();
		
		Address address = new Address(street, houseNumber, district, city, state);
		Contact contact = new Contact (id, name, age, phone, address);
		contactList.add (contact);
	}
	
	public static void deleteContact() {		
		System.out.println("Insert the ID of the contact you want to delete: ");
		Integer id = input.nextInt();
		
		Contact searchForContact = contactList.stream()
				  .filter(contact -> id.equals(contact.getId()))
				  .findAny()
				  .orElse(null);
		
		contactList.remove(contactList.indexOf(searchForContact));
	}
	
	public static void listContacts() {
		System.out.println("\n\n-------- CONTACTS --------");
		
		if (contactList.isEmpty()) {
			System.out.println("There are no contacts in your phone book.");
		} else {
			for (Contact contact : contactList) {
				System.out.println(contact);
			}				
		}
		
		System.out.println("\n--------------------------------\n\n");
	}

	public static void searchForContact() {
		System.out.println("Insert the ID of the contact you want to search for: ");
		Integer id = input.nextInt();	
		
		Contact foundContact = contactList.stream()
				  .filter(contact -> id.equals(contact.getId()))
				  .findAny()
				  .orElse(null);
		
		
		if ( foundContact != null ) {
			System.out.println(foundContact);
		} else {
			System.out.println("Sorry, we couldn't find any contacts with this ID\n");
		}
		
	}


}
