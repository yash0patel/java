package StudentApplicationEx;

import java.util.Comparator;

public class StdWiseComparator implements Comparator<StudentObj>{
	@Override
	public int compare(StudentObj s1, StudentObj s2) 
	{
        
		if(s1.getStd() > s2.getStd())              
		{                                           
			return 1;                               
		       
		}else if(s1.getStd() < s2.getStd())        
		{                                           
			return -1;                              
		}else                                       
		{                                           
			return 0;                               
		}                                           
	}
}
