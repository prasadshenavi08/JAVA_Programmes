
public class LambdaDemo {
	public static void main(String[] args) {
		//Using Annonymous class
		/*Drawable d1 = new Drawable() {
			public void draw() {
				System.out.println("Drawing a shape");
			};
			d1.draw();
		*/
		
		Drawable d1 = () -> {
			System.out.println("Drawing a shape");
		};
		d1.draw();
	}
}
