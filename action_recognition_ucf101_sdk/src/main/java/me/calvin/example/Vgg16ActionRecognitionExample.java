package me.calvin.example;

import ai.djl.ModelException;
import ai.djl.modality.Classifications;
import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.ImageFactory;
import ai.djl.translate.TranslateException;
import me.calvin.aias.Vgg16ActionRecognition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class Vgg16ActionRecognitionExample {

  private static final Logger logger = LoggerFactory.getLogger(Vgg16ActionRecognitionExample.class);

  private Vgg16ActionRecognitionExample() {}

  public static void main(String[] args) throws IOException, ModelException, TranslateException {
    Path imageFile = Paths.get("src/test/resources/action.jpeg");
    Image image = ImageFactory.getInstance().fromFile(imageFile);
    Vgg16ActionRecognition recognition = new Vgg16ActionRecognition();
    Classifications classifications = recognition.predict(image);
    
    Classifications.Classification bestItem = classifications.best();
    System.out.println(bestItem.getClassName() + " : " + bestItem.getProbability());
    //    List<Classifications.Classification> items = classifications.items();
    //    List<String> names = new ArrayList<>();
    //    List<Double> probs = new ArrayList<>();
    //    for (int i = 0; i < items.size(); i++) {
    //      Classifications.Classification item = items.get(i);
    //      names.add(item.getClassName());
    //      probs.add(item.getProbability());
    //    }
    
    logger.info("{}", classifications);
  }
}
