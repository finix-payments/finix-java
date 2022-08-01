openapi-generator generate \
  --enable-post-process-file \
  -g java \
  --library okhttp-gson \
  -i finix-java/finix-java.yaml \
  -t finix-java/template \
  -o testgen3  \
  -p groupId=com.finix \
  --additional-properties=artifactId=finix-java \
  --additional-properties=artifactVersion=0.0.1 \
  --additional-properties=url=0.0.1-SNAPSHOT \
  --additional-properties=enumUnknownDefaultCase=true \
  --additional-properties=hideGenerationTimestamp=true \
  --global-property skipFormModel=false \
  \
  --global-property httpUserAgent=finix-java/0.0.1 \
  --global-property modelTests=false,modelDocs=false \
  --global-property apiDocs=false \
  --global-property debugOpenAPI=true \
  --skip-validate-spec \
  --type-mappings=integer=Long,int=Long \
  \
  -p invokerPackage=invoker \
  -p apiPackage=api \
  -p modelPackage=model \
  \
  -p additionalModelTypeAnnotations=@lombok.Builder@lombok.AllArgsConstructor \
  \
  -p sourceFolder=src/main/java \
  \
  -p dateLibrary=java8 \
  -p java8=true

# Remove OPEN_API from default enum capture.
find ./src/main/java \( ! -regex '.*/\..*' \) -type f | xargs sed -i '' 's/UNKNOWN_DEFAULT_OPEN_API/UNKNOWN_DEFAULT/g'
mv ./src/main/java/invoker/ApiClient.java ./src/main/java/invoker/FinixClient.java
rm .travis.yml
rm git_push.sh
#rm -r .idea
#rm -r gen

