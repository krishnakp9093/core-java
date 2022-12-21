package in.co.Interface;

public class Bussinessan01 implements SocialWorker {

	//if we extends richman into social worker then no need to implement it Bussinessan01
	
	@Override
	public void earnMoney() {
	System.out.println("Focus on earning money");	
	}

	@Override
	public void donation() {
	System.out.println( "and donate some part of  it to helpless ");
	}

	@Override
	public void party() {
	System.out.println("and enjoy by your money");
	}

	@Override
	public void helpToOthers() {
	System.out.println("always help othrs ");
	}
	
	

}
