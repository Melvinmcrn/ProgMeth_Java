package character;

import simInterface.IObstructable;

public class JumperChocobo extends Chocobo implements IObstructable{
	private int turnCount=1;
	private int obstructedDuration;
	
	public JumperChocobo() {
		System.out.println("- JumperChocobodistance : 0.0");
		this.setSpeed(7.5);
		this.obstructedDuration = 0;
	}
	
	@Override
	public void start() {
		this.setDistance(0);
	}

	@Override
	public void run() {
		if(this.turnCount%2 == 0) {
			this.setDistance(this.getDistance()+this.getSpeed());
			System.out.println("- JumperChocobodistance : " + this.getDistance());
		} else {
			System.out.println("- JumperChocobodistance : " + this.getDistance() + " and preparing to Jump");
		}
		this.turnCount++;
	}

	@Override
	public void obstructed() {
		if(this.getObstructedDuration() == 0) {
			this.setSpeed(this.getSpeed()/2);
			this.setObstructedDuration(2);
			System.out.println("+ JumperChocobo has obstructed > speed down for 2 seconds");
		}
	}

	@Override
	public void setObstructedDuration(int x) {
		this.obstructedDuration = x;		
	}

	@Override
	public int getObstructedDuration() {
		return this.obstructedDuration;
	}

}
