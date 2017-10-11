package car;

public class car_manager {
	String plate_number;
	String car_owner;
	int score;
	int use_age=0;
	public car_manager(String newcar_owner,String newplate_number) {
		car_owner=newcar_owner;
		plate_number=newplate_number;
		score=12;
	}
	public void accident() {
		if(score>0)
			score-=1;
	}
	public void revoke_license(){
		if(score<=0)
			System.out.println("your car license can't be use,please get it again!\n");
	}
	public void useage() {
		if(use_age<10)
			use_age++;
	}
	public void recycle_car() {
		if(use_age>=10)
			System.out.println("your car need to be recycled and you can't use it!\n");
	}
}
