package prob02;

public class Book {
	
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		//stateCode의 기본 세팅은 1로
		stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	//책 대여기능
	public void rent() {
		//stateCode ==> 0
		stateCode = 0;
	}
	
	// 책 정보 출력 기능 (문제의 혼용으로 그냥 BookShop에 display메소드 추가시킴)
	public void print() {
		//stateCode가 1이면 재고있음
		//stateCode가 0이면 대여중
	}
}
