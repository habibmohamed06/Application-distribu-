all: Slice Server

Slice:
	slice2java src/Printer.ice
	mv mp3 src
Server:
	javac -cp "libs/*" -d classes/ src/*.java src/mp3/*.java
	java -cp "D:\ETUDES\Master\Master1\Semestre2\Middleware\Ice\Mohamed_HABIB_MiddlewareIce2\ServeurJAVA\libs\ice-3.7.2.jar;.;D:\ETUDES\Master\Master1\Semestre2\Middleware\Ice\Mohamed_HABIB_MiddlewareIce2\ServeurJAVA\libs\mysql-connector-java-8.0.15.jar;D:\ETUDES\Master\Master1\Semestre2\Middleware\Ice\Mohamed_HABIB_MiddlewareIce2\ServeurJAVA\libs\*" Server