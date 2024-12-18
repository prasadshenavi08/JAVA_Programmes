//create a class called remotecontrol 1.color 2.company 3.type 4.buttons write set get method main


class Remotecontrol{
	String color;
	String company;
	String type;
	int buttons;

	//setter
	public void setColor(String c){
		color = c;
	}

	public void setCompany(String com){
		company = com;
	}

	public void setType(String t){
		type = t;
	}

	public void setButtons(int b){
		buttons = b;
	}
	

//gettter
	public String getColor(){
		return color;
	}
		
	public String getCompany(){
		return company;
	}

	public String getType(){
		return type;
	}

	public int getButtons(){
		return buttons;
	}


public static void main(String [] args){
		Remotecontrol r = new  Remotecontrol();
		
		r.setColor("red");
		System.out.println("Color of Remote ="+r.getColor()) ;

		r.setCompany("Sony");
		System.out.println("Company of Remote ="+r.getCompany()) ;

		r.setType("TV");
		System.out.println("Type of Remote ="+r.getType()) ;

		r.setButtons(15);
		System.out.println("Buttons of Remote = "+r.getButtons()) ;

		
	}
}