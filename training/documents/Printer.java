package documents;

import annotations.json.JsonField;
import annotations.json.JsonPrintable;
import annotations.xml.XmlPrintable;

import java.lang.reflect.Field;

public class Printer {

    public static void print(Object object) {

        Class<?> classOfObject = object.getClass();

        if (classOfObject.getDeclaredAnnotation(JsonPrintable.class) != null) {
            printAsJson(object);
        } else if (classOfObject.getDeclaredAnnotation(XmlPrintable.class) != null) {
            printAsXml(object);
        } else {
            System.out.println("In free format" + object.toString());
        }
    }

    private static void printAsJson(Object object) {
        Class<?> classOfObject = object.getClass();

        for (Field field : classOfObject.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                try {
                    field.setAccessible(true);
                    System.out.println((field.getAnnotation(JsonField.class).mapping().equals("") ? field.getName() : field.getAnnotation(JsonField.class).mapping()) + ":" + (String) field.get(object));
                    System.out.println((field.getAnnotation(JsonField.class).mapping().equals("") ? field.getName() : field.getAnnotation(JsonField.class).mapping()) + ":" + field.getAnnotation(JsonField.class).count());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("print in JSON format");
    }

    private static void printAsXml(Object object) {
        System.out.println("print in XML format");
    }
}
