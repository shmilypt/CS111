/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author:Peiqi Tang
 *
 *************************************************************************/

public class RunLengthEncoding
{

    /*
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)
    {

        // WRITE YOUR CODE HERE
        String encodeString = new String();
        int n = original.length();
        for (int i = 0; i < n; i++)
        {
            int count = 1;
            while (i < n - 1 && original.charAt(i) == original.charAt(i + 1))
            {
                count++;
                i++;
            }
            if (count != 1) System.out.print(count);
            System.out.print(original.charAt(i));
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
    public static String decode (String original)
    {

        // WRITE YOUR RECURSIVE CODE HERE
        /*String encodeString = new String();
        String decodeString = new String();




        return decodeString;
        */

        String decodedString = new String();
        int n = original.length() - 1;
        if (n == 0)
        {
            if (Character.isDigit(original.charAt(n)) == false)
            {
                decodedString = original.charAt(n) + decodedString;
            }
            return decodedString;
        }
        else
        {

            if (Character.isDigit(original.charAt(n)) == true)
            {
                original = original.substring(0, n);
            }
            else
            {
                if (Character.isDigit(original.charAt(n - 1)) == false || original.charAt(n - 1) == 1)
                {
                    decodedString = original.charAt(n) + decodedString;
                    original = original.substring(0, n);
                }
                else
                {
                    decodedString = original.charAt(n) + decodedString;
                    char a = original.charAt(n - 1);
                    a--;
                    original = original.substring(0, n - 1) + a + original.charAt(n);
                }
            }
            return decode(original) + decodedString;
        }

    }

    public static void main (String[] args)
    {

        // WRITE YOUR TEST CASES HERE to test your methods

        String str = "qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
        String rts = "q9w5e2rt5y4qw2Er3T";
        System.out.println(encode(str));
        System.out.println(decode(rts));
    }
}
