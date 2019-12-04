package ck.learn.jpmfsd.a09.inner_abstract_interfaces.lec122_interfaces;

public interface ITelephone {
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
}
