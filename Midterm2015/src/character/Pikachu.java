package character;

import simInterface.ICharacter;
import simInterface.IObstructable;

public class Pikachu implements IObstructable, ICharacter {
	private double speed;
	private double distance;
	private int obstructedDuration;

	public Pikachu() {
		System.out.println("- Pikachu distance : 0.0");
		this.speed = 4;
		this.setObstructedDuration(0);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public void obstructed() {
		if (this.getObstructedDuration() == 0) {
			this.setSpeed(0);
			this.setObstructedDuration(1);
			System.out.println("+ Pikachu has obstructed > stop running for 1 seconds");
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

	public int compareTo(Object o) {
		if (this.getDistance() < ((ICharacter) o).getDistance()) {
			return -1;
		} else if (this.getDistance() > ((ICharacter) o).getDistance()) {
			return 1;
		} else {
			if (o instanceof RunnerChocobo || o instanceof JumperChocobo)
				return 1;
			else return -1;
		}
	}

	@Override
	public void start() {
		this.setDistance(0);
	}

	@Override
	public void run() {
		this.setDistance(this.getDistance() + this.getSpeed());
		System.out.println("- Pikachu distance : " + this.getDistance());
	}

}
