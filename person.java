import java.util.*;

public class person {
		protected String FirstName,SecondName;
		protected int idNumber;
	
		person(String FirstName,String SecondName,int idNumber){
			this.FirstName=FirstName;
			this.SecondName=SecondName;
			this.idNumber=idNumber;
		}
		 public void printPerson() {
		        System.out.println("Name : " + FirstName. toUpperCase() +" " + SecondName. toUpperCase() + "\nID : " + idNumber);
		    }
}	
	class student extends person{
		private int[] TestScores;
		private static Scanner sc;
		student(String name1,String name2,int id,int[]TestScores){
			super(name1, name2,id);	
			this.TestScores=TestScores;
		
		}
	   
		public String calculate() {
			int sum=0;
			for(int i:TestScores) {
				sum=sum+i;
			}
			float a=sum/TestScores.length;
			if(a>=90 && a<=100) {
				return "O";
			}else if(a>=80 && a<90) {
			    return "E";
			}else if(a>=70 && a<80) {
				return "A";
			}else if(a>=55 && a<70) {
				return "P";
			}else if(a>=40 && a<55) {
				return "D";
			}else {
				return "T";
			}
			
		}

	public static void main(String[] args) {
		String FirstName,SecondName;
		int id,n;
		sc = new Scanner(System.in);
		FirstName=sc.nextLine();
		SecondName=sc.nextLine();
		id=sc.nextInt();
		n=sc.nextInt();
		int[] TestScores = new int[n];
		for(int i=0;i<n;i++) {
			TestScores[i]=sc.nextInt();
		}
		student obj=new student(FirstName, SecondName, id, TestScores);
		obj.printPerson();
		System.out.println("Grade : "+obj.calculate());
	}

}
