package model;

import api.TransfersApi;
import invoker.ApiException;
import invoker.Configuration;
import invoker.FinixClient;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class FinixList {

    private FinixClient localVarFinixClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FinixList() {
        this(Configuration.getDefaultFinixClient());
    }

    public FinixList(FinixClient finixClient) {
        this.localVarFinixClient = finixClient;
    }

    public FinixClient getFinixClient() {
        return localVarFinixClient;
    }

    public void setFinixClient(FinixClient finixClient) {
        this.localVarFinixClient = finixClient;
    }
    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    String sort = null;
    Integer offset = null;
    Integer limit = 20;
    Integer amount = null;
    Integer amountGte = null;
    Integer amountGt = null;
    Integer amountLte = null;
    Integer amountLt = null;
    String createdAtGte = null;
    String createdAtLte = null;
    String idempotencyId = null;
    String id = null;
    String state = null;
    String readyToSettleAtGte = null;
    String readyToSettleAtLte = null;
    Integer statementDescriptor = null;
    String traceId = null;
    String updatedAtGte = null;
    String updatedAtLte = null;
    String instrumentBin = null;
    String instrumentAccountLast4 = null;
    String instrumentBrandType = null;
    String merchantIdentityId = null;
    String merchantIdentityName = null;
    String instrumentName = null;
    String instrumentType = null;
    String merchantId = null;
    String merchantMid = null;
    String instrumentCardLast4 = null;
    String merchantProcessorId = null;
    String type = null;
    /*@Override
    public Transfer get(String transferId) throws ApiException {
        return super.get(transferId);
    }*/


    public List<Transfer> list() throws ApiException {
        List<Transfer> transferList = (List<Transfer>) localVarFinixClient.Transfers.list(sort, offset, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type);
        return transferList;
    }

    public TransfersList listNext() throws ApiException {
        this.offset = this.limit;
        this.limit +=20;
        TransfersList transferList = localVarFinixClient.Transfers.list(sort, offset, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type);
        return transferList;
    }

    public TransfersList listNext(Integer limit) throws ApiException {
        this.limit +=limit;
        TransfersList transferList = localVarFinixClient.Transfers.list(sort, offset, limit, amount, amountGte, amountGt, amountLte, amountLt, createdAtGte, createdAtLte, idempotencyId, id, state, readyToSettleAtGte, readyToSettleAtLte, statementDescriptor, traceId, updatedAtGte, updatedAtLte, instrumentBin, instrumentAccountLast4, instrumentBrandType, merchantIdentityId, merchantIdentityName, instrumentName, instrumentType, merchantId, merchantMid, instrumentCardLast4, merchantProcessorId, type);
        return transferList;
    }


}
