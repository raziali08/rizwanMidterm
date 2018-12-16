package design;

public abstract class EmployeeAbstract implements Employee {

public final String founderName = "Razi Ali";
static String address = "423 Foster Ave, Brooklyn, Ny 11230";

public void describeCompany(){

    System.out.println("year 2018" + founderName + "founded the company located at" + address +".");

}
    public abstract void describeCompany(String Mission);

}
