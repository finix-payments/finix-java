# Finix Java Library

This is the official Finix Java library

## Installation
### Prerequisites
- Java 1.8+
- Suggested: Your own API credentials.
    - The tests use the API credentials from our public documentaiton, but you will need your own credentials.

### Maven

Add the following to your project's pom.xml:
```
<dependency>
  <groupId>com.finix</groupId>
  <artifactId>finix-java</artifactId>
  <version>0.0.1</version>
</dependency>
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
## Supported APIs
- Transfers
- Authorizaitons
- Identities
- Merchants
- Balance Transfers
- Devices
- Disputes
- Files
- Settlements
- Webhooks
- Verifications