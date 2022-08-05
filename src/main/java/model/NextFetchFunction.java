package model;

import invoker.ApiException;

import java.lang.reflect.InvocationTargetException;

public interface NextFetchFunction {
    public FinixList listNextBase(long a) throws ApiException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException;
}