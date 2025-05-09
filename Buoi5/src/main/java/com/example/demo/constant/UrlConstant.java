package com.example.demo.constant;

public class UrlConstant {
    public static class User{
        public static final String PREFIX = "/user";
        public static final String GET_USERS = PREFIX + "s/r";
        public static final String GET_USER = PREFIX + "/r/{id}";
        public static final String CREATE_USER = PREFIX + "/c";
        public static final String DELETE_USER = PREFIX + "/d/{id}";
        public static final String UPDATE_USER = PREFIX + "/u/{id}";
    }

    public static class Department{
        public static final String PREFIX = "/department";
        public static final String GET_DEPARTMENTS = PREFIX + "s/r";
        public static final String GET_DEPARTMENT = PREFIX + "/r/{id}";
        public static final String DELETE_DEPARTMENT = PREFIX + "/d/{id}";
        public static final String CREATE_DEPARTMENT = PREFIX + "/c";
        public static final String UPDATE_DEPARTMENT = PREFIX + "/u/{id}";
    }
}
