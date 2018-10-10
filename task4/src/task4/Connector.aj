package task4;

public aspect Connector extends Loggable{
	pointcut CreateObjectLog(Object o) :
		initialization(public *.new(..)) 
		&& target(o) && (within(Exam) || within(Student)); 
	
	pointcut OperationCallLog(Object o) :
		call(public void Exam.*(..)) && target(o);
}
