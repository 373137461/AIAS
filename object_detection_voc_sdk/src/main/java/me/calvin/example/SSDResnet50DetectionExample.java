package me.calvin.example;

import ai.djl.ModelException;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.modality.cv.output.DetectedObjects;
import ai.djl.translate.TranslateException;
import me.calvin.aias.SSDResnet50Detection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class SSDResnet50DetectionExample {

  private static final Logger logger = LoggerFactory.getLogger(SSDResnet50DetectionExample.class);

  private SSDResnet50DetectionExample() {}

  public static void main(String[] args) throws IOException, ModelException, TranslateException {
    Path imageFile = Paths.get("src/test/resources/detection.jpeg");
    Image image = ImageFactory.getInstance().fromFile(imageFile);
    SSDResnet50Detection detection = new SSDResnet50Detection();

    //阈值
    double threshold = 0.5;
    DetectedObjects detections = detection.predict(image, threshold);
//    List<DetectedObjects.DetectedObject> items = detections.items();
    //    List<String> names = new ArrayList<>();
    //    List<Double> prob = new ArrayList<>();
    //    List<BoundingBox> rect = new ArrayList<>();

    //    for (DetectedObjects.DetectedObject item : items) {
    //      names.add(item.getClassName());
    //      prob.add(item.getProbability());
    //      rect.add(item.getBoundingBox());
    //    }

    ImageUtils.drawBoundingBoxImage(image, detections);
    ImageUtils.saveImage(image, "SSDResnet50Detection.png", "build/output");

    logger.info("{}", detections);
  }
}
