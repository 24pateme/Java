public class Song
{
	public static void main(String[] args) {
	
	    verseOne();
	    System.out.println ();
	    verseTwo();
	    System.out.println ();
	    verseThree();
	    System.out.println ();
	    verseFour();
	    System.out.println ();
	    verseFive();
	    System.out.println ();
	    verseSix();
	
	}
	
	public static void bottomTwoRepeat(){
	    
	    System.out.println ("Hen goes chimmy-chuck, chimmy-chuck,");
	    System.out.println ("Cat goes fiddle-i-fee.");
	}
	
	public static void middleTwoRepeat(){
	    System.out.println ("Goose goes hissy, hissy,");
	    System.out.println ("Duck goes quack, quack,");
	}
	
	public static void verseOne(){
	    
	    System.out.println ("Bought me a cat and the cat pleased me,");
	    System.out.println ("I fed my cat under yonder tree.");
	    System.out.println ("Cat goes fiddle-i-fee.");
	}
	
	public static void verseTwo(){
	    
	    System.out.println ("Bought me a hen and the hen pleased me,");
	    System.out.println ("I fed my hen under yonder tree.");
	    bottomTwoRepeat();
	}
	
	public static void verseThree(){
	    
	    System.out.println ("Bought me a duck and the duck pleased me,");
	    System.out.println ("I fed my duck under yonder tree.");
	    System.out.println ("Duck goes quack, quack,");
	    bottomTwoRepeat();
	}
	
	public static void verseFour(){
	    
	    System.out.println ("Bought me a goose and the goose pleased me,");
	    System.out.println ("I fed my goose under yonder tree.");
	    middleTwoRepeat();
	    bottomTwoRepeat();
	}
	
	public static void verseFive(){
	    
	    System.out.println ("Bought me a sheep and the sheep pleased me,");
	    System.out.println ("I fed my sheep under yonder tree.");
	    System.out.println ("Sheep goes baa, baa,");
	    middleTwoRepeat();
	    bottomTwoRepeat();
	}
	
	public static void verseSix(){
	    
	    System.out.println ("Bought me a pig and the pig pleased me,");
	    System.out.println ("I fed my pig under yonder tree.");
	    System.out.println ("Pig goes oink, oink,");
	    System.out.println ("Sheep goes baa, baa,");
	    middleTwoRepeat();
	    bottomTwoRepeat();
	}
}
