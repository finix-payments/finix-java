package model;

import invoker.ApiException;

import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("rawtypes")
public interface NextFetchFunction {
    public FinixList listNextBase(long a) throws ApiException;
}