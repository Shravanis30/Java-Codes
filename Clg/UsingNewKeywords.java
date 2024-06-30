// using new keywords: 
// syntax:
//          MyObject object = new Object();


//using class.forName():
//syntax:
//          MyObject obj = (MyObject)class.forName("object").newInstance();


// using clone();
// syntax:
//          MyObject obj = new MyObject();
//          MyObject object = (MyObject)obj.clone();


//using object deserialization
//Syntax: 
//          objectInputStream istream = new objectInputStream(some data);
//          MyObject object = (MyObject) instream.readObject();


//using newInstance() method
//syntax:
//Object obj = DemoClass.class.getClassLoader().loadClass("DemoClass").newInstance();

//Accessing members 
// members of an object can be access by using syntax : referenceName.MemberName;
//access specifier :-
// private:- they are accessable only within the class that is only within the class 
//public :- public members are accessable in the class as well as outside the class 
//protected :- protected members can be accessed in the class as well as in the class derived in that class 
// default (not specified) :- if access modifier is not specified then they are of type default and are accessible within the package



public class UsingNewKeywords {
    
}
