package com.susie.stanley.jvm;

public class BirthDateTest {
	
	private static int date2 = 2;
	
	public static void main(String args[]){
		
		BirthDateTest test = new BirthDateTest();
        int date3 = 3;
        BirthDate d1= new BirthDate(7,7,1970);
        BirthDate d2= new BirthDate(1,1,2000);
        test.change1(date2);
        test.change1(date3);
        test.change2(d1);
        test.change3(d2);
        System.out.println("date2=" + date2);
        System.out.println("date3=" + date3);
        d1.display();
        d2.display();
    }
 
    public void change1(int i){
        i++;
    }
 
    public void change2(BirthDate b) {
        b = new BirthDate(22,2,2004);
    }
 
    public void change3(BirthDate b) {
        b.setDay(22);
    }
}
