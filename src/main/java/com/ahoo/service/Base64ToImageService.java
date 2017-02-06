package com.ahoo.service;

import org.springframework.stereotype.Service;
import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 把base64数据转化为图片保存到本地
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/1/23 0023
 * Time: 21:41
 */
@Service
public class Base64ToImageService {

    /**
     * @param imgStr   base64 数据流
     * @param name     保存的图片名称（包含后缀）
     * @param workPath 保存图片的地址
     * @return
     */
    public int Base64ToImageService(String imgStr, String name, String workPath) {
        String path = workPath + name;
        saveImage(decode(imgStr.substring(22)), path);
        return 1;
    }


    /**
     * 字符流转换成字节流
     *
     * @param s
     * @return
     */
    public static byte[] decode(String s) {
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = null;
        try {
            bytes = decoder.decodeBuffer(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     * 保存图片到本地
     *
     * @param imageBytes 字节流
     * @param path       路径
     */

    public void saveImage(byte[] imageBytes, String path) {
        File file = new File(path);
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(imageBytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSteam(outputStream);
        }
    }

    public void closeSteam(FileOutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
