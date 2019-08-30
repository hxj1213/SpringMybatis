package com.hxj.reflattest;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @ author 黑潇君
 * 东软睿道西安TTC
 */
public class AppTest {

    @Test
    public void test01()throws Exception{

        //如何获取一个类的字节码文件对象
        /*Class clazz1 = User.class;
        System.out.println(clazz1);
        User user = new User();
        user.name = "";
        Class clazz2 = user.getClass();
        System.out.println(clazz2);*/

        Class<?> aClass = Class.forName("com.hxj.domain.User");
        System.out.println(aClass);

        Object user = aClass.newInstance();
        System.out.println(user);

        //怎样通过字节码文件对象获取一个类的属性
        Field nameFiled = aClass.getField("name");
        //public String name;

        int modifiers = nameFiled.getModifiers();
        System.out.println(modifiers);
        System.out.println("修饰符："+ Modifier.toString(modifiers));
        Class<?> nameFiledType = nameFiled.getType();
        System.out.println("类型："+nameFiledType);
        nameFiled.set(user,"张三");

        System.out.println(user);

//        aClass.getFields()    获取所有的属性对象
        Field moneyField = aClass.getDeclaredField("money");
        System.out.println(moneyField);
        moneyField.setAccessible(true);
        moneyField.set(user,1000);

        System.out.println(user);


        Constructor<?> constructor =  aClass.getConstructor();
        System.out.println(constructor);
        Object obj = constructor.newInstance();
        System.out.println(obj);

        Constructor<?> constructor1 = aClass.getConstructor(int.class);
        Object obj1 = constructor1.newInstance(34);//   new User(34)
        System.out.println(obj1);

//      构造对象  aClass.getDeclaredConstructor(参数类型)
        //使用构造对象创建对象   constructor1.newInstance(参数值);

//        constructor1.getModifiers()
//        constructor1.getName()

        Method method = aClass.getMethod("gotoWork");
        System.out.println(method);
        Class<?> returnType = method.getReturnType();
        System.out.println(returnType);
//        method.getParameterCount()
//        method.getParameterTypes()

        Object invoke = method.invoke(obj1);
        System.out.println(invoke);

        Method login = aClass.getDeclaredMethod("login", String.class, String.class);
        login.setAccessible(true);
        Object zhangsan = login.invoke(obj1, "zhangsan", "123");
        System.out.println(zhangsan);
    }

}
