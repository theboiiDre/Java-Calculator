package com.example.simplecalculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleCalculatorProject extends Application {
    TextField display;

    // this will store all the buttons inside the variables below
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnPercentage,btnMinus,btnDivide,btnMultiply,btnModulus,btnDot,btnSquare,btnClear,btnBack,btnSubmit;

    Font fontBg,fontSm,fontNm; // Big sized font, small sized font, normal sized font
    double firstNumber,secondNumber,answer; // this will hold the first number, second number
                                            // and the answer inside the variables.
    int answerInt; // this will hold the answer as an integer in this variable
    String operator; // this will hold the operators in this variable


    @Override
    public void start(Stage stage) throws Exception {
        fontBg = new Font("ink-free",40);
        fontNm = new Font("ink-free",20);
        fontSm = new Font("ink-free",15);

        display = new TextField();
        display.setMaxSize(270,50);
        display.setMinSize(270,50);
        display.setEditable(false);
        display.setStyle("--alignmentfx: CENTER-RIGHT;");

        btn0 = new Button("0"); //this will display "0" on the button
        btn0.setPrefSize(130,60); //this will set the length to 130 and breadth to 60
        btn0.setFont(fontNm);
        btn0.setStyle("-fx-background-color:gray;");

        btn1 = new Button("1"); //this will display "1" on the button
        btn1.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn1.setFont(fontNm);

        btn2 = new Button("2"); // this will display "2" on the button
        btn2.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn2.setFont(fontNm);

        btn3 = new Button("3"); // this will display "3" on the button
        btn3.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn3.setFont(fontNm);

        btn4 = new Button("4"); // this will display "4" on the button
        btn4.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn4.setFont(fontNm);

        btn5 = new Button("5"); ; // this will display "5" on the button
        btn5.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn5.setFont(fontNm);

        btn6 = new Button("6"); ; // this will display "6" on the button
        btn6.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn6.setFont(fontNm);

        btn7 = new Button("7"); ; // this will display "7" on the button
        btn7.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn7.setFont(fontNm);

        btn8 = new Button("8"); ; // this will display "8" on the button
        btn8.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn8.setFont(fontNm);

        btn9 = new Button("9"); ; // this will display "9" on the button
        btn9.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btn9.setFont(fontNm);

        btnPlus = new Button("+"); ; // this will display "+" on the button
        btnPlus.setPrefSize(60,130); // this will set the length to 60 and breadth to 60
        btnPlus.setFont(fontNm);
        btnPlus.getStyleClass().add("operator-btn");

        btnMinus = new Button("-"); ; // this will display "-" on the button
        btnMinus.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnMinus.setFont(fontNm);
        btnMinus.getStyleClass().add("operator-btn");

        btnMultiply = new Button("*"); ; // this will display "*" on the button
        btnMultiply.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnMultiply.setFont(fontNm);
        btnMultiply.getStyleClass().add("operator-btn");

        btnPercentage = new Button("%"); ; // this will display "%" on the button
        btnPercentage.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnPercentage.setFont(fontNm);

        btnPercentage.getStyleClass().add("operator-btn");

        ///  random alanln

        btnDivide = new Button("/"); ; // this will display "/" on the button
        btnDivide.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnDivide.setFont(fontNm);
        btnDivide.getStyleClass().add("operator-btn");

        btnModulus = new Button("mod"); // this will display "mod" on the button
        btnModulus.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnModulus.setFont(fontSm);
        btnModulus.getStyleClass().add("operator-btn");

        btnDot = new Button("."); // this will display "." on the button
        btnDot.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnDot.setFont(fontNm);

        btnSquare = new Button("^2");
        btnSquare.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnSquare.setFont(fontNm);
        btnSquare.getStyleClass().add("operator-btn");

        btnSubmit = new Button("=");
        btnSubmit.setPrefSize(60,130); // this will set the length to 60 and breadth to 60
        btnSubmit.setFont(fontNm);
        btnSubmit.getStyleClass().add("operator-btn");

        btnClear = new Button("CLE");
        btnClear.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnClear.setFont(fontNm);

        btnBack =new Button("<=");
        btnBack.setPrefSize(60,60); // this will set the length to 60 and breadth to 60
        btnBack.setFont(fontNm);

//layout setUp
        GridPane gp = new GridPane();
//        gp.setGridLinesVisible(true);
          gp.setVgap(10);
          gp.setHgap(10);
          gp.setAlignment(Pos.CENTER);
          gp.add(display,0,1,4,1);
          gp.addRow(2,btnClear,btnSquare,btnModulus,btnBack);
          gp.addRow(3,btnMinus,btnMultiply,btnDivide,btnPercentage);
          gp.addRow(4,btn7,btn8,btn9);
          gp.addRow(5,btn4,btn5,btn6);
          gp.addRow(6,btn1,btn2,btn3);
          gp.add(btn0,0,7,2,1);
          gp.add(btnDot,2,7,1,1);
          gp.add(btnPlus,3,4,1,2);
          gp.add(btnSubmit,3,6,1,2);


          //button functionalities

        btn0.setOnAction(e ->{
            display.appendText(btn0.getText());
        });
        btn1.setOnAction(e ->{
//            display.setText(display.getText()+btn1.getText());
            display.appendText(btn1.getText());
        });
        btn2.setOnAction(e ->{
            display.appendText(btn2.getText());
        });
        btn3.setOnAction(e ->{
            display.appendText(btn3.getText());
        });
        btn4.setOnAction(e ->{
            display.appendText(btn4.getText());
        });
        btn5.setOnAction(e ->{
            display.appendText(btn5.getText());
        });
        btn6.setOnAction(e ->{
            display.appendText(btn6.getText());
        });
        btn7.setOnAction(e ->{
            display.appendText(btn7.getText());
        });
        btn8.setOnAction(e ->{
            display.appendText(btn8.getText());
        });
        btn9.setOnAction(e ->{
            display.appendText(btn9.getText());
        });
        btnClear.setOnAction(e ->{display.setText("");});

        btnBack.setOnAction(e ->{
            display.setText(display.getText().substring(0,display.getText().length() -1));
        });
        btnDot.setOnAction(e ->{
            if(display.getText().isEmpty()){
                display.setText("0.");
            }else if(display.getText().contains(".")){
                display.setText(display.getText());
            }else{display.appendText(btnDot.getText());}

        });

        btnPlus.setOnAction(e ->{
            firstNumber =Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        });

        btnModulus.setOnAction(e ->{
            firstNumber =Double.parseDouble(display.getText());
            operator = "%";
            display.setText("");
        });
        btnDivide.setOnAction(e ->{
            firstNumber =Double.parseDouble(display.getText());
            display.setText("");
        });
        btnMultiply.setOnAction(e ->{
            firstNumber =Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        });
        btnMinus.setOnAction(e ->{
            if(display.getText().isEmpty()){
                display.setText(btnMinus.getText());
            }
            firstNumber =Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        });
        btnSquare.setOnAction(e ->{
            firstNumber = Double.parseDouble(display.getText());
            answer = firstNumber*firstNumber;
            answerInt = (int) answer;
            if(String.valueOf(answer).endsWith(".0")){
                display.setText(String.valueOf(answerInt));
            }else {
                display.setText(String.valueOf(answer));
            }
        });
        btnPercentage.setOnAction(e ->{
           firstNumber = Double.parseDouble(display.getText());
           answer = firstNumber/100;
           answerInt = (int) answer;
            if(String.valueOf(answer).endsWith(".0")){
                display.setText(String.valueOf(answerInt));
            }else {
                display.setText(String.valueOf(answer));
            }

        });


        btnSubmit.setOnAction(e ->{
            secondNumber = Double.parseDouble(display.getText());
            if(operator.equals("+")){
                answer = firstNumber + secondNumber;
                answerInt = (int) answer;
                if(String.valueOf(answer).endsWith(".0")){
                    display.setText(String.valueOf(answerInt));
                }else {
                    display.setText(String.valueOf(answer));
                }
            } else if (operator.equals("%")) {
                answer = firstNumber % secondNumber;
                answerInt = (int) answer;
                if(String.valueOf(answer).endsWith(".0")){
                    display.setText(String.valueOf(answerInt));
                }else {
                    display.setText(String.valueOf(answer));
                }
            } else if (operator.equals("/")) {
                answer = firstNumber / secondNumber;
                answerInt = (int) answer;
                if(String.valueOf(answer).endsWith(".0")){
                    display.setText(String.valueOf(answerInt));
                }else {
                    display.setText(String.valueOf(answer));
                }
            }else if (operator.equals("*")) {
                answer = firstNumber * secondNumber;
                answerInt = (int) answer;
                if(String.valueOf(answer).endsWith(".0")){
                    display.setText(String.valueOf(answerInt));
                }else {
                    display.setText(String.valueOf(answer));
                }
            }else if (operator.equals("-")) {
                answer = firstNumber - secondNumber;
                answerInt = (int) answer;
                if(String.valueOf(answer).endsWith(".0")){
                    display.setText(String.valueOf(answerInt));
                }else {
                    display.setText(String.valueOf(answer));
                }
            }
        });







        String css = this.getClass().getResource("styles.css").toExternalForm();
        Scene scene = new Scene(gp, 350, 600);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Simple Calculator");
        stage.setResizable(false);
        Image icon = new Image(this.getClass().getResourceAsStream("calculator.png"));
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
