package algorithm;


import javax.lang.model.util.ElementScanner6;
/*
*
*归并排序 */
public class Merge {
    public  static  Comparable[] aux;
    public  static  void func(Comparable[] a)
    {
        aux=new Comparable[a.length];
        sort(a,1,a.length-1);
    }

    /*
    * 自顶向下的归并排序*/
    private static void sort(Comparable[] a, int i, int j) {
        int mid=(i+j)/2;
        if(j<=i||j-i==1) return;
        else {
            System.out.println(i + "  " + mid + "  " + j);
            sort(a, i, mid);//将左半边排序
            sort(a, mid, j);//将右半边排序
            merge(a, i, mid, j);
        }
    }

    /*
    * 原地归并排序*/
    private static void merge(Comparable[] a, int low, int mid, int high) {
        int i=low,j=mid+1;
        for(int k=low;k<=high;k++)
            aux[k]=a[k];
        for(int k=low;k<=high;k++)
        {
            //System.out.println(aux[k]);
            if(i>mid) a[k]=aux[j++];
            else  if(j>high) a[k]=aux[i++];
            else if(Insertion.less(aux[j],aux[i])) a[k]=aux[j++];
            else  a[k]=aux[j++];
        }
    }
}
