/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.adapter;


 public class Adapter implements Utils.CircleR {

 private double r;

 public Adapter(CircleD circleD){
 r = circleD.getD()/2;
 }

 @Override
 public double getR() { return r; }
 }