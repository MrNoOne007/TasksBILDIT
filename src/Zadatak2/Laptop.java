package Zadatak2;

public class Laptop extends Racunar {

	private double trajanjeBaterijeUsatima;

	public Laptop() {
		super();
	}

	public Laptop(int Ram, int HDD, double CpuSpeed, double Monitor, double Cijena, double trajanjeBaterijeUsatima) {
		super(Ram, HDD, CpuSpeed, Monitor, Cijena);
		this.trajanjeBaterijeUsatima = trajanjeBaterijeUsatima;

	}

	@Override
	public String toString() {
		return "Laptop [trajanjeBaterijeUsatima=" + trajanjeBaterijeUsatima + ", Cijena=" + Cijena + ", getRam()="
				+ getRam() + ", getHDD()=" + getHDD() + ", getCpuSpeed()=" + getCpuSpeed() + ", getMonitor()="
				+ getMonitor() + ", getCijena()=" + getCijena() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double gettrajanjeBaterijeUsatima() {
		return trajanjeBaterijeUsatima;
	}

	public void settrajanjeBaterijeUsatima(double trajanjeBaterijeUsatima) {
		this.trajanjeBaterijeUsatima = trajanjeBaterijeUsatima;
	}

	@Override
	public double IzracunajCijenu() {
		return Cijena + (Cijena * 0.15);
	}

}
