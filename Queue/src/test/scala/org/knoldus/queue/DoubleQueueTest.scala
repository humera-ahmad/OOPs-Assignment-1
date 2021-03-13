package org.knoldus.queue

import org.scalatest.flatspec.AnyFlatSpec

class DoubleQueueTest extends AnyFlatSpec{
  val doubleQueue = new DoubleQueue

  "DoubleQueue" should "give the correct output when enqueued" in {
    val list = List(1,2,3,4)
    val input = List(3,4)
    val expected = List(1,2,3,4,6,8)
    val result = doubleQueue.enQueue(list,input)
    assertResult(expected)(result)
  }

  it should "return only the enqueued elements" in {
    val list = List()
    val input = List(3,4)
    val expected = List(6,8)
    val result = doubleQueue.enQueue(list,input)
    assertResult(expected)(result)
  }

  it should "give the correct output when dequeued" in {
    val list = List(1,2,3,4)
    val expected = List(2,3,4)
    val result = doubleQueue.deQueue(list)
    assertResult(expected)(result)
  }

  it should "return List is empty, hence cannot be dequeued" in {
    val list = List()
    val expected = "List is empty"
    val result = doubleQueue.deQueue(list)
    assertResult(expected)(result)
  }

  it should "return nothing when dequeued" in {
    val list = List(1)
    val expected = List()
    val result = doubleQueue.deQueue(list)
    assertResult(expected)(result)
  }
}
