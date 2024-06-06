package kadai_015;

public class Car_Chapter15 {

	private int gear ;
	private int speed ;
	
	public Car_Chapter15(){
		this.gear=1;
		this.speed=10;
		}
	
	public void gearChange(int afterGear) {
		this.gear=afterGear;
	
		System.out.println("ギア1から"+this.gear+"に切り替えました");
		

	}
	
	public void run() {

	//switchは関数なのでメソッド内でしか使えない。
	switch(this.gear) {
	//
	case 1 -> this.speed=10;
	case 2 -> this.speed=20;
	case 3 -> this.speed=30;
	case 4 -> this.speed=40;
	case 5 -> this.speed=50;
	case 6 -> this.speed=60;
	}
	
	System.out.println("速度は時速"+this.speed+"kmです");
		
	}
	
		
		
	}
	
	
	


	
	



