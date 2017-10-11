package book;

public class books {
	String book_name;
	boolean isborrow = false;
	public books(String newbook_name) {
		book_name=newbook_name;
	}
	public void borrowbook() {
		if(isborrow)
			System.out.printf("Sorry,the book %s has been borrowed.\n",book_name);
		else
			isborrow=true;
	}
	public void returnbook() {
		if(!isborrow)
			System.out.printf("Error!!The book %s has't been borrowed,you can't return it.\n",book_name);
		else
			isborrow=false;;
	}
}
