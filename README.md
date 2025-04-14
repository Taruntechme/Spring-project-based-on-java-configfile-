

## ☕ Java-Based Spring Configuration (No XML)

Instead of using traditional `applicationContext.xml`, this project also demonstrates **Java-based Spring configuration** using `@Configuration` and `@Bean` annotations.

### ✅ Key Advantages:
- No need for external XML files
- Type-safe and refactor-friendly
- Cleaner and easier to manage configuration

### 📄 Java Config Class

```java
@Configuration
public class SpringConfigFile {

    // Define a Student bean with a custom bean name
    @Bean("beanObj")
    public Student stdId() {
        Student std = new Student();
        std.setName("Kamal");
        std.setEmail("kamal@gmail.com");
        std.setRollno(103);
        return std;
    }

    @Bean("beanObj2")
    public Student stdId2() {
        Student std2 = new Student();
        std2.setName("Lalit");
        std2.setEmail("lalit@gmail.com");
        std2.setRollno(104);
        return std2;
    }
}
```

### 🔍 Explanation:
- `@Configuration` marks this class as a source of bean definitions.
- `@Bean("beanObj")` registers a bean with the name `"beanObj"` and defines it as a `Student` instance.
- Unlike XML where you define bean `id` and `class`, here:
  - Method name becomes the default bean ID (can be overridden with `@Bean("customName")`)
  - Method return type becomes the bean type

### 🧠 How to Use It

Replace XML loading in your `Main.java` with Java-based context:

```java
ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
Student std = (Student) context.getBean("beanObj");
std.display();
```

This will fetch the bean defined in `SpringConfigFile` without using any XML.


