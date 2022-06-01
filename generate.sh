openapi-generator generate \
  -g java \
  --library okhttp-gson \
  -i finix-java.yaml \
  -t template/java \
  -o ${PWD} \
  -p groupId=com.finix \
  --additional-properties=artifactId=finix-java \
  --additional-properties=artifactVersion=1.0.0-SNAPSHOT \
  --additional-properties=url=1.0.0-SNAPSHOT \
  --global-property skipFormModel=false \
  \
  --global-property generateApiTests=true \
  --global-property generateModelTests=true \
  --global-property apiDocs=false \
  --skip-validate-spec \
  \
 -p invokerPackage=invoker \
  -p apiPackage=api \
  -p modelPackage=model \
  \
  -p sourceFolder=src/main/java \
  \
  -p dateLibrary=java8 \
  -p java8=true
mv ./src/main/java/invoker/ApiClient.java ./src/main/java/invoker/FinixClient.java