package book;

public class student {
	String student_number;
	int borrow_book_number=0;
	int return_book_number=0;
	public student(String newstudent_number){
		student_number=newstudent_number;
	}
	public void borrow_book() {
		borrow_book_number++;
	}
	public void return_book() {
		if(borrow_book_number<=0)
			System.out.println("error!!,you don't have book to return\n");
		else
			borrow_book_number--;
	}
}
