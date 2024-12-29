
public class Typist extends Employee{
	float dailyWages;
	
	public void setWages(float dailyWages) {
		this.dailyWages= dailyWages;
	}
	
	public void showWages() {
		System.out.println("Typist Daily Wages : "+ this.dailyWages);
	}
}
