package InheritanceAssignmentProblem2;

public class Soccer extends Sports {
    int players = 11;

    @Override
    String getName(){
        return "Soccer class";
    }
    @Override
    public void getNumberOfTeamMembers(){
        System.out.println("Each team has "+ this.players+ " players in " +getName());
    }

}
