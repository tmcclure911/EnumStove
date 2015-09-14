
public class Burner {
	public enum Temperature {HOT, WARM, COLD};
	
	Temperature temperature;
	Setting setting;
	private int timer = 0;
	private static final int TIME_DURATION = 2;
	
	public Burner() {
		setting = Setting.OFF;
		temperature = Temperature.COLD;
	}
	
	public Temperature getTemperature() {
		return temperature;
	}
	
	public void increaseSetting(){
		switch(setting) {
		case OFF: 
			setting = Setting.LOW;
			timer = timer + TIME_DURATION;
			break;
		case LOW:
			setting = Setting.MEDIUM;
			timer = timer + TIME_DURATION;
			break;
		case MEDIUM:
			setting = Setting.HIGH;
			timer = timer + TIME_DURATION;
			break;
		default:
			break;
		}
	} 
	public void decreaseSetting(){
		switch(setting) {
		case HIGH:
			setting = Setting.MEDIUM;
			timer = timer + TIME_DURATION;
			break;
		case MEDIUM:
			setting = Setting.LOW;
			timer = timer + TIME_DURATION;
			break;
		case LOW:
			setting = Setting.OFF;
			timer = timer + TIME_DURATION;
			break;
		default:
			break;
		}
	}
	public void updateTemperature(){
		if (timer > 0){
			timer--;
		}
		else {
			switch(setting){
			case OFF:
				temperature = Temperature.COLD;
				break;
			case HIGH:
				temperature = Temperature.HOT;
				break;
			default:
				temperature = Temperature.WARM;
				break;
			}
		}
	}
	public void Display(){
		System.out.print("[" + setting.toString() + "].....");
		switch (temperature) {
		case HOT:
			System.out.println("HOT SURFACE DO NOT TOUCH");
			break;
		case WARM:
			System.out.println("");
			break;
		default:
			System.out.println("coooool");
			break;
		}
	}
}
