Logs: 

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
