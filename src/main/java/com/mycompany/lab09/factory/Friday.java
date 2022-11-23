/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.factory;

 public class Friday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Piątek.";
 }

 @Override
 public String createMainMessage() {
 return "Piątkowa praca idzie lepiej";
 }

 @Override
 public String createClosingMessage() {
 return "Piąty dzień pracy w tym tygodniu minął";
 }
 }