package me.calvin.example;

import me.calvin.opencv.utils.BinaryUtils;
import me.calvin.opencv.utils.GeneralUtils;
import me.calvin.opencv.utils.GrayUtils;
import org.bytedeco.opencv.opencv_core.Mat;
import org.junit.Test;

public class TestBinaryUtils {

    @Test
    /**
     * 测试opencv自带的二值化
     */
    public void testBinaryNative(){
        String imgPath = "src/test/resources/1.png";
        String destPath = "build/output/binary/";

        Mat src = GeneralUtils.matFactory(imgPath);

        src = GrayUtils.grayColByAdapThreshold(src);

        src = BinaryUtils.binaryNative(src);

        GeneralUtils.saveImg(src , destPath + "binaryNative.png");
    }

    @Test
    /**
     * 测试自定义二值化
     */
    public void testBinaryzation(){
        String imgPath = "src/test/resources/1.png";
        String destPath = "build/output/binary/";

        Mat src = GeneralUtils.matFactory(imgPath);

        src = GrayUtils.grayColByAdapThreshold(src);

        src = BinaryUtils.binaryzation(src);

        GeneralUtils.saveImg(src , destPath + "binaryzation.png");

    }
}