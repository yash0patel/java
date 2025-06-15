package OopsEx;

public class Constructor {
	int n1;
	String str;
	Constructor() {
		n1 = 0;
		str = "none";
	}
	Constructor(int n1){
		this.n1 = n1;
		str = "none";
	}
	Constructor(String str){
		n1 = 0;
		this.str = str;
	}
	Constructor(int n1,String str){
		this.n1 = n1;
		this.str = str;
	}
	Constructor(String str,int n1){
		this.n1 = n1;
		this.str = str;
	}
	
	public void disp() {
		System.out.println("n1 : " + n1);
		System.out.println("str : " + str);
	}
}
