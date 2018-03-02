import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

	public static void main(String[] args) {
		Person.attr = "Spades Players";
		Person.groupName = "Tomato, Tomato!";

		Person andrew = new Person("Andrew", 22, "Male");
		Person branden = new Person("Branden", 33, "Male");

		OutofStaters amber = new OutofStaters("Amber", 27, "Female", "Baltimore", "Maryland");
		OutofStaters christian = new OutofStaters("Christian", 26, "Male", "Clemson", "North Carolina ");

		OutofStaters osArr[] = {amber, christian};
		Person psArr[] = {branden, andrew};

		System.out.println("Group Name: " + Person.groupName);
		System.out.println("Team Attribute: " + Person.attr);


		for (int i = 0; i < 2; i++) {
			System.out.println("____________________________________ \n");
			System.out.println(osArr[i].toString());
			System.out.println(osArr[i].printImFrom());
		}

			for (int j = 0; j < 2; j++) {
				System.out.println("____________________________________ \n");
				System.out.println(psArr[j].toString());


			}


		}
	}

