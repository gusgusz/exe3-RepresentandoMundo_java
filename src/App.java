public class App {
    public static void main(String[] args) throws Exception {
       User user = new User();
       Address newAddress = new Address();
       newAddress.state = "amazonia";
	   newAddress.city = "Manaus";
       newAddress.street = "Rua da solidão";
	   newAddress.number = 542;
       user.setEmail("gugu@gmail.com");
       user.address = newAddress;

       String result = "O usuário "+ user.name + " portador do cpf "+ user.getCpf()+ " e email "+ user.getEmail() + " mora na cidade de "+ user.address.city;
       System.out.println(result);
	
     


    }
}
