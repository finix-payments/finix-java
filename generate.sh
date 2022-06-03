openapi-generator generate \
  -g java \
  --library okhttp-gson \
  -i finix-java-old.yaml \
  -t template \
  -o ${PWD} \
  -p groupId=com.finix \
  --additional-properties=artifactId=finix-java \
  --additional-properties=artifactVersion=0.0.1 \
  --additional-properties=url=1.0.0-SNAPSHOT \
  --global-property skipFormModel=false \
  \
  --global-property generateApiTests=true \
  --global-property generateModelTests=true \
  --global-property httpUserAgent=finix-java/0.0.1 \
  --global-property model,modelDocs=false \
  --global-property api,apiDocs=false \
  --skip-validate-spec \
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

