package adding;

public class Sum {
	public void add()
	{
		int a=190;
		int b=80;
		int c=a+b;
		System.out.println(c);
		System.out.println("the data  modified here");
	}
	public static void main(String[] args) {
		Sum bb=new Sum();
		bb.add();
	}

}
