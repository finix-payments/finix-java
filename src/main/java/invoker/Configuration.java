/*
 * Finix API
 */


package invoker;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Configuration {
    private static FinixClient defaultFinixClient = new FinixClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static FinixClient getDefaultFinixClient() {
        return defaultFinixClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param finixClient API client
     */
    public static void setDefaultFinixClient(FinixClient finixClient) {
        defaultFinixClient = finixClient;
    }
}
