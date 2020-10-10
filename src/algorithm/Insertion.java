package algorithm;
public class Insertion {
    /*
     * 选择排序法*/
    public  static   void sort1(Comparable[] a)
    {
        int n=a.length;
        for(int i=1;i<n;i++)
            for( int j=i;j>0&&less(a[j],a[j-1]);j--)
            {
                exch(a,j,j-1);
            }
        return ;
    }
    /*
     * 希尔排序法*/
    public  static   void sort2(Comparable[] a)
    {
        int n=a.length;
        int h=1;
        while(h<n/3)
            h=h*3+1;
        while(h>=1) {
            for (int i = h; i < n; i++)
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j - h, j);
                }
                h = h / 3;
        }

        return ;
    }

    private static void exch(Comparable[] a, int j, int i) {
      //  System.out.println("移动");
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static boolean less(Comparable comparable, Comparable comparable1) {
        return comparable.compareTo(comparable1)<0;
    }
    }
