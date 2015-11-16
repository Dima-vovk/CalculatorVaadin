package com.vovk;

import com.vaadin.ui.Label;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.ui.*;
import com.vovk.backend.CalculatorFunction;


/**
 * Created by Dima on 15.11.2015.
 */
@Title("Super Puper Calculator")
@Theme("valo")
public class Main extends UI {

    CalculatorFunction calculatorFunction;

    Label result = new Label();
    Button btnOne = new Button("1");
    Button btnTwo = new Button("2");
    Button btnTree = new Button("3");
    Button btnFour = new Button("4");
    Button btnFive = new Button("5");
    Button btnSix = new Button("6");
    Button btnSeven = new Button("7");
    Button btnEight = new Button("8");
    Button btnNine = new Button("9");
    Button btnZiro = new Button("0");
    Button btnDel = new Button("←");
    Button btnAdd = new Button("+");
    Button btnSubtract = new Button("-");
    Button btnDivide = new Button("/");
    Button btnMultiply = new Button("*");
    Button btnRemuve = new Button("C");
    Button btnEquals = new Button("=");
    Button btnDouble = new Button(".");

    @Override
    public void init(VaadinRequest request) {

        elementInit();
        setContent(layoutInit());
    }
    private Layout layoutInit(){
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        layout.addComponent(result);
        layout.addComponent(new HorizontalLayout(btnOne,btnTwo,btnTree, btnDel));
        layout.addComponent(new HorizontalLayout(btnFour, btnFive, btnSix, btnMultiply));
        layout.addComponent(new HorizontalLayout(btnSeven, btnEight, btnNine, btnDivide));
        layout.addComponent(new HorizontalLayout(btnZiro, btnDouble, btnSubtract, btnAdd));
        layout.addComponent(new HorizontalLayout(btnRemuve, btnEquals));

        return layout;
    }
    private void elementInit(){
        result.setId("res");

        btnOne.setId("1");
        btnOne.setWidth("50");
        btnOne.setHeight("50");
        btnOne.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnOne,result);
            }
        });
        btnTwo.setId("2");
        btnTwo.setWidth("50");
        btnTwo.setHeight("50");
        btnTwo.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnTwo, result);
            }
        });
        btnTree.setId("3");
        btnTree.setWidth("50");
        btnTree.setHeight("50");
        btnTree.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnTree, result);
            }
        });
        btnFour.setId("4");
        btnFour.setWidth("50");
        btnFour.setHeight("50");
        btnFour.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnFour, result);
            }
        });
        btnFive.setId("5");
        btnFive.setWidth("50");
        btnFive.setHeight("50");
        btnFive.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnFive, result);
            }
        });
        btnSix.setId("6");
        btnSix.setWidth("50");
        btnSix.setHeight("50");
        btnSix.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnSix, result);
            }
        });
        btnSeven.setId("7");
        btnSeven.setWidth("50");
        btnSeven.setHeight("50");
        btnSeven.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnSeven, result);
            }
        });
        btnEight.setId("8");
        btnEight.setWidth("50");
        btnEight.setHeight("50");
        btnEight.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnEight, result);
            }
        });
        btnNine.setId("9");
        btnNine.setWidth("50");
        btnNine.setHeight("50");
        btnNine.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnNine, result);
            }
        });
        btnZiro.setId("0");
        btnZiro.setWidth("50");
        btnZiro.setHeight("50");
        btnZiro.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnZiro, result);
            }
        });
        btnDel.setId("del");
        btnDel.setWidth("50");
        btnDel.setHeight("50");
        btnDel.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnDel, result);
            }
        });
        btnAdd.setId("+");
        btnAdd.setWidth("50");
        btnAdd.setHeight("50");
        btnAdd.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnAdd, result);
            }
        });
        btnSubtract.setId("-");
        btnSubtract.setWidth("50");
        btnSubtract.setHeight("50");
        btnSubtract.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnSubtract, result);
            }
        });
        btnDivide.setId("/");
        btnDivide.setWidth("50");
        btnDivide.setHeight("50");
        btnDivide.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnDivide, result);
            }
        });
        btnMultiply.setId("*");
        btnMultiply.setWidth("50");
        btnMultiply.setHeight("50");
        btnMultiply.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnMultiply, result);
            }
        });
        btnRemuve.setId("C");
        btnRemuve.setWidth("100");
        btnRemuve.setHeight("50");
        btnRemuve.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnRemuve,result);
            }
        });
        btnEquals.setId("=");
        btnEquals.setWidth("100");
        btnEquals.setHeight("50");
        btnEquals.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnEquals, result);
            }
        });
        btnDouble.setId(".");
        btnDouble.setWidth("50");
        btnDouble.setHeight("50");
        btnDouble.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                calculatorFunction.pushButton(btnDouble, result);
            }
        });
        result.setValue("0");
    }
}