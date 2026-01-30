
package com.example.ratelimiter;

public class TokenBucketLimiter implements RateLimiter {
    private int tokens = 5;
    private final int capacity = 5;

    @Override
    public synchronized boolean allow() {
        if (tokens > 0) {
            tokens--;
            return true;
        }
        return false;
    }
}
