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