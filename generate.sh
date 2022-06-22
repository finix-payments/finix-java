openapi-generator generate \
  --enable-post-process-file \
  -g java \
  --library okhttp-gson \
  -i finix-java.yaml \
  -t template \
  -o ${PWD} \
  -p groupId=com.finix \
  --additional-properties=artifactId=finix-java \
  --additional-properties=artifactVersion=0.0.1 \
  --additional-properties=url=0.0.1-SNAPSHOT \
  --global-property skipFormModel=false \
  \
  --global-property generateApiTests=true \
  --global-property generateModelTests=true \
  --global-property httpUserAgent=finix-java/0.0.1 \
  --global-property model,modelDocs=false \
  --global-property api,apiDocs=false \
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

mv ./src/main/java/invoker/ApiClient.java ./src/main/java/invoker/FinixClient.java
rm .travis.yml
rm README.md
rm git_push.sh
rm -r .idea
rm -r gen

