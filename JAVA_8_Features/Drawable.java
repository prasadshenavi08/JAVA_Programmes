
public interface Drawable {
	public void draw();
	public static void Display() {
		System.out.println("Static");
	}
	default public void show() {
		System.out.println("GM");
	}
}
