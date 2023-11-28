package constructor;
class Test1{
	int score ;
	int updatedscore =90;
	
	public Test1 (){
		System.out.println("My current score is "+this.score);
		
	}
	Test1(int a ,int b){
		this();
		System.out.println("My updated score is "+this.updatedscore);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Test1 ob= new Test1(1,2);
	}

}
