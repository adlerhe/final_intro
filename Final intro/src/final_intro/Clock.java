package final_intro;

public class Clock {
	
	private int k;
	public void setTime(int a) {
		a = k;
		k = 56;
		System.out.println(k);
	}
	
	public void tick() {
		k++;
	}
	
	public void displayTime() {
		while(k >= 60) {
		k -= 60;
		}
		System.out.println(k);
	}
	// create your methods here
	
	public static void main(String[] args) {
		Clock tester = new Clock();
		
		// should display the time to be 56, 57, 58, 59, 0, 1, etc.
		tester.setTime(56);
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
	}

}
