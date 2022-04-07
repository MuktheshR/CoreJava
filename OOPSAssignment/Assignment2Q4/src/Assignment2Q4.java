//1.(public class Assignment2Q4{}) cannt be without abstract when method of class is abstracted.
//private abstract class Assignment2Q4 4.abstracted class cann't be private.
public abstract class Assignment2Q4{
	
		String name;
		public abstract void Animal();//we need to override the dog class then only we can declare this 
		//method with abstract.
		public void people() {
			System.out.println("I am method without abstract in abstracted class");
			//6.You can declare a class abstract without having any abstract method.
		}
		//final String name; //5.final cann't be intialized in abstract class and if we initialize it 
		// cann't be used in any other class.
		public static void main(String args[]) {
			//Assignment2Q4 myname = new Assignment2Q4();  //2.can not instantiate abstracted class.
							dogs obj = new dogs();
							obj.Animal();
							obj.people();		
			}
		 //class dog extends Assignment2Q4{} 3.when a class extends abstract class we need to that 
		//sub class as abstract  
		//abstract class dogs extends Assignment2Q4{} if we abstract this sub class we will not be able 
		//to use this abstracted sub class to creat obj so we need to static and override the method
		//and use abstracted method i.e:public void Animal(){}
		static class dogs extends Assignment2Q4{

			@Override
			public void Animal() {
				// TODO Auto-generated method stub
				System.out.println("I am people");
			}
			
		}

		
		}
		


