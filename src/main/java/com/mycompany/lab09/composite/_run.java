/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.composite;



 public class _run {
 public static void main(String[] args) {

 WaterSystem waterSystem = new WaterSystem();
 waterSystem.addComponent(new Tank());
 waterSystem.addComponent(new Tap());

 System.out.println("Napełnienie:");
 waterSystem.fill();
 waterSystem.afterFill();
 System.out.println("\nOpróżnienie:");
 waterSystem.drain();
 waterSystem.afterDrain();
 waterSystem.afterDrainDrain();
 }
 }