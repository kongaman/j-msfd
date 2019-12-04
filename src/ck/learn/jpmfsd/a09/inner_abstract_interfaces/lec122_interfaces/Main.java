package ck.learn.jpmfsd.a09.inner_abstract_interfaces.lec122_interfaces;

public class Main {

	public static void main(String[] args) {
		ITelephone timsPhone;
		timsPhone = new Deskphone(12345);
		timsPhone.powerOn();
		timsPhone.callPhone(12345);
		timsPhone.answer();
	}

}
