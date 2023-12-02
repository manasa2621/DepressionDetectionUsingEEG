package com.example.newcode;

import java.util.Collection;
import java.util.List;

public class BayesClassifier<T, T1> {
    public Collection<Classification<T1, T1>> classifyDetailed(List<T1> asList) {
        return (Collection<Classification<T1, T1>>) asList;
    }

    public void learn(T1 categoryPositive, List<T1> asList) {
    }
}
