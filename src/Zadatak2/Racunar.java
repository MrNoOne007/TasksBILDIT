package Zadatak2;

public class Racunar {

	private int Ram;
	private int HDD;
	private double CpuSpeed;
	private double Monitor;
	protected double Cijena;

	public Racunar() {
	}

	public Racunar(int Ram, int HDD, double CpuSpeed, double Monitor, double Cijena) {
		super();
		this.Ram = Ram;
		this.HDD = HDD;
		this.CpuSpeed = CpuSpeed;
		this.Cijena = Cijena;
		this.Monitor = Monitor;

	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}

	public int getHDD() {
		return HDD;
	}

	public void setHDD(int hDD) {
		HDD = hDD;
	}

	public double getCpuSpeed() {
		return CpuSpeed;
	}

	public void setCpuSpeed(double cpuSpeed) {
		CpuSpeed = cpuSpeed;
	}

	public double getMonitor() {
		return Monitor;
	}

	public void setMonitor(int monitor) {
		Monitor = monitor;
	}

	public double getCijena() {
		return Cijena;
	}

	public void setCijena(double cijena) {
		Cijena = cijena;
	}

	@Override
	public String toString() {
		return "Racunar [Ram=" + Ram + ", HDD=" + HDD + ", CpuSpeed=" + CpuSpeed + ", Monitor=" + Monitor + ", Cijena="
				+ Cijena + "]";
	}

	public double IzracunajCijenu() {
		return Cijena + (Cijena * 0.1);
	}
}
