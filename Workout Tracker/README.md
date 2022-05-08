### Workout Tracker - 
<hr />

### Resources -
<ul>
	<li>
		<a href="Resources/Summative assessment- BE track- Use case.pdf">Use Case PDF.</a>
	</li>
	<li>
		<a href="Resources/workout-tracker-app.postman_collection.json">Import this JSON as a collection in POSTMAN to view the requests.</a>
	</li>
</ul>
<hr />

### Major Bugs, occurred (Solved) (Check code comments for the solution) - 
<ol>
	<li>
		Raising an error in spring and having multiple return status codes for the same function, solved using a custom error class and a custom error status and a handler for the custom error.
	<li>
		Capturing the entries of categories in workout and checking if it exists before adding.
		Tried using a list and a method to load the list with the values from db. on category service side. Kinda worked when auto wired both the repositories to the workout service.
	</li>
	<li>
		Now, cuz of autowiring both repositories or cuz spring is weird, faced a really weird error. Where the generation of IDs were being shared by both the entities. Solved using a sequencegenerator on category entity.
	</li>
	<li>
		And, finally solved the bug of loading the category names in workout side using a rest template.
	</li>
</ol>
<hr />