package model;

import invoker.ApiException;

import java.util.ArrayList;

public class FinixList<E> extends ArrayList<E> {
    private final NextFetchFunction nextfetchFunction;
    private Object page;
    private Object links;
    private Boolean hasMore;

    public FinixList(NextFetchFunction nextfetchFunction, Boolean hasMore) {
        this.nextfetchFunction = nextfetchFunction;
        this.hasMore = hasMore;
    }

    public FinixList<E> listNext (long a) throws ApiException{
        return this.nextfetchFunction.listNextBase(a);
    }

    public Object getPage(){
        return page;
    }

    public void setPage (Object page){
        this.page = page;
    }

    public Object getLinks (){
        return links;
    }

    public void setLinks (Object links){
        this.links = links;
    }

    public Boolean getHasMore () throws ApiException{
        return hasMore;
    }
}