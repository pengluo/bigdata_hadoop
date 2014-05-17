package pkg4;

public class Question implements Complexity{
	private String question, answer;
	private int complexityLevel;
	
	public Question(String question, String answer){
		this.question = question;
		this.answer = answer;
		this.complexityLevel = 1;
	}
	
	@Override
	public int getComplexity() {
		return this.complexityLevel;
	}
	
	@Override
	public void setComplexity(int complexity) {
		this.complexityLevel = 1;
	}
	
	public String getQuestion(){
		return this.question;
	}

}
