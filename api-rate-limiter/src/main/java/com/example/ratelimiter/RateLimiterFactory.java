
package com.example.ratelimiter;

public class RateLimiterFactory {
    public static RateLimiter create(String type) {
        return new TokenBucketLimiter();
    }
}
