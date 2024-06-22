Logs: 
"C:\Program Files\Java\jdk-17\bin\java.exe" -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:52716,suspend=y,server=n "-javaagent:C:\Users\MAYURI~1\AppData\Local\Temp\captureAgent1jars\debugger-agent.jar" -Dfile.encoding=UTF-8 -classpath "C:\Projects\Spring\event\target\classes;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.3.1\spring-boot-starter-web-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot-starter\3.3.1\spring-boot-starter-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.3.1\spring-boot-starter-logging-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\ch\qos\logback\logback-classic\1.5.6\logback-classic-1.5.6.jar;C:\Users\Mayur Ingle\.m2\repository\ch\qos\logback\logback-core\1.5.6\logback-core-1.5.6.jar;C:\Users\Mayur Ingle\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.23.1\log4j-to-slf4j-2.23.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\apache\logging\log4j\log4j-api\2.23.1\log4j-api-2.23.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\slf4j\jul-to-slf4j\2.0.13\jul-to-slf4j-2.0.13.jar;C:\Users\Mayur Ingle\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\yaml\snakeyaml\2.2\snakeyaml-2.2.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.3.1\spring-boot-starter-json-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.1\jackson-databind-2.17.1.jar;C:\Users\Mayur Ingle\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.1\jackson-annotations-2.17.1.jar;C:\Users\Mayur Ingle\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.1\jackson-core-2.17.1.jar;C:\Users\Mayur Ingle\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.1\jackson-datatype-jdk8-2.17.1.jar;C:\Users\Mayur Ingle\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.1\jackson-datatype-jsr310-2.17.1.jar;C:\Users\Mayur Ingle\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.17.1\jackson-module-parameter-names-2.17.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.3.1\spring-boot-starter-tomcat-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.25\tomcat-embed-core-10.1.25.jar;C:\Users\Mayur Ingle\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.25\tomcat-embed-el-10.1.25.jar;C:\Users\Mayur Ingle\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.25\tomcat-embed-websocket-10.1.25.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-web\6.1.10\spring-web-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-beans\6.1.10\spring-beans-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\io\micrometer\micrometer-observation\1.13.1\micrometer-observation-1.13.1.jar;C:\Users\Mayur Ingle\.m2\repository\io\micrometer\micrometer-commons\1.13.1\micrometer-commons-1.13.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-webmvc\6.1.10\spring-webmvc-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-aop\6.1.10\spring-aop-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-context\6.1.10\spring-context-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-expression\6.1.10\spring-expression-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot-devtools\3.3.1\spring-boot-devtools-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot\3.3.1\spring-boot-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.3.1\spring-boot-autoconfigure-3.3.1.jar;C:\Users\Mayur Ingle\.m2\repository\org\slf4j\slf4j-api\2.0.13\slf4j-api-2.0.13.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-core\6.1.10\spring-core-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\org\springframework\spring-jcl\6.1.10\spring-jcl-6.1.10.jar;C:\Users\Mayur Ingle\.m2\repository\org\projectlombok\lombok\1.18.32\lombok-1.18.32.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.3\lib\idea_rt.jar" com.onurdesk.event.EventApplication
Connected to the target VM, address: '127.0.0.1:52716', transport: 'socket'

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.1)

2024-06-20T20:25:07.411+05:30  INFO 11924 --- [event] [  restartedMain] com.onurdesk.event.EventApplication      : Starting EventApplication using Java 17.0.11 with PID 11924 (C:\Projects\Spring\event\target\classes started by Mayur Ingle in C:\Projects\Spring\event)
2024-06-20T20:25:07.430+05:30  INFO 11924 --- [event] [  restartedMain] com.onurdesk.event.EventApplication      : No active profile set, falling back to 1 default profile: "default"
2024-06-20T20:25:07.578+05:30  INFO 11924 --- [event] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-06-20T20:25:07.579+05:30  INFO 11924 --- [event] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2024-06-20T20:25:09.712+05:30  INFO 11924 --- [event] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2024-06-20T20:25:09.737+05:30  INFO 11924 --- [event] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-06-20T20:25:09.738+05:30  INFO 11924 --- [event] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.25]
2024-06-20T20:25:09.849+05:30  INFO 11924 --- [event] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-06-20T20:25:09.852+05:30  INFO 11924 --- [event] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2270 ms
2024-06-20T20:25:10.591+05:30  INFO 11924 --- [event] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-06-20T20:25:10.696+05:30  INFO 11924 --- [event] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2024-06-20T20:25:10.732+05:30  INFO 11924 --- [event] [  restartedMain] com.onurdesk.event.EventApplication      : Started EventApplication in 4.079 seconds (process running for 5.124)
2024-06-20T20:25:25.814+05:30  INFO 11924 --- [event] [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2024-06-20T20:25:25.814+05:30  INFO 11924 --- [event] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2024-06-20T20:25:25.816+05:30  INFO 11924 --- [event] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2024-06-20T20:25:26.019+05:30  INFO 11924 --- [event] [nio-8080-exec-1] c.o.event.service.DischargeService       : patient discharge process started TestName
CheckOutHandler : Finalizing bill for patient 12345 : http-nio-8080-exec-1
2024-06-20T20:25:26.029+05:30  INFO 11924 --- [event] [nio-8080-exec-1] c.o.event.service.DischargeService       : patient discharge process completed TestName


### For Testing

`curl --location 'http://localhost:8080/discharge/process' \
--header 'Content-Type: application/json' \
--data '{
"patientId": "12345",
"patientName": "TestName"
}'`