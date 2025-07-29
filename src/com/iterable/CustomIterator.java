package com.iterable;

import java.util.Iterator;

public class CustomIterator implements Iterable<Integer>
{
    private Integer []array={1,2,3,4,5,6,7,8,9,10};

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Integer next() {
                return array[index++];
            }
        };
    }
}
class Demo
{
    public static void main(String[] args) {
        CustomIterator iter = new CustomIterator();
        for(int a:iter)
        {
            System.out.println(a);
        }
    }
}
