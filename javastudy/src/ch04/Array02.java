package ch04;

class Jobs{
	
}

class Police extends Jobs{
	private String name = "경찰";
}

class Doctor extends Jobs{
	private String name = "의사";
}

public class Array02 {

	public static void main(String[] args) {
		Jobs[] j = new Jobs[2];
		j[0] = new Police();
		j[1] = new Doctor();
		
		
		
	
		
		

	}

}
