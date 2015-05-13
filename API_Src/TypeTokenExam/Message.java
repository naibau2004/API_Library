package TypeTokenExam;

public class Message<T> {

	private T message ;
	
	public Message(T msg){
		this.message = msg ;
	}
	
	public T getMessage(){
		return message ;
	}
}
