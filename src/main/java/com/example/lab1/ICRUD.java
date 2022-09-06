package com.example.lab1;

public interface ICRUD {
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}
