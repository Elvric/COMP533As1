package woven_bankwithlogging;

public aspect Connector extends Loggable{
	pointcut CreateObjectLog(Object o) :
		initialization(public *.new(..)) 
		&& target(o) && (within(Account) || within(Customer)); 
	
	pointcut OperationCallLog(Object o) :
		call(public void Account.*(..)) && target(o);
}
