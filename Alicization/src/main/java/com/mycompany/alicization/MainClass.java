/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alicization;

import com.mycompany.alicization.Ui.TextUi;
import com.mycompany.alicization.sistemlogic.SistemPerkuliahan;
import java.util.Scanner;

/**
 *
 * @author A-12
 */
public class MainClass {
       
public static void main(String[] args) {
    SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
    
    TextUi ui = new TextUi();
    ui.run();
}
}
