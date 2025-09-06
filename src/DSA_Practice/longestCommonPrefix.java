package DSA_Practice;

public class longestCommonPrefix {
	
//	This is my method failed due to edge cases and a little logic issue
//	public static String longestCommonPrefix(String[] strs) {
//        String fp = "";
//        String sp = "";
//        String prefix = "";
//        
//        int plength = 0;
//        for(int i = 0; i< strs.length;i++){
//        	if(String.valueOf(strs[0]).isEmpty()) break;
//            fp = String.valueOf(strs[0].charAt(i));
//            System.out.println("Outer For Loop First Pointer : "+ fp);
//            String check = String.valueOf((strs[strs.length-1].charAt(i%1)));
////            System.out.println("Outer For check last character : "+ check);
//            for(int j = 0;j<strs.length;j++){
//                sp = String.valueOf(strs[j].charAt(i));
//                System.out.println("Inner For Loop Second Pointer : "+ sp);
//                if(fp.equals(sp) && sp.equals(check) && j == (strs.length-2)){
//                    prefix += ""+sp;
//                    plength++;
//                }
//       
//            }
//        }
//        if(plength > 1) return prefix;
//        else {
//        	return "";
//        }
//    }
	// Another Approach of This is 
	    public static String longestCommonPrefix2(String[] strs) {
	        // Handle edge cases
	        if (strs == null || strs.length == 0) return "";
	        if (strs.length == 1) return strs[0];
	        
	        // Use first string as reference
	        String prefix = strs[0];
	        // Iterate through characters of the first string
	        for (int i = 0; i < prefix.length(); i++) {
	            char c = prefix.charAt(i);
	            // Check if this character matches in all other strings
	            for (int j = 1; j < strs.length; j++) {
	                // If we reach the end of a string or find a mismatch, return prefix up to i
	                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
	                    return prefix.substring(0, i);
	                }
	            }
	        }
	        // If we get here, the entire first string is the prefix
	        return prefix;
	    }
	// Method to find the longest common prefix among an array of strings -> most optimized method
    public static String longestCommonPrefix(String[] strs) {
        // Check if the input array is empty; if so, return an empty string
        if (strs.length == 0) return "";
        
        // Initialize the prefix as the first string in the array
        // This is the starting point, which will be reduced if necessary
        String prefix = strs[0];
        
        // Iterate through the remaining strings in the array (starting from index 1)
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix
            // (indexOf returns 0 if prefix is at the start, else non-zero or -1)
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there is no common prefix, so return ""
                if (prefix.isEmpty()) return "";
            }
            // If the while loop exits, the prefix is valid for the current string
            // Continue to the next string to check if the prefix is still valid
        }
        
        // Return the prefix, which is now common to all strings
        return prefix;
    }
	
	
	
	public static void main(String[] args) {
		String[] str = {"a","a"};
		
		System.out.println(longestCommonPrefix(str));
		
		System.out.println(longestCommonPrefix2(str));
		
		
		System.out.println("Ended");
		
	}
}
