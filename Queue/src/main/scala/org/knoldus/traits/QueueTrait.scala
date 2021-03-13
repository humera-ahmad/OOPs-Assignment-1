package org.knoldus.traits

trait QueueTrait {
  def enQueue(list: List[Int],input: List[Int]): List[Int]

  def deQueue(list: List[Int]): Any ={
    try {
      val dequeued = list.drop(list.head)
      dequeued
    }
    catch {
      case e: NoSuchElementException => "List is empty"
    }
  }
}
