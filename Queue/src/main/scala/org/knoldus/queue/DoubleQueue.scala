package org.knoldus.queue

import org.knoldus.traits.QueueTrait

class DoubleQueue extends QueueTrait{
  override def enQueue(list: List[Int], input: List[Int]): List[Int] = {
    val elements = input.map(value => value*2)
    val enqueued = list.concat(elements)

    enqueued
  }
}
