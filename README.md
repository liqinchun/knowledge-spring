##spring核心组件
core和beans模块是框架的基础部分,提供ioc控制反转和依赖抓如特性。  
**core**  
主要包含了spring框架基本的核心工具类，spring的其他组件都要用到这个包里的类，core模块是其他组件的基本核心。  
**beans**  
包含访问配置文件、创建和管理bean以及进行ioc和di操作相关的所有类。  
**context**  

**expression**  

ioc
@Configuration
以springboot为例：  
springboot的启动类
```
@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
public class KnowledgeSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnowledgeSpringApplication.class, args);
	}
}
```
点击注解@SpringBootApplication
```
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
public @interface SpringBootApplication
```
点击注解@SpringBootConfiguration
```
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
public @interface SpringBootConfiguration {
    @AliasFor(
        annotation = Configuration.class
    )
    boolean proxyBeanMethods() default true;
}
```
看到了注解@SpringBootConfiguration上标注注解@Configuration
点击注解@Configuration
```
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {
    @AliasFor(
        annotation = Component.class
    )
    String value() default "";

    boolean proxyBeanMethods() default true;
}

```
注解@Configuration上标注了@Component  

以上可以看到springboot的启动类也是一个配置类  

读取配置类  
aop
事务
spring 容器继承图
  
bean的生命周期
bean的创建---活动(初始化、从事容器内的活动)---销毁

读取配置文件的内容  
1.通过springboot注解@ConfigurationProperties、@ConfigurationPropertiesScan  
2.@Value、@PropertySource注解

