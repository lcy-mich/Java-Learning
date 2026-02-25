import java.util.ArrayList;
import java.util.Scanner;

class NoEntryError extends Exception {
    public NoEntryError() {
        super();
    }
}

class AddressBookEntry {
    private String name, phone, email;

    public AddressBookEntry(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }
}

class AddressBook {
    private ArrayList<AddressBookEntry> entries;

    public AddressBook() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(AddressBookEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(AddressBookEntry entry) {
        this.entries.remove(entry);
    }

    public AddressBookEntry searchEntryByName(String name) throws NoEntryError{
        AddressBookEntry foundEntry = null;
        for (AddressBookEntry entry : this.entries) {
            if (entry.getName().equals(name)) {
                foundEntry = entry;
                break;
            }
        }
        if (foundEntry == null) {
            throw new NoEntryError();
        }
        return foundEntry;
    }
}

record rAddressBookEntry(String name, String phone, String email){}

class rAddressBook {
    private ArrayList<rAddressBookEntry> entries;

    public rAddressBook() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(rAddressBookEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(rAddressBookEntry entry) {
        this.entries.remove(entry);
    }

    public rAddressBookEntry searchEntryByName(String name) throws NoEntryError{
        rAddressBookEntry foundEntry = null;
        for (rAddressBookEntry entry : this.entries) {
            if (entry.name().equals(name)) {
                foundEntry = entry;
                break;
            }
        }
        if (foundEntry == null) {
            throw new NoEntryError();
        }
        return foundEntry;
    }
}

class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static AddressBookEntry getAddress() {
        String name, phone, email;
        System.out.println("Type name: ");
        name = scanner.nextLine();
        System.out.println("Type phone: ");
        phone = scanner.nextLine();
        System.out.println("Type email: ");
        email = scanner.nextLine();
        
        return new AddressBookEntry(name, phone, email);
    }
    public static int getChoice(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}

public class q3_1 {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        while (true) {
            switch (UserInput.getChoice("1 Quit\n2 Add Address\n3 Remove Address\n")) {
                case 1:
                    System.exit(0);
                case 2:
                    addressBook.addEntry(UserInput.getAddress());
                    break;
                case 3:
                    addressBook.removeEntry(UserInput.getAddress());
                    break;
                default:
                    continue;
            }
        }
    }
}
