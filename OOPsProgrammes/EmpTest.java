
public class EmpTest {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		Typist t1 = new Typist();
		
		m1.setData(1, "prasad", 10000.25f);
		m1.showData();
		m1.setBonus(1569.265f);
		m1.showBonus();
		t1.setWages(100.35f);
		t1.showWages();
	}
}
