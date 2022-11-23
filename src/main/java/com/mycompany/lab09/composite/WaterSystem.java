/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab09.composite;



 import java.util.List;
 import java.util.ArrayList;

 public class WaterSystem implements WaterSystemInterface {

 protected final List<WaterSystemInterface>
 elements = new ArrayList<>();

 public final void addComponent(WaterSystem element){
 elements.add(element);
 }

 public void fill(){
 elements.forEach(element -> element.fill());
 }

 public void afterFill(){
 elements.forEach(element -> element.afterFill());
 }

 public void drain() {
 elements.forEach(element -> element.drain());
 }

 public void afterDrain() {
 elements.forEach(element -> element.afterDrain());
 }
  public void afterDrainDrain() {
 elements.forEach(element -> element.afterDrainDrain());
 }
 }