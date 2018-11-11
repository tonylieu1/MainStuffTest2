package tests;

public class StudendList extends roster{
	String Name;
	int FirstNum;
	int SecondNum;
	int ThirdNum;
	double CalAvg;

	public StudendList(String Name,int FirstNum, int SecondNum, int ThirdNum) {
		this.Name = Name;
		this.FirstNum =FirstNum ;
		this.SecondNum = SecondNum;
		this.ThirdNum = ThirdNum;
		
}

	public void CalAvg() {
		CalAvg = (FirstNum + SecondNum + ThirdNum)/3;
	
	}
}
