package StudentApplicationEx;

import java.util.Comparator;

public class MarksWiseComparator implements Comparator<StudentObj>{
	@Override
	public int compare(StudentObj s1, StudentObj s2) 
	{
        
		if(s1.getMarks() > s2.getMarks())              
		{                                           
			return 1;                               
		       
		}else if(s1.getMarks() < s2.getMarks())        
		{                                           
			return -1;                              
		}else                                       
		{                                           
			return 0;                               
		}                                           
	}
}
