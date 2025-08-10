package com.java8.streams.terminal.reduction.reduce;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMethodThree
{
    public static void main(String[] args) {
        List<String>list=List.of("shubham","Pandit","Puri");

        Integer sum1 = list.stream()
                .reduce(0, (a, b) -> a + b.length(),(a,b)->0);
        System.out.println(sum1);
        List<Integer>nums=List.of(1,2,3,4,5,6,7,8,9,10);
        String reduce = nums.stream()
                .reduce("", (a, b) -> a +","+ b, (c, d) -> c + d);
        System.out.println(reduce);

    }
}
