package by.lepnikau.philosophy.of.java.chapter09.apply.implement;

public class StringManipulator implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        String inputStr = (String) input;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < inputStr.length(); i += 2) {
            if (i <= inputStr.length() - 1) {
                result.append(inputStr.charAt(i));
                result.append(inputStr.charAt(i - 1));
            }
        }

        return result.toString();
    }
}
