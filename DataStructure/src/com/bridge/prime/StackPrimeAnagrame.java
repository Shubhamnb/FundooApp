package com.bridge.prime;

import com.bridge.OrderedList.LinkedList1;

import Utility.Stack;
import Utility.StackUsingLinkedList;

public class StackPrimeAnagrame {
	
		
		public static void isAnagrameStack(int[] cn) {
			StackUsingLinkedList slist = new StackUsingLinkedList();
			//System.out.println(isAnagram("13", "32"));
			for (int i = 0; i < (cn.length - 1); i++) {
				for (int j = i+1; j < cn.length; j++) {
				
					
						String str1 = Integer.toString(cn[i]);
						String str2 = Integer.toString(cn[j]);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
						if(PrimeAnagram.isAnagram(str1, str2)) {
							if(cn[i] != 0) {
								slist.push(cn[i]);
							}	
						}
				}//inner for
			}//outer for    
			
			//System.out.println(st.size);
			while(!slist.isEmpty()) {
				System.out.print(slist.pop()+" ");
			}
		 
		}

}
