
http://localhost:8098/getStudentDetailsForSchool/xyzschool
http://localhost:9098/getSchoolDetails/xyzschool


add http://localhost:9098/hystrix.stream to Dashboard

Dashboard
http://localhost:9098/hystrix

student service is like the server, if that is busy (or stopped), then school service will return a message saying it's not available, else it'll fetch records and display.