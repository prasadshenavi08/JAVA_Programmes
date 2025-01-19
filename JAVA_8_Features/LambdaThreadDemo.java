
public class LambdaThreadDemo {
	public static void main(String[] args) {
//		TablePrintable a = new TablePrintable();
//		Thread t1 = new Thread();
//		t1.start();
		
		//lambda ex
//		class tableprintable implements runnable{
//			public void run() {
//				for(int i=1;i<=10;i++) {
//					System.out.println(5*i);
//				}
//			}
//		}
		
		Thread t1 =new Thread(()->{
			for(int i=1;i<=10;i++) {
				System.out.println(5*i);
			}
		});
		t1.start();
	}
}
