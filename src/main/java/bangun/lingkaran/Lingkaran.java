package bangun.lingkaran;

public class Lingkaran {
	private double d;
	private double pi = 3.14;
	
	public Lingkaran() {
		this.d = 0;
	}
	
	public Lingkaran(double d) {
		this.d = d;
	}
	
	public void setDiameter(double d) {
		this.d = d;
	}
	
	public double Luas() {
		return pi*(d/2)*(d/2);
	}
	
	public double getDiameter() {
		return this.d;
	}
}
