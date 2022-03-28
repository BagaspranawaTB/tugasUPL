package bangun.tabung;
import bangun.lingkaran.Lingkaran;

public class Tabung extends Lingkaran{
	private Lingkaran lingkaran;
	private double t;
	
	public Tabung(Lingkaran lingkaran, double t) {
		this.lingkaran = lingkaran;
		this.t = t;
	}
	
	public double volTabung() {
		return lingkaran.Luas() * t;
	}
	
	public double luasTabung() {
		return (2 * lingkaran.Luas()) + (lingkaran.getDiameter() * 3.14 * t);
	}
}
