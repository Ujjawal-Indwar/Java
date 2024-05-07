public class LastStringCount {
        public int lengthOfLastWord(String s) {
            int count = 0;
            int i = s.length()-1;

            while(s.charAt(i)==' ' && i>=0)
            {
                i--;
            }
            while(i>=0 && s.charAt(i)!=' ' )
            {

                count++;
                i--;
            }
            return count;

        }
    public static void main(String[] args)
    {
        String input = "Geeks For Geekkkkssss  ";
        LastStringCount gfg = new LastStringCount();
        System.out.println("The length of last word is "
                + gfg.lengthOfLastWord(input));
    }
}
