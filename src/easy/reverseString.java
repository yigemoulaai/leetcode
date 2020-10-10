package easy;

public class reverseString {
    public void reverseString(char[] s) {
            int leng=s.length;
            char a=' ';
            for(int i=0;i<=leng/2;i++)
            {
                a=s[i];
                s[i]= s[leng-1-i];
                s[leng-1-i]=a;
            }
    }
}
