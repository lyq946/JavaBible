package com.example.lkp;

import java.io.*;
import java.text.MessageFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 获取中文
 *
 * @author: LKP
 * @date: 2020/8/10
 */
public class GetChinese {

    /**
     * 目标文件
     */
    private static final String TARGET_FILE_PATH = "C:\\Users\\Administrator\\Desktop\\解析中文\\中文.txt";
    /**
     * 源文件
     */
    private static final String SOURCE_FILE_PATH = "C:\\Users\\Administrator\\Desktop\\解析中文\\副本js";
    /**
     * 是否允许重复中文
     */
    private static final Boolean IS_REPEAT = false;
    /**
     * 是否打印中文所在目录
     */
    private static final Boolean IS_PRINT_SOURCE = false;
    /**
     * 全局容器
     */
    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        File sourceFile = new File(SOURCE_FILE_PATH);
        scanFile(sourceFile);
        print(map);
    }

    /**
     * 输出方法
     *
     * @param map
     */
    private static void print(Map<String, String> map) {
        FileWriter fileWriter;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(TARGET_FILE_PATH, true);
            printWriter = new PrintWriter(fileWriter);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                printWriter.println(entry.getKey());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.flush();
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }

    public static void collect(File file) {
        collect(file, IS_REPEAT, IS_PRINT_SOURCE);
    }

    /**
     * 将中文收集起来
     * Collect.
     *
     * @param file          the file
     * @param isRepeat      the is repeat
     * @param isPrintSource the is print source
     */
    public static void collect(File file, Boolean isRepeat, Boolean isPrintSource) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content;
            String fileName = file.getAbsolutePath().substring(SOURCE_FILE_PATH.length());
            while ((content = bufferedReader.readLine()) != null) {
                String result = filterChinese(content);
                if (GetChinese.isNotBlank(result)) {
                    String nameAndPath;
                    if (isPrintSource) {
                        nameAndPath = MessageFormat.format("{0}={1}", result, fileName);
                    } else {
                        nameAndPath = MessageFormat.format("{0}={1}", result, "");
                    }
                    if (!map.containsKey(nameAndPath)) {
                        map.put(nameAndPath, nameAndPath);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 正则表达式中文匹配
     *
     * @param paramValue
     * @return
     */
    private static String filterChinese(String paramValue) {
        String regex = "([\u4e00-\u9fa5]+)";
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile(regex).matcher(paramValue);
        while (matcher.find()) {
            String str = matcher.group(0);
            str = str.replaceAll("\\s+ |“|\\[|‘|《|　*|", "").trim();
            stringBuffer.append(str);
        }
        String content = new String(stringBuffer);
        if (GetChinese.isNotBlank(content)) {
            return content;
        }
        return null;
    }

    /**
     * 递归扫描
     * Scan file.
     *
     * @param file the file
     */
    public static void scanFile(File file) {
        if (file.isDirectory()) {
            File[] subFiles = file.listFiles();
            if (subFiles.length > 0) {
                for (File subFile : subFiles) {
                    scanFile(subFile);
                }
            }
        } else if (file.isFile()) {
            collect(file);
        }
    }

    private static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    private static boolean isBlank(String str) {
        int strLen;
        if (str != null && (strLen = str.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }
}
