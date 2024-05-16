package dev.langchain4j.model.output;

import java.math.BigInteger;
import java.util.Set;

import static dev.langchain4j.internal.Utils.setOf;

public class BigIntegerOutputParser implements TextOutputParser<BigInteger> {
    @Override
    public Set<Class<?>> getSupportedTypes() {
        return setOf(BigInteger.class);
    }

    @Override
    public BigInteger parse(String string) {
        return new BigInteger(string);
    }

    @Override
    public String formatInstructions() {
        return "integer number";
    }
}
