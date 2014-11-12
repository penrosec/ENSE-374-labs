
public class PetApp {
public static void(String[] args)
{
	PetOwner pt= new PetOwner();
	addDog();
	Dog dog = pt.getDog(pt.getDogIndex());
	System.out.println("The dog is named" +dog.getName());
			
}
}
