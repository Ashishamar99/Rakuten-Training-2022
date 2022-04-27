package com.groovy.demo.ranges

import com.groovy.demo.input.TakeInput

class RangeDemo {
	static void main(String[] args) {
		def rint = 1..10
		println(rint.toArray())
		
		println("Enter 2 numbers to form new range:: ")
		def m = TakeInput.sc.nextInt()
		def n = TakeInput.sc.nextInt()
		
		def newrange = m..n
		println(newrange.toArray())
		
		//get
		println(newrange.get(2))
		
		//getFrom - returns the lowest value of the range.
		println(newrange.getFrom())
		
		//getTo
		println(newrange.getTo())
		
		//isReverse
		println(newrange.isReverse())
		def newnewrange =newrange.toArray().max()..newrange.toArray().min() //Reversing a range in groovy
		println(newnewrange.isReverse())
		
		//subList
		println(newrange.subList(3, 6))
	}
}
