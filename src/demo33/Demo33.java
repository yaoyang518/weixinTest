package demo33;

import java.util.Vector;

public class Demo33 {

	public static void main(String[] args) {
		Vector<String> tickets = new Vector();
		for (int i = 0; i < 100000; i++) {
			tickets.add("火车票" + i);
		}
		/*
		 * new Thread() { public void run() { while (true) { tickets.add("车票" +
		 * new Random().nextInt()); } }; }.start();
		 */
		for (int i = 0; i < 10; i++) {

			new Thread() {
				public void run() {
					/*
					 * for (String ticket : tickets) { tickets.remove(ticket); }
					 */
					while (true) {
						System.out.println(Thread.currentThread().getId() + "----" + tickets.remove(0));
					}
				};
			}.start();
		}
	}

}
