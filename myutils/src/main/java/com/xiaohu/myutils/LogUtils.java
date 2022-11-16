package com.xiaohu.myutils;

import android.util.Log;

/**
 * 可以定位日志位置的log工具.
 */
public class LogUtils {
    private static final boolean DEBUG = true;
    private static final String TAG = "xiaohu";

    public static void v(String tag, String msg) {
        if (DEBUG) {
            Log.v(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void v(String msg) {
        if (DEBUG) {
            Log.v(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void d() {
        d("");
    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.d(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void d(String msg) {
        if (DEBUG) {
            Log.d(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void i(String msg) {
        if (DEBUG) {
            Log.i(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void w(String tag, String msg) {
        if (DEBUG) {
            Log.w(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void w(String msg) {
        if (DEBUG) {
            Log.w(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            Log.e(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    public static void e(String msg) {
        if (DEBUG) {
            Log.e(TAG + getAutoJumpLogInfos()[0], getAutoJumpLogInfos()[1] + ":" + msg + getAutoJumpLogInfos()[2]);
        }
    }

    private static String[] getAutoJumpLogInfos() {
        String[] infos = new String[]{"", "", ""};
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        if (elements.length < 5) {
            Log.e("MyLogger", "Stack is too shallow!!!");
            return infos;
        } else {
            infos[0] = elements[4].getClassName().substring(
                elements[4].getClassName().lastIndexOf(".") + 1);
            infos[1] = elements[4].getMethodName() + "()";
            infos[2] = " at(" + elements[4].getClassName() + ".java:"
                + elements[4].getLineNumber() + ")";
            return infos;
        }
    }
}
