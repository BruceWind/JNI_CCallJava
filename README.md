
### 生成头文件

wei@wei-MacBookAir:~/git/ccalljava/app/src/main$ javac java/com/androidyuan/tool/JavaCallC.java -d ./bin
wei@wei-MacBookAir:~/git/ccalljava/app/src/main$ javah -jni -classpath bin -d jni com.androidyuan.tool.JavaCallC
