package com.anguigu.boot;

//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//指定扫描包的两种方式
//1、@SpringBootApplication(scanBasePackages = "")
//2、注释掉@SpringBootApplication，指定默认扫描路径
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("")
@MapperScan(basePackages = "com.anguigu.boot.batis")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //SpringApplication.run(MainApplication.class, args);
        //1、返回ioc容器
        ConfigurableApplicationContext run =  SpringApplication.run(MainApplication.class, args);
        //2、查看容器内的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
        boolean haha = run.containsBean("haha");
        System.out.println("haha" + haha);
        boolean hehe = run.containsBean("hehe");
        System.out.println("hehe" +hehe);
        //从容器中获取组件
//        Pet pet01 = run.getBean("aa", Pet.class);
//        Pet pet02 = run.getBean("aa", Pet.class);
//        System.out.println(pet01 == pet02);
//        MyConfig config = run.getBean(MyConfig.class);
//        System.out.println(config);
//        //如果@Configuration(proxyBeanMethods = true) 代理对象调用方法，SpringBoot总会检查这个组件是否在容器中有，保持组件单实例
//        User user01 = config.user01();
//        User user02 = config.user01();
//        System.out.println("用户的宠物:" + (user01.getPet() == pet01));
//
//        DBHelper db = run.getBean(DBHelper.class);
//        System.out.println(db);
//        boolean tom = run.containsBean("tom");
//        System.out.println("容器中Tom组件："+tom);
//
//        boolean user01 = run.containsBean("user01");
//        System.out.println("容器中user01组件："+user01);
//
//        boolean tom22 = run.containsBean("tom22");
//        System.out.println("容器中tom22组件："+tom22);
    }
}

