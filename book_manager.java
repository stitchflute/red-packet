package book;

public class book_manager {
	String book_name;
	String student_number;
	int borrow_book_time;
	int student_money;
	int limit_time;
	boolean isborrow=false;
	public book_manager(String newbook_name,String newstudent_number) {
		book_name=newbook_name;
		student_number=newstudent_number;
		borrow_book_time=0;
		limit_time=30;
	}
	public void borrowbook() {
		if(isborrow)
			borrow_book_time++;
	}
	
	public void recharge(int money) {
		student_money+=money;
	}
	public void notreturn_book() {
		if(borrow_book_time>limit_time)
			student_money-=1;
	}
}
