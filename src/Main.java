import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
    	Person.attr = "Spades Players";
    	Person.groupName = "Tomato, Tomato!";

		 Person amber = new Person ("Amber", 27, "Female");
		 Person andrew = new Person ("Andrew", 22, "Male");
		 Person christian = new Person ("Christian",  26, "Male");
		 Person branden = new Person("Branden", 33, "Male");

		/* amber.setName("Amber");
		 amber.setGender("Female");
		 amber.setAge(27);

		 christian.setName("Christian");
		 christian.setGender("Male");
		 christian.setAge(26);

		 branden.setName("Branden");
		 branden.setGender("Male");
		 branden.setAge(33);

		 andrew.setName("Andrew");
		 andrew.setGender("Male");
		 andrew.setAge(22);
		*/

	    String nameArr[] =  {amber.getName(), christian.getName(), branden.getName(), andrew.getName()};
		String genderArr[] = {amber.getGender(), christian.getGender(), branden.getGender(), andrew.getGender()};
		int ageArr[] = {amber.getAge(), christian.getAge(), branden.getAge(), andrew.getAge()};

		System.out.println("Group Name: " + Person.groupName);
		System.out.println( "Team Attribute: " + Person.attr );


		for (int i=0; i<4; i++){
			System.out.println("____________________________________ \n");
			System.out.println("Name: " + nameArr[i]);
			System.out.println("Gender: " + genderArr[i]);
			System.out.println("Age: " + ageArr[i]);


		}





	}
}
