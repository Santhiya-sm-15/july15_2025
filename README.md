# july15_2025
The problem that i solved today in leetcode

A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

Notes:

'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.

Code:
class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        System.out.println(n);
        if(n<3)
            return false;
        int vowels=0,consonants=0;
        for(char c:word.toCharArray())
        {
            if(c>='A' && c<='Z')
            {
                if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                    vowels++;
                else
                    consonants++;
            }
            else if(c>='a' && c<='z')
            {
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                    vowels++;
                else
                    consonants++;
            }
            else if(!(c>='0' && c<='9'))
                return false;
        }
        return vowels>0 && consonants>0;
    }
}
