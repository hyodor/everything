package baseball0520;

public class Batter extends Human {
	
	private int tasu;
	private int antasu;
	private double avg;
	
	public Batter() {
		
	}
	public Batter(int number, String name, int age, int height, int tasu, int antasu, double avg) {
		super(number, name, age, height);
		this.tasu = tasu;
		this.antasu = antasu;
		this.avg = avg;
	}
	
	public int getTasu() {
		return tasu;
	}

	public void setTasu(int tasu) {
		this.tasu = tasu;
	}

	public int getAntasu() {
		return antasu;
	}

	public void setAntasu(int antasu) {
		this.antasu = antasu;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return super.toString() + "-" + tasu + "-" + antasu + "-" + avg ;
	}
}