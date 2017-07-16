package com.susie.stanley.interview;

import org.junit.Test;

public class ClassLoaderPathTest {
	
	/**
	 * 
	 */
	@Test
	public void testVerbose(){
		System.out.print("hello world!");
	}

	/**
	 * 1、Bootstrap Classloader (C++) -Xbootclasspath <br>
	 * 2、Extention Classloader -Djava.ext.dir <br>
	 * 3、Application\System Classloader -Djava.class.path
	 */
	@Test
	public void testClassLoader() {
		/**
		 * /Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/resources.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/rt.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/sunrsasign.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jsse.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jce.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/charsets.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/jfr.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/classes
		 * */
		System.out.println(System.getProperty("sun.boot.class.path"));
		
		/**
		 * sun.misc.Launcher$ExtClassLoader
		 * /Users/lu/Library/Java/Extensions
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/lib/ext
		 * :/Library/Java/Extensions
		 * :/Network/Library/Java/Extensions
		 * :/System/Library/Java/Extensions
		 * :/usr/lib/java
		 * */
		System.out.println(System.getProperty("java.ext.dirs"));
		
		/**
		 * sun.misc.Launcher$AppClassLoader
		 * /Users/lu/mycode/code/susieierp/target/test-classes
		 * :/Users/lu/mycode/code/susieierp/target/classes
		 * :/Users/su/.p2/pool/plugins/org.junit_4.12.0.v201504281640/junit.jar
		 * :/Users/su/.p2/pool/plugins/org.hamcrest.core_1.3.0.v201303031735.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-core/4.3.5.RELEASE/spring-core-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-beans/4.3.5.RELEASE/spring-beans-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-context/4.3.5.RELEASE/spring-context-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-aop/4.3.5.RELEASE/spring-aop-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-expression/4.3.5.RELEASE/spring-expression-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-web/4.3.5.RELEASE/spring-web-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-webmvc/4.3.5.RELEASE/spring-webmvc-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-jdbc/4.3.5.RELEASE/spring-jdbc-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-tx/4.3.5.RELEASE/spring-tx-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/org/springframework/spring-test/4.3.5.RELEASE/spring-test-4.3.5.RELEASE.jar
		 * :/Users/lu/.m2/repository/com/github/pagehelper/pagehelper/4.0.1/pagehelper-4.0.1.jar
		 * :/Users/lu/.m2/repository/com/github/jsqlparser/jsqlparser/0.9.1/jsqlparser-0.9.1.jar
		 * :/Users/lu/.m2/repository/net/sf/json-lib/json-lib-ext-spring/1.0.2/json-lib-ext-spring-1.0.2.jar
		 * :/Users/lu/.m2/repository/net/sf/json-lib/json-lib/2.2.2/json-lib-2.2.2-jdk15.jar
		 * :/Users/lu/.m2/repository/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.jar
		 * :/Users/lu/.m2/repository/commons-collections/commons-collections/3.2/commons-collections-3.2.jar
		 * :/Users/lu/.m2/repository/commons-lang/commons-lang/2.4/commons-lang-2.4.jar
		 * :/Users/lu/.m2/repository/net/sf/ezmorph/ezmorph/1.0.4/ezmorph-1.0.4.jar
		 * :/Users/lu/.m2/repository/javax/servlet/servlet-api/2.4/servlet-api-2.4.jar
		 * :/Users/lu/.m2/repository/log4j/log4j/1.2.14/log4j-1.2.14.jar
		 * :/Users/lu/.m2/repository/org/slf4j/slf4j-api/1.7.12/slf4j-api-1.7.12.jar
		 * :/Users/lu/.m2/repository/ch/qos/logback/logback-core/1.1.7/logback-core-1.1.7.jar
		 * :/Users/lu/.m2/repository/ch/qos/logback/logback-classic/1.1.7/logback-classic-1.1.7.jar
		 * :/Users/lu/.m2/repository/ch/qos/logback/logback-access/1.1.7/logback-access-1.1.7.jar
		 * :/Users/lu/.m2/repository/mysql/mysql-connector-java/5.1.38/mysql-connector-java-5.1.38.jar
		 * :/Users/lu/.m2/repository/com/alibaba/druid/1.0.28/druid-1.0.28.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/jconsole.jar
		 * :/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/lib/tools.jar
		 * :/Users/lu/.m2/repository/org/mybatis/mybatis/3.3.0/mybatis-3.3.0.jar
		 * :/Users/lu/.m2/repository/org/mybatis/mybatis-spring/1.2.3/mybatis-spring-1.2.3.jar
		 * :/Users/lu/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar
		 * :/Users/lu/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar
		 * :/Users/lu/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.5.4/jackson-databind-2.5.4.jar
		 * :/Users/lu/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.5.0/jackson-annotations-2.5.0.jar
		 * :/Users/lu/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.5.4/jackson-core-2.5.4.jar
		 * :/Users/lu/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar
		 * :/Users/lu/.m2/repository/junit/junit/3.8.1/junit-3.8.1.jar
		 * :/Users/su/jee-mars/Eclipse.app/Contents/Eclipse/configuration/org.eclipse.osgi/380/0/.cp/
		 * :/Users/su/jee-mars/Eclipse.app/Contents/Eclipse/configuration/org.eclipse.osgi/379/0/.cp/
		 * */
		System.out.println(System.getProperty("java.class.path"));
	}

}
