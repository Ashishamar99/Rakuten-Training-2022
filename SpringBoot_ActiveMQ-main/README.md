### Steps to run this imported project.
<ol>
	<li>
		Extract the apache zip file and run the binary.
		<img src="Screenshots/run this binary to have a standalone service running of active mq.PNG" />
	</li>
	<li>
		Once it is running, go to the URL "http://localhost:8161/admin/queues.jsp" to view the queues, messages produced and consumed.
	</li>
	<li>
		In your IDE, import the "sender" and "Receiver" projects. (The receiver project will be imported as "SpringBootDemo").
	</li>
	<li>
		Run the sender application as a java application and it will produce 10 messages.
	</li>
	<li>
		Run the receiver application as a java application and it will receive the produced messages.
	</li>
	<li>
		Finally, we can view that all the messages in the queue were "dequeued" or consumed by the consumer.
		<img src="Screenshots/screenshot after producing and consuming the messages.PNG" />
	</li>
</ol>
<ul>
	<li>
		<b>Final note - If there are 10 messages produced and 2 consumers, then both will get 5 messages each in a Round Robin fashion.</b>
	</li>
</ul>