run:
	javac Calculator.java && \
	java Calculator

test:
	javac -cp .:junit.jar CalculatorTest.java && \
	java -cp .:junit.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
