
public class Manager extends Employee{
	float bonus;
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public void showBonus() {
		System.out.println("Manager Bonus : "+ this.bonus);
	}
}
