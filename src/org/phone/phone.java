package org.phone;

public class phone {
	public void phInfo(Long phno,String phmodel) {
		System.out.println("PHONE NO:"+phno);
		System.out.println("PHONE Model:"+phmodel);
	}
	public void phInfo(String phname,Long cntrycd) {
		System.out.println("PHONE Name:"+phname);
		System.out.println("country code:"+cntrycd);
	}
	public static void main(String[] args) {
		phone p=new phone();
		p.phInfo(98654123L,"nokia");
		p.phInfo("samsung",91L);
	}

}
