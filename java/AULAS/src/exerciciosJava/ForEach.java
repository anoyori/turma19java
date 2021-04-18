package exerciciosJava;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] vect = new String [] {"Maria", "Bob", "Alex"};
		
		//laço for
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("-----------------");
		
		//laço for each
		for(String obj: vect) {
			System.out.println(obj);
		}
	}

}
