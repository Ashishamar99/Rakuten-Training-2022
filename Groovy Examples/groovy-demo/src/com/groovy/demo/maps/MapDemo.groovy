package com.groovy.demo.maps

class MapDemo {
	static void main(String[] args) {
		def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
		println(mp.containsKey("TopicName"));
		println(mp.containsKey("Topic"));
		
		//get
		println(mp.get("TopicName"));
		println(mp.get("Topic"));
		
		//Python's dict.keys()
		println(mp.keySet());
		
		//put
		mp.put("TopicID","1");
		println(mp);
		
		//Python's dict.values()
		println(mp.values());
		
		//Updating a value
		mp["TopicID"] = "2"
		println(mp)
		
		try {
			mp.put("TopicID","3");
			println(mp)
			print("Whooohoo! can use put() method to update existing key-value pairs")
		} catch (Exception e) {
			println("Cannot use put() for existing key-value pairs. Use assignment operator to update.")
		}
}
}
