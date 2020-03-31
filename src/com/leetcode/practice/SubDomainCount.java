package com.leetcode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainCount {

    private static Map<String,Integer> vistedDomains = new HashMap<>();

    public static void main(String[] args) {

        String[] str = {"10 alamala.hareesh.com","10 hareesh.com"};

        System.out.println(new SubDomainCount().subdomainVisits(str));
    }

    public List<String> subdomainVisits(String[] cpdomains) {

        vistedDomains.clear();

        for (String domain: cpdomains) {
            int index = domain.indexOf(" ");
            int visited = Integer.parseInt(domain.substring(0,index));
            countSubDomains(visited,domain.substring(index).trim());
        }

        List<String> result = new ArrayList<>();

        for (String key: vistedDomains.keySet()) {

            result.add(vistedDomains.get(key)+" "+key);
        }

        return result;


    }
    private void countSubDomains(int visitCount, String domain) {

        vistedDomains.put(domain,vistedDomains.getOrDefault(domain,0)+visitCount);

        int index = 0;

        while ( (index = (domain.indexOf(".",index+1))) >= 0) {
            String subDomain = domain.substring(index+1);
            System.out.println(subDomain+"<---"+vistedDomains);

            vistedDomains.put(subDomain,vistedDomains.getOrDefault(subDomain,0)+visitCount);
        }


    }
}
