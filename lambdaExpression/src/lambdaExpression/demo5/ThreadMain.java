package lambdaExpression.demo5;

public class ThreadMain {

	public static void main(String[] args) {
		Runnable thread1 = () -> {
			for (int i = 1; i < 10; i++) {
				System.out.println("Value of:" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(thread1);
		t.setName("Vikash: ");
		t.start();

		Runnable Thread2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Mul: " + i * 2);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(Thread2);
		t2.start();
	}

}
