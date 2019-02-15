package study.ch05;

import lambdasinaction.chap5.Trader;
import lambdasinaction.chap5.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P5 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> list1 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(list1.toString());

        List<String> list2 = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list2.toString());

        List<Trader> list3 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println(list3.toString());

        List<String> list4 = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list4.toString());

        System.out.println(transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t -> t.getCity().equals("Milan")));

        List<Integer> list5 = transactions.stream()
                .filter(t-> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        System.out.println(list5.toString());

        System.out.println(transactions.stream().max(Comparator.comparing(Transaction::getValue)));
        System.out.println(transactions.stream().min(Comparator.comparing(Transaction::getValue)));
    }
}
