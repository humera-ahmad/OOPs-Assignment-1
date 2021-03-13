package org.knoldus.queue

import org.scalatest.flatspec.AnyFlatSpec

class SquareQueueTest extends AnyFlatSpec{
  val squareQueue = new SquareQueue

  "SquareQueue"should "give the correct output when enqueued" in {
    val list = List(1,2,3,4)
    val input = List(3,4)
    val expected = List(1,2,3,4,9,16)
    val result = squareQueue.enQueue(list,input)
    assertResult(expected)(result)
  }

  it should "return only the enqueued elements" in {
    val list = List()
    val input = List(3,4)
    val expected = List(9,16)
    val result = squareQueue.enQueue(list,input)
    assertResult(expected)(result)
  }

  it should "give the correct output when dequeued" in {
    val list = List(1,2,3,4)
    val expected = List(2,3,4)
    val result = squareQueue.deQueue(list)
    assertResult(expected)(result)
  }

  it should "return List is empty, hence cannot be dequeued" in {
    val list = List()
    val expected = "List is empty"
    val result = squareQueue.deQueue(list)
    assertResult(expected)(result)
  }

  it should "return nothing when dequeued" in {
    val list = List(1)
    val expected = List()
    val result = squareQueue.deQueue(list)
    assertResult(expected)(result)
  }

}
