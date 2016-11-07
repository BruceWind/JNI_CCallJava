package com.androidyuan.tool;

/**
 * Created by wei on 16-11-6.
 */
public class JavaCallC {


    public static native  String getString();

    public static native  void setStreamListener(Object obj);

    static
    {
        System.loadLibrary("com_androidyuan_tool_JavaCallC");
    }

}
