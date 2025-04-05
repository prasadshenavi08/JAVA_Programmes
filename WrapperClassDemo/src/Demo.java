
public class Demo {
	public static void main(String[] args) {
		
		//they is use in next topic collection and 
		//int 	Integer
		//boolean Boolean
		//float 	Float
		//char		Character
		
		int no = 25; 	//primitive
		Integer il = no;	//object
		//conversion form primitive datatype to obj
		//autoboxing
		
		Float f1=15.5f;	//obj
		float s1 = f1;	//primitive
		//conversion form obj to primitive
		//autounboxing
		
		String n = "1235";
		//conversion from string to primitive ->parser
		int n3 = Integer.parseInt(n);
		
		//conversion from string to Wrapper class Integer ->valueof
		Integer i1 = Integer.valueOf(n);
		
		
		String x = "2156.54";
		float y = Float.parseFloat(x);
		
		double z = Double.parseDouble(x);
		
		System.out.println(Integer.MAX_VALUE); //MAX_VALUE built in attributee
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Integer.max(12, 13));  //check max value built in attribute
		System.out.println(Character.SIZE);
		System.out.println(Float.SIZE);
		
	}
}
