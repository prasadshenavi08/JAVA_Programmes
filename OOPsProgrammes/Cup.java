
public class Cup {
	String type;
	int size;
	int price;
	
	Cup(){
		//this("s1",98) call constrauctor of the same class
		//taking String and int parameter
		//it is called as Constructor Cheaning;
		this("Glass",20,265);
	}
	public Cup(String type, int size, int price) {
		this.type = type;
		this.size = size;
		this.price = price;
	}
	
	public String toString() {
		return "Cup type ="+type+",Cup Size = "+size+",Price = "+price;
	}
	
	public static void main(String[] args) {
		Cup c1 = new Cup();
		System.out.println(c1);
	}
}
