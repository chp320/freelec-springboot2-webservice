# freelec-springboot2-webservice
1. HelloControllerTest.java 오류 로그

Testing started at 오전 2:16 ...
Starting Gradle Daemon...
Gradle Daemon started in 4 s 82 ms
> Task :cleanTest UP-TO-DATE
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava
C:\Users\KBS\IdeaProjects\springBoot-AWS\src\test\java\com\skyfox83\study\springBoot\web\HelloControllerTest.java:10: error: cannot find symbol
import static org.hamcrest.Matcher.is ;
^
  symbol:   static is
  location: interface Matcher
C:\Users\KBS\IdeaProjects\springBoot-AWS\src\test\java\com\skyfox83\study\springBoot\web\HelloControllerTest.java:45: error: cannot find symbol
                .andExpect(jsonPath("$.name", is(name)))
                                              ^
  symbol:   method is(String)
  location: class HelloControllerTest
C:\Users\KBS\IdeaProjects\springBoot-AWS\src\test\java\com\skyfox83\study\springBoot\web\HelloControllerTest.java:46: error: cannot find symbol
                .andExpect(jsonPath("$.amount", is(amount))) ;
                                                ^
  symbol:   method is(int)
  location: class HelloControllerTest
3 errors
> Task :compileTestJava FAILED
FAILURE: Build failed with an exception.
* What went wrong:
Execution failed for task ':compileTestJava'.
> Compilation failed; see the compiler error output for details.
* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.
* Get more help at https://help.gradle.org
Deprecated Gradle features were used in this build, making it incompatible with Gradle 5.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/4.10.2/userguide/command_line_interface.html#sec:command_line_warnings
BUILD FAILED in 16s
3 actionable tasks: 1 executed, 2 up-to-date
