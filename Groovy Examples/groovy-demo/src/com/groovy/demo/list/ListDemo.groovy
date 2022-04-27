package com.groovy.demo.list

class ListDemo {
	static void main(String[] args) {
		def list = [11, 12, 13, 14];
		println(list)
		
		list.add(15)
		println("Added a new element, new list:: ${list}")
		//contains
		println("Cheking if list contains 15:: ${list.contains(15)}")
		//get
		println("Fetching the item at index 3:: ${list.get(4)}")
		//isEmpty
		println("Is the list empty:: ${list.isEmpty()}")
		//minus
		def deleteTheseElementsTogether = [12, 13, 11]
		println("List after minus:: ${list.minus(deleteTheseElementsTogether)}")
		//plus
		def addTheseElementsTogether = [16, 17]
		println("List after plus:: ${list.plus(addTheseElementsTogether)}")
		//pop
		println("List after popping element ${list.pop()} :: $list")
		//remove
		println("List after removing element ${list.remove(2)} :: $list")
		//size
		println("Size of the list:: ${list.size()}")
	}
}
