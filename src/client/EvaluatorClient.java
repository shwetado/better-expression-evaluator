package client;

import evaluator.Parser;

public class EvaluatorClient {
    public static void main(String[] args) throws Exception {
        System.out.println(new Parser().parse(args[0]).getValue());
    }
}
