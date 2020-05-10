public class SistemaInterno {

    int senha =  2222;
    public void autentica(Autenticavel funcionarioAutenticavel) {
        boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
        if (autenticou) {
            System.out.println("OK");
        } else {
            System.out.println("DENY");
        }
    }
}
