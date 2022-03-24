package codeTop;

/**
 * @Author ACER
 * @Date:2022/2/28
 */
public class CurrentSingleton {
    private  static volatile CurrentSingleton SINGLETON = null;
    private CurrentSingleton(){}
    private static CurrentSingleton getSingleton(){
        if(SINGLETON == null){
            synchronized (CurrentSingleton.class){
                if(SINGLETON == null){
                    SINGLETON = new CurrentSingleton();
                }
            }
        }
        return SINGLETON;
    }
}
