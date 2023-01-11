public class User {
    String name = "Gustavo";
    private String email = "gustavo@gmail.com";
    private String cpf = "90390939021";
    int age = 22;
    String studyingNow = "web devlopment";
    int actualSemester = 5;
    Address address;


    public String getEmail(){
        return this.email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setEmail(String email) {
	    this.email = email;
	}


    void passedOneYear(){
        this.age += 1;
    }


}
