class Bike{
	String company;
	int  date;
	String type;
	float price;

	public Bike(){
  	System.out.println("constructor called"); 
	}

	//setter
	public void setCompany(String company){
		this.company= company;
	}

	public void setDate(int date){
		this.date = date;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setPrice(float price){
		this.price = price;
	}

	//getter
	public String getCompany(){
		return company;
	}
	
	public int getDate(){
		return date;
	}
	
	public String getType(){
		return type;
	}

	public float getPrice(){
		return price;
	}



	public static void main(String [] args){
		Bike b = new Bike();
		b.setCompany("TVS");
		System.out.println("Company name : "+b.getCompany());

		b.setDate(12-5);
		System.out.println("Manufactor Date : "+b.getDate());

		b.setType("EV");
		System.out.println("Bike Type : "+b.getType());

		b.setPrice(60000f);
		System.out.println("Bike price : "+b.getPrice());

	}
}