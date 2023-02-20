# @ConfigurationProperties on @Bean does not expose all properties #34309

Compile and run you will see `@ConfigurationProperties` set both fields on the `@Bean`.

[SpringBoot34309Application.java](https://github.com/ciis0/spring-boot-34309/blob/fd498ed2cdd8815de80484ff8abb1561d3c49632/src/main/java/de/ciis0/reproducer/springboot34309/SpringBoot34309Application.java#L23-L27)

Check `target/classes/META-INF/spring-configuration-metadata.json` you will see only the property with the getter appears there, but not the property with just a setter.