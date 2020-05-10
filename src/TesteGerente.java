public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Teste");
        gerente.setSalario(700);
        gerente.setCpf("000.999.788-45");

        gerente.setSenha(89999);
        boolean autentica = gerente.autentica(89999);

        System.out.println(autentica);

        System.out.println(gerente.getBonificacao());
    }
}
