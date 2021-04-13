package com.example.my_graduation.controler;
import com.example.my_graduation.controler.Apriori;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestApriori {
    public static void main(String[] args) {
        Apriori apriori = new Apriori(Arrays.asList("A、C、D","B、C、E","A、B、C、E","B、E"));
        Map<List<String>,Integer> frequentCollectionMap = apriori.getFC();
        System.out.println("-------------频繁集"+"----------------");
        for(List<String> list : frequentCollectionMap.keySet()) System.out.println(list+ "\t"+ frequentCollectionMap.get(list));

        Map<String,Double> relationRulesMap = apriori.getRelationRules(frequentCollectionMap);
        System.out.println("-----------关联规则"+"----------------");
        for (String s : relationRulesMap.keySet()) System.out.println(s+"\t"+relationRulesMap.get(s));
        String a="1";
        System.out.println(a);

        int x=6;
        int y=8;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+""+y);
        Integer a1=100,b=100,c=150,d=150;
        System.out.println(a1==b);
        System.out.println(c==d);

    }
}
