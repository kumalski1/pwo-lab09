/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.factory;

 public class Saturday implements MessageFactory {

 @Override
 public String createIntroMessage() {
 return "Dzień dobry Sobota.";
 }

 @Override
 public String createMainMessage() {
 return "Po całym tygodniu pracy czujesz ulgę";
 }

 @Override
 public String createClosingMessage() {
 return "Zasypiasz z poczuciem spokoju i bezpieczeństwa";
 }
 }