/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.adapter;


 public class _run {

 public static void main(String[] args) {

 CircleD circleD = new CircleD(2);

 System.out.println("Pole="
 + Utils.circAreaR(new Adapter(circleD)));
 }
 }