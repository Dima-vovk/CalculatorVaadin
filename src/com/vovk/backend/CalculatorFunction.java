package com.vovk.backend;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import java.util.HashMap;

/**
 * Created by Dima on 15.11.2015.
 */
public class CalculatorFunction {


    private static HashMap<Symbol, String> map = new HashMap<>();

    private static boolean pressedFunction = false;

    public static void pushButton(Button button, Label label) {
        switch (button.getId()) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0": {
                if (label.getValue().equals("0") || pressedFunction == true) {
                    label.setValue(button.getId());
                    pressedFunction = false;
                } else {
                    label.setValue(label.getValue() + button.getId());
                    pressedFunction = false;
                }
                break;
            }
            case "C":
                label.setValue("0");
                map.clear();
                break;
            case "del":
                if (label.getValue().length() == 1) {
                    label.setValue("0");
                } else {
                    label.setValue(label.getValue().substring(0, label.getValue().length() - 1));
                }
                break;
            case ".":
                if (label.getValue().contains(".")) {
                    break;
                } else
                    label.setValue(label.getValue() + ".");
                break;

            case "=":
                if (map.get(Symbol.OPERATION) == null || map.get(Symbol.OPERATION).isEmpty()) {
                    map.remove(Symbol.FIRST_DIGIT);
                    break;
                } else {
                    map.put(Symbol.SECOND_DIGIT, label.getValue());
                    doEquals(map.get(Symbol.OPERATION), label);
                    map.remove(Symbol.SECOND_DIGIT);
                    map.remove(Symbol.OPERATION);
                    map.put(Symbol.FIRST_DIGIT, label.getValue());
                }
                break;

            case "+":
            case "-":
            case "/":
            case "*": {
                if (map.get(Symbol.FIRST_DIGIT) == null || map.get(Symbol.FIRST_DIGIT).isEmpty()) {
                    map.put(Symbol.FIRST_DIGIT, label.getValue());
                    map.put(Symbol.OPERATION, button.getId());
                    pressedFunction = true;
                } else {
                    map.put(Symbol.SECOND_DIGIT, label.getValue());
                    doEquals(button.getId(), label);
                    map.remove(Symbol.SECOND_DIGIT);
                    map.put(Symbol.FIRST_DIGIT, label.getValue());
                    pressedFunction = true;
                }
                break;
            }
        }
    }
    public static void doEquals(String string, Label label){
        switch (string) {
            case "*":
                label.setValue(String.valueOf(Operation.multiply(Double.parseDouble(map.get(Symbol.FIRST_DIGIT)), Double.parseDouble(map.get(Symbol.SECOND_DIGIT)))));
                break;
            case "/":
                label.setValue(String.valueOf(Operation.divide(Double.parseDouble(map.get(Symbol.FIRST_DIGIT)), Double.parseDouble(map.get(Symbol.SECOND_DIGIT)))));
                break;
            case "+":
                label.setValue(String.valueOf(Operation.add(Double.parseDouble(map.get(Symbol.FIRST_DIGIT)), Double.parseDouble(map.get(Symbol.SECOND_DIGIT)))));
                break;
            case "-":
                label.setValue(String.valueOf(Operation.subtract(Double.parseDouble(map.get(Symbol.FIRST_DIGIT)), Double.parseDouble(map.get(Symbol.SECOND_DIGIT)))));
                break;
        }
    }
}