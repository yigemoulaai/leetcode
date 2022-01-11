package easy;

/**
 * @Author ACER
 * @Date:2022/1/10
 */
/*
*
* 穷举前两个数的长度，然后DFS 处理异常很麻烦
* */
public class isAdditiveNumber {
    boolean flag = false;
    public boolean isAdditiveNumber(String word) {
        int N = word.length();
        for (int i = 1; i <= (N - 1) / 2; i++)
            for (int j = 1; j <= (N - 1) / 2; j++) {
                dfs(i, j, word, 0);
            }
        return flag;
    }

    private void dfs(int i, int j, String word, int index) {
        if(index+i+j+Integer.max(i,j) > word.length()){
            return;
        }
        if(isActive(i,j,index,Integer.max(i,j),word) ){
            if(index+i+j+Integer.max(i,j) == word.length()){
                flag =true;
            }
            dfs(j,Integer.max(i,j),word,index+i);
        }
        if(i+index+j + Integer.max(i,j)+1 <= word.length() && isActive(i,j,index,Integer.max(i,j)+1,word)){
            if(index+i+j+Integer.max(i,j) +1 == word.length()){
                flag =true;
            }
            dfs(j,Integer.max(i,j)+1,word,index+i);
        }

    }
    private boolean isActive(int i, int j, int index, int k, String word) {
        boolean flag =false;
        if( Long.valueOf(word.substring(index,index+i))+ Long.valueOf(word.substring(index+i,index+i+j))==
                Long.valueOf(word.substring(index+i+j,index+i+j+k))) {
            flag =true;
        }
        if((i > 1 && word.charAt(index) == '0') || (word.length()- (index+i+j) >1 && word.charAt(index+i+j) == '0' )|| (j>1 && word.charAt(index +i ) == '0') ){
            flag = false;
        }
        return  flag;
    }

}
