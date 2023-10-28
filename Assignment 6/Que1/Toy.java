import java.util.Objects;
import java.util.Scanner;

public class Toy extends Shop {
	private String title;
	private String ageGroup;
	private String type;

	public Toy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Toy(String title, String ageGroup, String type) {
		super();
		this.title = title;
		this.ageGroup = ageGroup;
		this.type = type;
	}

//	public Toy(String title, String ageGroup, String type, double price, double tax) {
//		super(price, tax);
//		this.title = title;
//		this.ageGroup = ageGroup;
//		this.type = type;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter title  of Toy: ");
		this.title = sc.next();
		System.out.println("Enter age group : ");
		this.ageGroup = sc.next();
		System.out.println("Enter type of toys : ");
		this.type = sc.next();
		super.accept(sc);
	}

	@Override
	public String toString() {
		return "Toy [title=" + title + ", ageGroup=" + ageGroup + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ageGroup, title, type);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return Objects.equals(ageGroup, other.ageGroup) && Objects.equals(title, other.title)
				&& Objects.equals(type, other.type);
	}

}
