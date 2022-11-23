package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return list -> {
            for (String str : list) {
                if (str.charAt(0) > 'A' && str.charAt(0) < 'Z') {
                    return true;
                } else return false;
            }
            return false;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return list -> {
            for(int i=0; i< list.size(); i++){
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
            };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> aaa = new ArrayList<>();
            for (String str : values) {
                String[] strArr = str.split(" ");
                if (str.charAt(0) > 'A' && str.charAt(0) < 'Z' &&
                        str.charAt(str.length() - 1) == '.' && strArr.length > 3) {
                    aaa.add(str);
                }
            }
            return aaa;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return list -> {
            Map<String, Integer> map = new HashMap<>();
            for (String str : list) {
                map.put(str, str.length());
            }
            return map;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> list3 = new ArrayList<>(list1);
            list3.addAll(list2);
            return list3;
        };
    }
}
