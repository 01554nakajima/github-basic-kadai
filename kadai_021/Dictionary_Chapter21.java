package kadai_021;
import java.util.HashMap;


public class Dictionary_Chapter21 {
	
	public void method1(String name) {
	
	HashMap<String,String> dictionary=new HashMap<String,String>();
	
	dictionary.put("apple","りんご") ;
	dictionary.put("peach","桃") ;
	dictionary.put("banana","バナナ") ;
	dictionary.put("lemon","レモン") ;
	dictionary.put("pear","梨") ;
	
	dictionary.put("kiwi","キウイ") ;
	dictionary.put("strawberry","いちご") ;
	dictionary.put("grape","ぶどう") ;
	dictionary.put("muscat","マスカット") ;
	dictionary.put("cherry","さくらんぼ") ;
	
	if(dictionary.get(name)== null) {
		System.out.println(name+"は辞書に存在しません");
	}
	else {

		
		System.out.println(name+"の意味は"+dictionary.get(name));
		
		
	}
	
	
	}}
	
	


