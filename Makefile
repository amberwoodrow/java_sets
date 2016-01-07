run:
	javac LotterySet.java && \
	java LotterySet

test:
	javac -cp .:junit.jar LotteryTest.java && \
	java -cp .:junit.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore LotteryTest
