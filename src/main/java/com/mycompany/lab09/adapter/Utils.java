/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.adapter;

 public class Utils {

 public interface CircleR{
 double getR();
 }

 public static double circAreaR(CircleR circle){
 return Math.PI*Math.pow(circle.getR(), 2);
 }
 }