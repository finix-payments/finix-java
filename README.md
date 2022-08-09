# Finix Java Library

This is the official Finix Java library

## Installation
### Prerequisites
- Java 1.8+
- Suggested: Your own API credentials.
    - The tests use the API credentials from our public documentation, but you will need your own credentials.

### Maven

Add the following to your project's pom.xml:
```
<dependency>
  <groupId>com.finix</groupId>
  <artifactId>finix-java</artifactId>
  <version>0.0.1</version>
</dependency>
```

### Gradle

Add the following to your project's build.gradle
```
implementation 'com.finix:finix-java:0.0.1'
```

## Using the Library
### Initialization
Provide your api username and password as well as the environment you are interacting with.
```java
finixClient= new FinixClient("USsRhsHYZGBPnQw8CByJyEQW","8a14c2f9-d94b-4c72-8f5c-a62908e5b30e", Environment.SANDBOX);
```

### Example API
Here is an example creating a Transfer:
```java 
CreateTransferRequest createTransferRequest = CreateTransferRequest
    .builder()
        .source("PIe2YvpcjvoVJ6PzoRPBK137")
        .merchant("MUeDVrf2ahuKc9Eg5TeZugvs")
        .tags(Map.of("order_number", "21DFASJSAKAS"))
        .currency(Currency.USD)
        .amount(100L)
        .processor("DUMMY_V1")
    .build();
Transfer transfer = finixClient.Transfers.create(createTransferRequest);
```

### Downloading Files
Our Instrument Updates API and Files API allow you to download a file. These downloaded files are saved in Java's default generated temporary folder path.

You can specify your own folder path with the following:

```java 
finixClient.setTempFolderPath('/path/to/tempfolder')
```

### Retrieving List 
finixList serves as the return type for all functions that involve retrieving a list. Here is an example of retrieving a list of transfers, and a demonstration of the properties of finixList.

```java 
// Retrieving a list of all transfers 
FinixList<Transfer> transfersList = finixClient.Transfers.list(ListTransfersQueryParams.
        builder()
        .build());

// Accessing transfers in the list and print out value
for (Transfer t : transfersList){
  System.out.println(t);
}

// Get the size of the current list
int transferListSize = transfersList.size();

// Get the page object that contains properties including offset/nextCursor, limit.
// Note: refer to the specific api to see if the page object associated is of type pageCursor or pageOffset
PageCursor pageObject = (PageCursor) transfersList.getPage();

// Get the links 
Object pageLinks = transfersList.getLinks();

// Check if there is more to list, value equals to false if end of list has been reached 
Boolean hasMore = transfersList.getHasMore();

// Get the next list with limit 
limit = 5L
FinixList<Transfer> nextList = transfersList.listNext(limit);
```

### Exception Handling
Exceptions can be handled with try-catch blocks. Here is an example of catching an exception and accessing its information.

```java 
try {
    String userName = "USpumes23XhzHwXqiy9bfX2B";
    String wrongPassword = "123123";
    FinixClient invalidClient= new FinixClient(userName,wrongPassword, Environment.SANDBOX);
    Long limit = 20L;
    FinixList<FeeProfile> feeProfilesList = invalidClient.FeeProfiles.list(ListFeeProfilesQueryParams.builder()
    .limit(limit)
    .build());
} catch (Exception genericError) {
    if (genericError instanceof ApiException){
        ApiException e = (ApiException) genericError;
        
        // Print basic http information of the error
        System.err.println("Status code: " + e.getCode());
        System.err.println("Response headers: " + e.getResponseHeaders());

        // Print message of each error 
        for (HashMap<String, String> thisError : error.getBody() ){
            System.err.println(thisError.get("message"));
        }
          
        // Access raw http incoming message of the error 
        System.err.println(e.getResponseBody());
    }
}

```

## Supported APIs
- Transfers
- Authorizaitons
- Identities
- Merchants
- Payment Instruments
- Instrument Updates
- Balance Transfers
- Devices
- Disputes
- Files
- Settlements
- Webhooks
- Verifications
- Merchant Profiles
- Fee Profiles
