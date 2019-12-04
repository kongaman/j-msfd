package ck.learn.jpmfsd.a09.inner_abstract_interfaces.lec122_interfaces;

public class Deskphone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	
	
	public Deskphone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken, desk phone does not have a power button");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on desk phone");
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Now answering the desk phone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("ring ring");
		} else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
