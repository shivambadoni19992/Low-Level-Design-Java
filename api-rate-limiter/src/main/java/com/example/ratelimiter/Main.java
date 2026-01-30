
package com.example.ratelimiter;

public class Main {
    public static void main(String[] args) {
        RateLimiter limiter = RateLimiterManager.getInstance().getLimiter("TOKEN");
        for (int i = 0; i < 10; i++) {
            System.out.println(limiter.allow());
        }
    }
}
