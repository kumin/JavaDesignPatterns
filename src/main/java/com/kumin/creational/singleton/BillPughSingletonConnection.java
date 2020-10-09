package com.kumin.creational.singleton;

public class BillPughSingletonConnection {
    private BillPughSingletonConnection() {

    }

    public static BillPughSingletonConnection getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingletonConnection INSTANCE = new BillPughSingletonConnection();
    }
}
