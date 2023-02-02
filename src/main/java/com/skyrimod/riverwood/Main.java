package com.skyrimod.riverwood;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       Long start = 1645977600000L;
       Long now = 1659628799000L;

       long time = now - start;

       System.out.println(time/1000/60/60/24);
    }

    private void testMergeList(){
        Random random = new Random();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        initData(listA, listB);
        System.out.printf("listA size: %d, list=%s\n", listA.size(), listA);
        System.out.printf("listB size: %d, list=%s\n", listB.size(), listB);

        mergeList(listA, listB, listC);

        System.out.printf("listC size: %d, list=%s", listC.size(), listC);
    }

    private static void mergeList(List<Integer> listA, List<Integer> listB, List<Integer> listC) {
        // 合并a，b到c
        int i=0, j=0;
        while (i<listA.size() && j<listB.size()){
            int a = listA.get(i);
            int b = listB.get(j);
            if (a <= b){
                listC.add(a);
                i++;
            }else {
                listC.add(b);
                j++;
            }
        }

        if (i<listA.size()){
            listC.addAll(listA.subList(i, listA.size()));
        }

        if (j<listB.size()){
            listC.addAll(listB.subList(j, listB.size()));
        }
    }

    private static void initData(List<Integer> a, List<Integer> b) {
        Random random = new Random();
        int aSize = random.nextInt(20);
        for (int i = 0; i < aSize; i++) {
            a.add(random.nextInt(10));
        }

        int bSize = random.nextInt(20);
        for (int i = 0; i < bSize; i++) {
            b.add(random.nextInt(10));
        }

        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());
    }
}
