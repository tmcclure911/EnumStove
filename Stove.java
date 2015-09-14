import java.util.ArrayList;

public class Stove {
	 public ArrayList<Burner> stoveTop = new ArrayList<Burner>();;
	 private boolean isHot;
	 
	 public Stove() {
		stoveTop.add(new Burner());
		stoveTop.add(new Burner());
		stoveTop.add(new Burner());
		stoveTop.add(new Burner());
		isHot = false;
	}

	public void displayStove() {
		System.out.println("Stove -----------");
		for(Burner burn : stoveTop){
			burn.Display();
			if(burn.getTemperature() == Burner.Temperature.HOT)
				isHot = true;
		}
		if(isHot)
			System.out.println("RED LIGHT - HOT BURNER ALERT");
		
		isHot = false;
		
		System.out.println();
	 }
	 
	 public static void main(String[] args)
	 {
		 Stove hamington = new Stove();
		 hamington.displayStove();
		 
		 hamington.stoveTop.get(0).increaseSetting();
		 hamington.stoveTop.get(0).increaseSetting();
		 hamington.stoveTop.get(0).increaseSetting();
		 
		 hamington.stoveTop.get(1).increaseSetting();
		 hamington.stoveTop.get(1).increaseSetting();
		 
		 hamington.stoveTop.get(2).increaseSetting();
		 
		 for(int i = 0; i < 7; i++)
		 {
			 hamington.stoveTop.get(0).updateTemperature();
			 hamington.stoveTop.get(1).updateTemperature();
			 hamington.stoveTop.get(2).updateTemperature();
		 }
		 
		 hamington.displayStove();
		 
		 hamington.stoveTop.get(0).decreaseSetting();
		 hamington.stoveTop.get(0).decreaseSetting();
		 
		 hamington.stoveTop.get(1).increaseSetting();
		 
		 hamington.stoveTop.get(2).decreaseSetting();
		 
		 for(int i = 0; i < 5; i++)
		 {
			 hamington.stoveTop.get(0).updateTemperature();
			 hamington.stoveTop.get(1).updateTemperature();
			 hamington.stoveTop.get(2).updateTemperature();
		 }
		 
		 hamington.displayStove();
		 
		 hamington.stoveTop.get(0).decreaseSetting();
		 
		 hamington.stoveTop.get(1).decreaseSetting();
		 
		 for(int i = 0; i < 3; i++)
		 {
			 hamington.stoveTop.get(0).updateTemperature();
			 hamington.stoveTop.get(1).updateTemperature();
		 }
		 
		 hamington.displayStove();
	 }
}
