package DeepaJadhav;

class name
{
private String firstname;
private String lastname;
public name(String firtsname, String lastname) {
super();
this.firstname = firtsname;
this.lastname = lastname;
}

void validationmethod()
{

if(firstname==null && lastname==null)
{
System.out.println("entry missing");
}
else if (firstname.length()<3 && lastname.length()<3)
{
System.out.println("there should be min 3 characters");
}
else
System.out.println("firstname and lastname are :"+firstname+ " " +lastname);
}

}

public class Employee3 {

public static void main(String[] args) {

name a =new name("xyz","sampat");
a.validationmethod();

}
}