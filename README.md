[gradle offical](https://gradle.org/)  
[Gradle cn](http://www.yiibai.com/gradle/)   
[Gradle User Guide](http://wiki.jikexueyuan.com/project/GradleUserGuide-Wiki/)  
[groovy offical](http://www.groovy-lang.org/)  
[Groovy cn](https://www.w3cschool.cn/groovy)  
[github bulidship](https://github.com/eclipse/buildship/blob/master/docs/user/Installation.md)

# 定义全局变量
在使用gradle管理项目的时候，我们有时候需要对jar的版本进行统一的管理，这是我们可以定义全局变量，形式如下：  

```
ext.springVersion = '4.3.13.RELEASE'
```
或者
```
def springVersion = '4.3.13.RELEASE'
```

jar依赖声明如下：
```
dependencies {
    compile "org.springframework:spring-beans:${springVersion}"
    compile "org.springframework:spring-context:${springVersion}"
    compile "org.springframework:spring-context-support:${springVersion}"
    compile "org.springframework:spring-web:${springVersion}"
    compile "org.springframework:spring-webmvc:${springVersion}"
    compile "org.springframework:spring-jdbc:${springVersion}"
    compile "org.springframework:spring-orm:${springVersion}"
}
```

我们也可以在相关依赖中，使用 *def* 定义局部变量，具体如下：
```
dependencies {
	def springVersion = '4.3.13.RELEASE'
    compile "org.springframework:spring-beans:${springVersion}"
    compile "org.springframework:spring-context:${springVersion}"
    compile "org.springframework:spring-context-support:${springVersion}"
    compile "org.springframework:spring-web:${springVersion}"
    compile "org.springframework:spring-webmvc:${springVersion}"
    compile "org.springframework:spring-jdbc:${springVersion}"
    compile "org.springframework:spring-orm:${springVersion}"
}
```
需要注意的一点，在引用变量的时候，jar包group，name，version声明必须以应为 *""* 括起来，否则刷新项目，jar依赖不能够解决。

在构建项目时我们也可以使用maven仓库寻找jar，仓库声明如下：
```
repositories {
        mavenLocal()
        mavenCentral()
    	maven{ url 'http://maven.aliyun.com/nexus/content/groups/public/'}
    }
```
上述修改，只能针对当前项目，如果要对所有项目生效可以参考如下文章配置：
[Gradle 修改Maven仓库地址](http://blog.csdn.net/thousa_ho/article/details/73013729)  
