package tests;

public class StudendList extends roster{
	String Name;
	int FirstNum;
	int SecondNum;
	int ThirdNum;
	double CalAvg;

	public StudendList(String Name,int FirstNum, int SecondNum, int ThirdNum) {
		Name = this.Name;
		FirstNum = this.FirstNum;
		SecondNum = this.SecondNum;
		ThirdNum = this.ThirdNum;
		
}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getFirstNum() {
		return FirstNum;
	}

	public void setFirstNum(int firstNum) {
		FirstNum = firstNum;
	}

	public int getSecondNum() {
		return SecondNum;
	}

	public void setSecondNum(int secondNum) {
		SecondNum = secondNum;
	}

	public int getThirdNum() {
		return ThirdNum;
	}

	public void setThirdNum(int thirdNum) {
		ThirdNum = thirdNum;
	}
	public void CalAvg() {
		CalAvg = (FirstNum + SecondNum + ThirdNum)/3;
	
	}
}
