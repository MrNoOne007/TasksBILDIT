package Zadatak1;

public class Author {

	private String Ime;
	private String email;
	private char gender;

	public Author(String Ime, String email, char gender) {
		this.Ime = Ime;
		this.email = email;
		this.gender = gender;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [Ime=" + Ime + ", email=" + email + ", gender=" + gender + "]";
	}

}
