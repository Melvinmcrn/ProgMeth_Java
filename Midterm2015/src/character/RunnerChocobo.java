package character;

public class RunnerChocobo extends Chocobo {

	public RunnerChocobo() {
		System.out.println("- RunnerChocobodistance : 0.0");
		this.setSpeed(3);
	}

	@Override
	public void start() {
		this.setDistance(0);
	}

	@Override
	public void run() {
		this.setDistance(this.getDistance() + this.getSpeed());
		System.out.println("- RunnerChocobodistance : " + this.getDistance());
	}
}