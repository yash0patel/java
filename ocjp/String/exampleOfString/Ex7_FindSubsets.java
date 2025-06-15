package exampleOfString;

import java.util.Scanner;

public class Ex7_FindSubsets {
//	7)Java Program to find all substrings of a string
	public static void main(String[] args) {
		//scan string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        //initialize stringbuilder
        StringBuilder subsets[] = new StringBuilder[(int)Math.pow(2, str.length())];
        StringBuilder substring[] = new StringBuilder[(str.length()*(str.length()+1))/2];
        StringBuilder set = new StringBuilder();

        //initialize counter of subsets and substring
        int index = 0;
        int subindex = 0;
        
        //for loop (i) start 
        for (int i = 0; i < str.length(); i++) {
        	//for loop (j) start
            for (int j = i; j < str.length(); j++) {
            	//create stringBuilder object for subsets elements and append on substring
                substring[subindex] = new StringBuilder();
                substring[subindex].append(str.substring(i, j+1));
                //if condition start(1)
                if(substring[subindex].length() > 2) 
                {
                	//initialize subsets
                	subsets[index++] = substring[subindex];
                	for(int m = 0;m<substring[subindex].length();m++) 
                	{
                		set = new StringBuilder();
                		for(int n = 0;n<substring[subindex].length();n++) 
                    	{
                    		if(m != n)
                    		{
                    			set.append(substring[subindex].charAt(n));
                    		}
                    	}
                		if(!str.contains(set)) {
                			subsets[index++] = set;
                		}
                	}
                	subindex++;
                }//end if (1)
                else 
                {
                	subsets[index++] = substring[subindex++];
                }
            }//end (j) loop
        }//end (i) loop
        
        for(int i = 0;i<substring.length;i++) {
        	for(int j = 0;j<subsets.length;j++) {
        		if(!String.valueOf(subsets[j]).contains(String.valueOf(subsets[j]).replaceAll(String.valueOf(substring[i]), ""))) {
        			boolean checindex = true;
        			for(int k = 0;k<subsets.length;k++) 
        			{
        				if(String.valueOf(subsets[k]).equals(String.valueOf(subsets[j]).replaceAll(String.valueOf(substring[i]), "")))
        				{
        					checindex = false;
        				}
        			}
        			if(checindex) 
        			{
        				subsets[index] = new StringBuilder();
        				subsets[index++].append(String.valueOf(subsets[j]).replaceAll(String.valueOf(substring[i]), ""));
        			}
        		}
        	}
        }
        
        subsets[index] = new StringBuilder();
		subsets[index++].append("");
		
        for (int i = 0; i < index; i++) {
            System.out.println(i + " : " + subsets[i]);
        }
    }
}
