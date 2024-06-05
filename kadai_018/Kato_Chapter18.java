package kadai_018;

abstract class Kato_Chapter18 {

	public String famliyName="加藤";
	public String givenName;
	public String address;
	
		
		
		
	public void commonIntroduce	() {
		
		System.out.println("名前は"+this.famliyName+this.givenName+"です");
		
	}
	
	
	abstract void eachIntroduce();
	
	
	
	
    public void execIntroduce() {
    	System.out.println("住所は東京都中野区〇×です");
    	 
     }
	
	
}