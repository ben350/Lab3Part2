/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author benjamin.ramirez006
 */


import java.awt.event.*;

public class CalcController{
  
  // There is a reference to both the view and the model
  private static CalcView view;
  private static CalcModel model;
  

  
  
  CalcController() {
      this.view = new CalcView();
      this.model = new CalcModel();
      
      view.setSubtractListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        view.setResult(model.subtractValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });
      //addition
      view.setAddListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        view.setResult(model.addValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });
      
    //multiplication
     view.setMultiplyListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        view.setResult(model.multiplyValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });
     
     //division
          view.setDivisionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        view.setResult(model.divideValues(
          view.getOperand1(),
          view.getOperand2()));
      }
    });
          
          
          
  }
  
  
    /**
     * Create and set the listeners to the view
     */
      
    //addition
    
}
