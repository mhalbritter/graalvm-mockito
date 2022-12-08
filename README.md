# Mockito in GraalVM native image

## Execute tests

```
./gradlew test
```

## Execute tests in native-image

```
./gradlew nativeTest
```

## FAQ

### Where's the metadata for Mockito coming from?

Collected with the agent by running the tests:

```
./gradlew test -Pagent
./gradlew metadataCopy
```
