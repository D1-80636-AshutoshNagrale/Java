import java.util.Objects;
import java.util.Scanner;

public class Music extends Shop {
	private String title;
	private String singer;
	private String musician;

	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer, String musician) {
		super();
		this.title = title;
		this.singer = singer;
		this.musician = musician;
	}

//	public Music(String title, String singer, String musician, double price, double tax) {
//		super(price, tax);
//		this.title = title;
//		this.singer = singer;
//		this.musician = musician;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMusician() {
		return musician;
	}

	public void setMusician(String musician) {
		this.musician = musician;
	}

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter title  of Music: ");
		this.title = sc.next();
		System.out.println("Enter singer name : ");
		this.singer = sc.next();
		System.out.println("Enter musician name : ");
		this.musician = sc.next();
		super.accept(sc);
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + ", musician=" + musician + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(musician, singer, title);
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
		Music other = (Music) obj;
		return Objects.equals(musician, other.musician) && Objects.equals(singer, other.singer)
				&& Objects.equals(title, other.title);
	}

}
