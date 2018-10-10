package task4;

/**
 * A student object. The only attribute is a string, the name.
 * 
 * @author Song
 */
public class Student {
    
    protected String name;
    
    public Student(String name) {
        
    	this.name = name;
    }
    
    public String toString(){
    	return this.name;
    }
}
