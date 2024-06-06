package kadai_026;
import java.util.Scanner;
//コンストラクタを入れないと動かない
public class Jyanken_Chapter26{
	
	public String choice;
	public String hand;
	
	public Jyanken_Chapter26(String choice, String hand) {
		this.choice = choice;
		this.hand = hand;
	}
	
	
	public Jyanken_Chapter26() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	public void getChoice()  {
		
	Scanner scanner = new Scanner(System.in);
		
		this.choice=scanner.next();
		
		if(this.choice.equals("r")){
		}
		else if (this.choice.equals("s")){
		}
		else if (this.choice.equals("p")){
			
		}else {
			System.out.println("正しい値を入力してください");
			
		}
		
	scanner.close();
		
	}



	public void setHand() {
		
		int defineumber=(int)Math.ceil(Math.random()*3);
		switch(defineumber) {
		case 1 -> this.hand.equals("r");
		case 2 -> this.hand.equals("s");
		case 3 -> this.hand.equals("p");
	
		}
	}
	
	
	public void judge() {
		
		
		if(this.choice==this.hand) {
			System.out.println("あいこです");
		}
		else if(this.choice=="r"&&this.hand=="p"||this.choice=="s"&&this.hand=="r"||this.choice=="p"&&this.hand=="s") {
			
			System.out.println("負けです");
		}
		else if(this.choice=="r"&&this.hand=="s"||this.choice=="s"&&this.hand=="p"||this.choice=="p"&&this.hand=="r") {
			
			System.out.println("勝ちです");
		
		}

	}
	
	
}





