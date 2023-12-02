package com.example.newcode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NaiveBayes {

    private static final double EPSILON = 0.001;
    private static final String CATEGORY_NEGATIVE = "negative";
    private static final String CATEGORY_POSITIVE = "positive";
    private Classifier<String, String> bayes;

    public void DataClassificationInDetails() {

        final String[] unknownText1 = "Normal".split("\\s");

        Object bayes = null;
        Collection<Classification<String, String>> classifications = ((BayesClassifier<String, String>) bayes)
                .classifyDetailed(Arrays.asList(unknownText1));

        List<Classification<String, String>> list = new ArrayList<Classification<String, String>>(classifications);

    }

    public void testSerialization() throws IOException {

        Object bayes = null;
        new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(bayes);
    }

    public void setUp() {
        /*
         * Create a new classifier instance. The context features are Strings
         * and the context will be classified with a String according to the
         * featureset of the context.
         */
        BayesClassifier<String, String> bayes = new BayesClassifier<String, String>();

        /*
         * The classifier can learn from classifications that are handed over to
         * the learn methods. Imagin a tokenized text as follows. The tokens are
         * the text's features. The category of the text will either be positive
         * or negative.
         */
        final String[] positiveText = "Yes".split("\\s");
        bayes.learn(CATEGORY_POSITIVE, Arrays.asList(positiveText));

        final String[] negativeText = "No".split("\\s");
        bayes.learn(CATEGORY_NEGATIVE, Arrays.asList(negativeText));
    }

    public void testStringClassification() {
        final String[] unknownText1 = "Normal".split("\\s");
        final String[] unknownText2 = "Stage 1".split("\\s");
        final String[] unknownText3 = "Stage 2".split("\\s");
        final String[] unknownText4 = "Stage 3".split("\\s");
        final String[] unknownText5 = "Stage 4".split("\\s");

    }
}
