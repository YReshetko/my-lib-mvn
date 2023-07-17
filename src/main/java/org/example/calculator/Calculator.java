package org.example.calculator;

import java.util.List;

public class Calculator {

    public long sum(List<Countable> countable) {
        return countable.stream().map(Countable::count).map(a -> a + 1).mapToLong(Long::valueOf).sum();
    }
}
