/* DO NOT EDIT THIS FILE - it is machine generated */

#include <jni.h>

#include <stdio.h>

#include "com_androidyuan_tool_JavaCallC.h"


JNIEXPORT jstring JNICALL Java_com_androidyuan_tool_JavaCallC_getString (JNIEnv *env, jclass _jcls)
{
 char *buf = "Hi !!!!";
     jstring jString = (*env)->NewStringUTF(env, buf);
     return jString;

}


JNIEXPORT void JNICALL Java_com_androidyuan_tool_JavaCallC_setStreamListener (JNIEnv *env, jclass _jc, jobject _jobj)
{
	   jclass ClassCJM = (*env)->FindClass(env, "com/androidyuan/ccalljava/MainActivity$OnStreamLiStener");
	   //com.androidyuan.ccalljava.MainActivity$OnStreamLiStener
	   //JVM 中内部类 被用 $ 符号分隔
        jmethodID MethodDisplayMessage = (*env)->GetMethodID(env, ClassCJM, "onConnected", "()V");
        (*env)->CallVoidMethod(env, _jobj, MethodDisplayMessage);

}
