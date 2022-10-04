package package007;

import java.util.*;

public class CaveStack<Cave> implements CaveInterface<Cave> {

public CaveStack() {
	FirstStack = new Stack<Cave>();

	
	CaveCoordinate = new Stack<String>();
}

Stack <Cave> FirstStack; Stack <String> CaveCoordinate;

@Override
public boolean push(Cave newEntry, String Coordinate) {
boolean tofChecker = true;
if ((CaveCoordinate.search(Coordinate) == -1)) {
	FirstStack.push(newEntry);
}
else
{
	tofChecker =false;
}
 return tofChecker;
}

@Override 
public Cave pop() {
	return FirstStack.pop();
}

@Override 
public Cave peek() {
return FirstStack.peek();	
}

@Override 
public boolean isEmpty() {
	return FirstStack.empty();
}

@Override 
public void clear() {
	FirstStack.clear();
}




}