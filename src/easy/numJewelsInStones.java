package easy;

public class numJewelsInStones {
    public  int numJewelsInStones(String J,String S)
    {
        char[] jchar=J.toCharArray();
        char[] schar=S.toCharArray();
        int k=0;
        for(int i=0;i<schar.length;i++)
            for(int j=0;j<jchar.length;j++)
            {
                if(schar[i]==jchar[j])
                    k++;
            }
        return k;

    }
}
