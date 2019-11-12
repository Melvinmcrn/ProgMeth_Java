package character;

import simInterface.ICharacter;

public abstract class Chocobo implements ICharacter {
	protected double speed;
	protected double distance;

	@Override
	public double getSpeed() {
		return this.speed;
	}

	@Override
	public double getDistance() {
		return this.distance;
	}

	@Override
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Object o) {
		if (this.getDistance() < ((ICharacter) o).getDistance()) {
			return -1;
		} else if (this.getDistance() > ((ICharacter) o).getDistance()) {
			return 1;
		} else {
			int score1 = 0, score2 = 0;
			if (this instanceof RunnerChocobo)
				score1 = 3;
			else if (this instanceof JumperChocobo)
				score1 = 2;

			if (o instanceof RunnerChocobo)
				score2 = 3;
			else if (o instanceof JumperChocobo)
				score2 = 2;
			else if (o instanceof Pikachu)
				score2 = 1;

			if (score1 < score2)
				return -1;
			else
				return 1;
		}
	}

}
