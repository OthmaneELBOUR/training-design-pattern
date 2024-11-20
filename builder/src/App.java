public class App {
    public static void main(String[] args) throws Exception {
        UserBuilder ub = new UserBuilder();

        User user = ub.username("OthmaneElb")
                    .password("COUCOU")
                    .adresse("Rue Almoravides")
                    
                    .build();
        System.out.println(ub.getUser());
        System.out.println(user);
    }
}
