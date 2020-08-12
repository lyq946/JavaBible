package com.example.lkp;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: LKP
 * @date: 2020/8/11
 */
public class GetChineseByExcel {

    //目标文件
    private static final String TARGET_FILE_PATH = "C:\\Users\\Administrator\\Desktop\\解析中文\\中文.txt";
    //源文件
    private static final String SOURCE_FILE_PATH = "C:\\Users\\Administrator\\Desktop\\解析中文\\新建文件夹\\";
    //是否允许重复中文
    private static final Boolean IS_REPEAT = false;
    //是否打印中文所在目录
    private static final Boolean IS_PRINT_SOURCE = false;
    //全局容器
    private static Map<String, String> map = new HashMap<String, String>();


    public static void main(String[] args) throws IOException {
        File sourceFile = new File(SOURCE_FILE_PATH);
        scanFile(sourceFile);
        print(map);
    }

    private static FileWriter fileWriter;
    private static PrintWriter printWriter = null;

    static {
        try {
            fileWriter = new FileWriter(TARGET_FILE_PATH, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter = new PrintWriter(fileWriter);
    }

    /**
     * 输出方法
     *
     * @param map
     */
    private static void print(Map<String, String> map) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            printWriter.flush();
            printWriter.close();
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
     * @param isPrintsource the is printsource
     */
    public static void collect(File file, Boolean isRepeat, Boolean isPrintsource) {
        String fileName = file.getName();
        try {
            printWriter.println("-----------------" + fileName + "-------开始------------");
            FileInputStream fis = new FileInputStream(file);
            Workbook rwb = Workbook.getWorkbook(file);
            Sheet[] sheet = rwb.getSheets();
            for (int i = 0; i < sheet.length; i++) {
                Sheet rs = rwb.getSheet(i);
                for (int j = 0; j < rs.getRows(); j++) {
                    Cell[] cells = rs.getRow(j);
                    for (int k = 0; k < cells.length; k++) {
                        filterChineseReturnSet(cells[k].getContents());
                    }
                }
            }
            fis.close();
            printWriter.println("-----------------" + fileName + "-------结束------------");
            System.out.println("成功：" + fileName);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>> Excel 名字：" + fileName);
        }
    }

    //正则表达式中文匹配
    private static Set<String> filterChineseReturnSet(String paramValue) throws UnsupportedEncodingException {
        String regex = "([\u4e00-\u9fa5]+)";
        Matcher matcher = Pattern.compile(regex).matcher(paramValue);
        Set<String> chineseStr = new HashSet<>(10);
        while (matcher.find()) {
            String str = matcher.group(0);
            if (!map.containsKey(str)) {
                map.put(str, str);
                printWriter.println(str);
            }
        }
        return chineseStr;
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

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isBlank(String str) {
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
