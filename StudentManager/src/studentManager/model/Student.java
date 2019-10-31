package studentManager.model;

public class Student {
	private int id;
	private String name;
	private double kor;
	private double eng;
	private double math;
	private double social;
	private double science;
		
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getKor() {
		return kor;
	}
	
	public void setKor(double kor) {
		this.kor = kor;
	}
	
	public double getEng() {
		return eng;
	}
	
	public void setEng(double eng) {
		this.eng = eng;
	}
	
	public double getMath() {
		return math;
	}
	
	public void setMath(double math) {
		this.math = math;
	}
	
	public double getSocial() {
		return social;
	}
	
	public void setSocial(double social) {
		this.social = social;
	}
	
	
	public double getScience() {
		return science;
	}
	
	public void setScience(double science) {
		this.science = science;
	}
	
	/**
	 * Constructor
	 */
	public Student() {
		//
	}
	
	public Student(
			int id
			, String name
			, double kor
			, double eng
			, double math
			, double social
			, double science
	) {
		this.id 		= id;
		this.name 		= name;
		this.kor 		= kor;
		this.eng 		= eng;
		this.math 		= math;
		this.social 	= social;
		this.science 	= science;
	}
	
	//-----------------------------------------------------------------------------
	//
	//  PUBLIC METHODS
	//
	//-----------------------------------------------------------------------------
	/**
	 * ÃÑÁ¡ °¡Á®¿À±â
	 * @return double ÃÑÁ¡
	 */
	public double getTotalScore() {
		double result = 0;
		
		result += this.kor;
		result += this.eng;
		result += this.math;
		result += this.social;
		result += this.science;
		
		return result;
	}
	
	/**
	 * Æò±ÕÁ¡¼ö °¡Á®¿À±â
	 * @return double Æò±ÕÁ¡¼ö
	 */
	public double getAverage() {
		double total = this.getTotalScore(); // ÃÑÁ¡°¡Á®¿À±â
		
		return total / 5; // Æò±Õ³»±â
	}
	
	//-----------------------------------------------------------------------------
	//
	//  OVERRIDEN METHODS
	//
	//-----------------------------------------------------------------------------	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("id : " 		+ this.id 		+ ", ");
		sb.append("name : " 	+ this.name 	+ ", ");
		sb.append("kor : " 		+ this.kor 		+ ", ");
		sb.append("eng : " 		+ this.eng 		+ ", ");
		sb.append("math : " 	+ this.math 	+ ", ");
		sb.append("social : " 	+ this.social 	+ ", ");
		sb.append("science : " 	+ this.science);
		sb.append("}");
		
		return sb.toString();
	}
}














