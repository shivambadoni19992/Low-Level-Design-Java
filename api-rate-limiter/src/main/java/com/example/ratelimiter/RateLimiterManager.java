
package com.example.ratelimiter;

public class RateLimiterManager {
    private static final RateLimiterManager INSTANCE = new RateLimiterManager();
    private RateLimiterManager() {}

    public static RateLimiterManager getInstance() {
        return INSTANCE;
    }

    public RateLimiter getLimiter(String type) {
        return RateLimiterFactory.create(type);
    }
}
