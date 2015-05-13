package TypeTokenExam;

public class TestTypeToken {
	
	public static void main (String [] args){
		
		Message <Integer> intMsg = new Message <> (100) ;
		System.out.println(intMsg.getMessage());
		
		Message <String> strMsg = new Message <> ("some messages") ;
		System.out.println(strMsg.getMessage());
		
	}

}
