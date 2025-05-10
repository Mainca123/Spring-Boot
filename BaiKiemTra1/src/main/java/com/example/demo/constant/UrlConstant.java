package com.example.demo.constant;

public class UrlConstant {
    public static class Book{
        public static final String PREFIX = "books";
        public static final String GET_ALL_BOOK = PREFIX;
        public static final String GET_BOOK_BY_ID = PREFIX + "/{id}";
        public static final String CREATE_BOOK = PREFIX;
        public static final String DELETE_BOOK_BY_ID = PREFIX + "/{id}";
        public static final String GET_BOOK_BY_AUTHER_ID = PREFIX + "/id";
        public static final String GET_BOOK_BY_CATEGORY_ID = PREFIX + "/id";
        public static final String UPDATE_BOOK = PREFIX + "/id";
    }
}
