package org.knoldus.queue

import org.knoldus.traits.QueueTrait

class SquareQueue extends QueueTrait{
  override def enQueue(list: List[Int], input: List[Int]): List[Int] = {
    val elements = input.map(value => value*value)
    val squareEnqueued = list.concat(elements)

    squareEnqueued
  }
}
