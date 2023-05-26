package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return e -> {
            List<Integer> resultList = new ArrayList<>();
            for (var i : e) {
                resultList.add(i / divider);
            }
            return resultList;
        };
    }
}
