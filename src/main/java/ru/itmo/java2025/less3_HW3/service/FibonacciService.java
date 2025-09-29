package ru.itmo.java2025.less3_HW3.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itmo.java2025.less3_HW3.resources.AppResources;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@Service
public class FibonacciService {

    private final Map<Integer, BigInteger> cache;
    private final AppResources appResources;

    public FibonacciService(AppResources appResources) {
        this.appResources = appResources;
        this.cache = new ConcurrentHashMap<>();

        cache.put(0, BigInteger.ZERO);
        cache.put(1, BigInteger.ONE);
    }

    public BigInteger getFibonacci(int n) {

        if (appResources.isCacheEnabled() && cache.containsKey(n)) {
            System.out.println("Найдено в кэше n = " + n);
            return cache.get(n);
        }

        BigInteger result = null;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = a.add(b);
            a = b;
            b = result;
        }

        if (appResources.isCacheEnabled()) {
            cache.put(n, result);
        }

        return result;
    }
}
