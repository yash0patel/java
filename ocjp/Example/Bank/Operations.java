package Bank;

public class Operations {
	private int accountnum;
	private String name;
	private double withdraw = 0;
	private double deposit = 0;
	private double balance;
	boolean transation = true;
	boolean check = false;
	
	Operations(int accountnum,String name,double balance)
	{
		this.accountnum = accountnum;
		this.balance = balance;
		this.name = name;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setWithdraw(double withdraw)
	{
		if(withdraw <= balance && withdraw > 0)
		{
			this.withdraw = withdraw;
			this.balance = this.balance - withdraw;
			System.out.println(this.withdraw+".rs withdraw successfully");
			this.transation = false;
			check = true;
		}
		else if(withdraw <= 0)
		{
			System.out.println("Error :: Withdraw Amount is Invalide");
		}
		else
		{
			System.out.println("Error :: Withdraw Amount is higher than Balance");
		}
	}
	
	public double getWithdraw()
	{
		return this.withdraw;
	}
	
	public void setDeposit(double deposit)
	{
		if(deposit > 0)
		{	
			this.deposit = deposit;
			this.balance = this.balance + deposit;
			System.out.println(this.deposit+".rs deposit successfully");
			this.transation = true;
			check = true;
		}
		else
		{
			System.out.println("Error :: Deposit Amount is Invalide");
		}
	}
	
	public double getDeposit()
	{
		return this.deposit;
	}
	
	public void getDetails()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Account Number : "+this.accountnum);
		System.out.println("Balance : "+this.balance);
	}	
}