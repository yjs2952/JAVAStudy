package java3rd.ch14;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {

        // 2의 배수 검사
        IntPredicate intPredicateA = a -> a % 2 == 0;

        // 3의 배수 검사
        IntPredicate intPredicateB = a -> a % 3 == 0;

        IntPredicate predicateAB;
        boolean result;

        // and()
        predicateAB = intPredicateA.and(intPredicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니꽈? " + result);

        // or()
        predicateAB = intPredicateA.or(intPredicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2 혹은 3의 배수입니꽈? " + result);

        // negate
        predicateAB = intPredicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수 입니꽈? " + result);
    }
}
