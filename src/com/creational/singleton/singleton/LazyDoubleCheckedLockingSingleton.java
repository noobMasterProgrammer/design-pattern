package com.creational.singleton.singleton;

public class LazyDoubleCheckedLockingSingleton {

    private static volatile LazyDoubleCheckedLockingSingleton instance;

    /** private constructor to prevent others from instantiating this class */
    private LazyDoubleCheckedLockingSingleton() {}

    /** Lazily initialize the singleton in a synchronized block */
    public static LazyDoubleCheckedLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (LazyDoubleCheckedLockingSingleton.class) {
                if(instance == null) {
                    instance = new LazyDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}