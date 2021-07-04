package Denemeler.Cesitli;

public class NumberOfLetter {
    public static void main(String[] args) {

        //  Make a method that prints a string given as "aaabbccccdeeeff" as "3a2b4c1d3e2f" as a string.
        // Example: "aaaaabbbccccccdeeeffff" -->>  "5a3b6c1d3e4f"

        String given= "aaabbccccdeeeff";
        newOne(given);
    }

    public static String newOne(String given) {

        String newString="";
        for (int i=0;i<given.length();i++)
        {
            int count=0;
            for (int j=0;j<given.length();j++)
            {
                if (given.charAt(i)==given.charAt(j))
                    count++;
            }
            String searchingLetter= String.valueOf(given.charAt(i));
            if (!newString.contains(searchingLetter))
                newString=newString+count+searchingLetter;
        }
        System.out.println("newString = " + newString);
        return newString;
    }
}
