import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(1345));
        Compte cp = stub.getCompte(10);
        System.out.println(cp.getSoulde());
        System.out.println(cp.getCode());
    }
}
