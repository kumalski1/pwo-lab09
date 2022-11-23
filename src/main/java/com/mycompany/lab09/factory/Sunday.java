/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.factory;

 public class Sunday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Niedziela.";
 }

 @Override
 public String createMainMessage() {
 return "Wolne niedzielne popołudnie nieubłagalnie przemija";
 }

 @Override
 public String createClosingMessage() {
 return "Smuci mnie widmo poniedziałkowej pracy...";
 }
 }