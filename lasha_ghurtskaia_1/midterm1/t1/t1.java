package lasha_ghurtskaia_1.midterm1.t1;

import java.util.*;

public class t1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(10, 1, 9, 2, 5, 7, 6, 4, 8, 3));
        List<String> list2 = new ArrayList<>(List.of("iih", "kwy", "xmg", "ytr", "dky", "huw", "sqw", "yci", "pup", "gbl", "qbp", "wms"));
        List<String> list3 = new ArrayList<>(List.of());
        for (int i = 0; i< list1.size(); i++){
            list3.add(list2.get(list1.get(i)-1));
        }
        System.out.println(list3);
    }
}
