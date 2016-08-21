package com.xiaolu.sort;

import com.xiaolu.List.MyLinkedList;

/**
 * Created by Administrator on 2016/8/20.
 */
public class Sort<T extends Comparable<? super T>> {
    //插入排序,由后面无序的向前面有序的插入
    public T[] insertion(T[] t){
        int i;
        int j;
        for(i=0;i<t.length;i++){
            for(j=i+1;j<t.length;j++){
                if(t[i].compareTo(t[j])<0){
                    T swap=t[i];
                    t[i]=t[j];
                    t[j]=swap;
                }
            }
        }
        return t;
    }
    //选择排序,选择最小的元素放到前面进行排序
    public T[] selection(T[] t){
        int i;
        int j;
        int k;
        for(i=0;i<t.length;i++){
            T min=t[i];
            k=i;
            for(j=i+1;j<t.length;j++){
                if(min.compareTo(t[j])<0){
                    min=t[j];
                    k=j;
                }
            }
            T swap=t[i];
            t[i]=min;
            t[k]=swap;
        }
        return t;
    }
    //希尔排序
    public void shell(Comparable[] a){
        int N=a.length;
        int h=1;
        while(h<N/3){//找到最大的间隔
            h=3*h+1;
        }
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&Example.less(a[j],a[j-h]);j-=h){
                    Example.exch(a,j,j-h);
                }
            }
            h=h/3;
        }
    }







    public T[] changeToArray(MyLinkedList<T> myLinkedList){
        T[] t= (T[]) new Comparable[myLinkedList.getSize()];
        int i=0;
        while(myLinkedList.iterator().hasNext()){
            t[i++]=myLinkedList.iterator().next();
        }
       return t;
    }
}
