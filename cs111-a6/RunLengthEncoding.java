/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author:Peiqi Tang
 *
 *************************************************************************/

public class RunLengthEncoding{

    /*
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original){

        // WRITE YOUR CODE HERE
        String encodeString = new String();
        int n = original.length();
        for (int i = 0; i < n; i++){
            int count = 1;
            while (i < n - 1 && original.charAt(i) == original.charAt(i + 1)){
                count++;
                i++;
            }
            if (count != 1) {
            	encodeString = encodeString + count;
            }
            encodeString = encodeString + original.charAt(i);
        }
        return encodeString;

    }

    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while,
     * or for loops
     */
    public static String decode (String original){

        // WRITE YOUR RECURSIVE CODE HERE
        int length = original.length();
        if (length == 0){
			return "";
		}
        String decodeString = new String();
		char a = original.charAt(0);
		if (Character.isDigit(a)){
			int index = a-'0';
			if (index == 0){
				return decode(original.substring(2));
			}else{
				int preIndex = index-1; 
				return original.charAt(1)+decode(preIndex+original.substring(1));	
			}
		}else{
			return a + decode(original.substring(1));
			}
		}


    public static void main (String[] args){

        // WRITE YOUR TEST CASES HERE to test your methods

        String str = "qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
        String rts = "q9w5e2rt5y4qw2Er3T";
        System.out.println(encode(str));
        System.out.print(decode(rts));

    }
}
